public class StrategyOne implements Group{
    private int odd[]=new int[100];
    private int even[]=new int[100];
    private int odd_num=0,even_num=0;
    private int n;
    @Override
    public void group(int n) {
        this.n=n;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[even_num]=i;
                even_num++;
            }else{
                odd[odd_num]=i;
                odd_num++;
            }
        }
        showResult();
    }
    private void showResult(){
        System.out.println("将1-"+n+"按奇偶分成两组：");
        System.out.println("偶数组：");
        for(int i=0;i<even_num;i++){
            System.out.print("\t"+even[i]);
        }
        System.out.println();
        System.out.println("奇数组：");
        for(int i=0;i<odd_num;i++){
            System.out.print("\t"+odd[i]);
        }
        System.out.println();
    }
}
