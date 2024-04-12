public class BinException extends Exception{
    public String message;
    public BinException(String s){
        message=s;
    }
    public void toShow() {
        System.out.println(message+"不是合法的二进制数");
    }
}
