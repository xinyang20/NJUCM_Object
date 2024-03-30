package step4;
public class normaldeal extends deal{
    /******** Begin ********/
    //创建无参构造方法
    public normaldeal(){
    }

    //创建 parseString 方法
    public deal parseString(String dealString){
        return new normaldeal();
    }

    //创建 toPlanText 方法
    public String toPlanText(){
        return " ";
    }

    /********  End  ********/
    
}
