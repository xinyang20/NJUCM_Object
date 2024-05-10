public class Communication {
    private ComputeLength process[]=new ComputeLength[3];
    private int totalLen;
    private final int maxLength=20;
    public Communication(ComputeLength ... c){
        totalLen=0;
        process[0]=c[0];
        process[1]=c[1];
        process[2]=c[2];
    }
    public void setProcess(ComputeLength ... c){
        process[0]=c[0];
        process[1]=c[1];
        process[2]=c[2];
    }
    public void ExecuteProcess(){
        try {
            for (ComputeLength cc : process) {
                totalLen += cc.computeLen();
            }
            if(totalLen>maxLength){
                throw new OverTimeException(totalLen,maxLength);
            }
            System.out.println("运行成功，总耗时："+totalLen+"秒");
        }catch(OverTimeException e){
            System.out.println(e.toString());
        }
    }


}
