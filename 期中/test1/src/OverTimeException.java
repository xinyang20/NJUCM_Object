public class OverTimeException extends Exception{
    private String message;
    private int maxLength;
    private int Len;
    public OverTimeException(int len,int max){
        super();
        Len=len;
        maxLength=max;
        message=new String("运行超时！");
    }
    public String toString(){
        return new String(message+"最大时长为："+maxLength+",当前时长为："+Len);
    }

}
