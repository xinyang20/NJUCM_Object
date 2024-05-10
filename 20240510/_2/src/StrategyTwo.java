public class StrategyTwo implements Group{
    private int rem0[]=new int[100];
    private int rem1[]=new int[100];
    private int rem2[]=new int[100];
    private int rem0_num=0,rem1_num=0,rem2_num=0;
    private int n;
    @Override
    public void group(int n) {
        this.n=n;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                rem0[rem0_num]=i;
                rem0_num++;
            }else if(i%3==1){
                rem1[rem1_num]=i;
                rem1_num++;
            }else{
                rem2[rem2_num]=i;
                rem2_num++;
            }
        }
        showResult();
    }
    private void showResult(){
        System.out.println("将1-"+n+"用3求余分成三组：");
        System.out.println("被3除净的组：");
        for(int i=0;i<rem1_num;i++){
            System.out.print("\t"+rem1[i]);
        }
        System.out.println();
        System.out.println("被3除余1的组：");
        for(int i=0;i<rem1_num;i++){
            System.out.print("\t"+rem1[i]);
        }
        System.out.println();
        System.out.println("被3除余2的组：");
        for(int i=0;i<rem2_num;i++){
            System.out.print("\t"+rem2[i]);
        }
        System.out.println();
    }
}
