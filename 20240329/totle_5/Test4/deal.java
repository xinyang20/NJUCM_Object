package step4;

import java.util.Date;
public abstract class deal {
    /******** Begin ********/
    //创建成员变量
    public Date dealDate = new Date();
    String dealtype = " ";
    Person person = null;
    String accountName = " ";
    float amount = 0.0f;
    String category = " ";
    String description = " ";
    
    
    //创建 parseString 方法
    public abstract deal parseString(String dealString);

    //创建 toPlanText 方法
    public abstract String toPlanText();
    

    /********  End  ********/
}
