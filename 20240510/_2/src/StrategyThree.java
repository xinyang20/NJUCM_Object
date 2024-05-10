public class StrategyThree implements Group{
    private int yes[]=new int[100];
    private int no[]=new int[100];
    private int yes_num=0,no_num=0;
    private int n;
    @Override
    public void group(int n) {
        this.n=n;
        for(int i=1;i<=n;i++){
            if(i%10==3||i%10==4||i%10==5||i%10==7){
                yes[yes_num]=i;
                yes_num++;
            }else{
                no[no_num]=i;
                no_num++;
            }
        }
        showResult();
    }
    private void showResult(){
        System.out.println("将1-"+n+"按个位是否是2，4，5，7分成两组：");
        System.out.println("个位是2，4，5，7的组：");
        for(int i=0;i<yes_num;i++){
            System.out.print("\t"+yes[i]);
        }
        System.out.println();
        System.out.println("个位不是2，4，5，7的组：");
        for(int i=0;i<no_num;i++){
            System.out.print("\t"+no[i]);
        }
        System.out.println();
    }
}
