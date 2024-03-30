package step4;
public class transferdeal extends deal {
    /******** Begin ********/
    //创建成员变量
    private account inputAccount;
    private account outputAccount;


    //创建 toPlanText 方法
    public String toPlanText(){
        return " ";
    }
    
    //创建 parseString 方法
    public deal parseString(String dealString){
        return new normaldeal();
    }

    

    /********  End  ********/
}
