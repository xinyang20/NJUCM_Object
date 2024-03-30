package step4;
public class stockdeal extends deal {
    /******** Begin ********/
    
    //创建成员变量
    private boolean isBuy = true;
    private String stockNumber = " ";
    private String stockName = " ";
    

    //创建 parseString 方法
    public deal parseString(String dealString){
        return new normaldeal();
    }
    
    //创建 toPlanText 方法
    public String toPlanText(){
        return " ";
    }

    //创建 isBuy 方法
    public boolean isBuy(){
        return true;
    }  
    
    
    /********  End  ********/
}
