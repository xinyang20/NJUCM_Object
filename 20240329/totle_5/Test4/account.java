package step4;
import java.util.Date;
import java.util.List;
public abstract class account {
    /******** Begin ********/
    //创建成员变量
    String name;
    String type;
    String accountNumber;
    String description;
    Person belongto;
    String currency;
    List dealList;
    

    //创建 getReport 方法
    abstract public String getReport(Date start,Date End,int reportType);

    /********  End  ********/
}
