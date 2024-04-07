abstract class Employee{
    public abstract double earnings();
}
class YearWorker extends Employee{
    public double earnings(){
        return 12000;//代码1
    }
}
class MonthWorker extends Employee{
    public double earnings(){
        return 12*2300;//代码2
    }
}
class WeekWorker extends Employee{
    public double earnings(){
        return 52*780;//代码3
    }
}
class Company{
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee){
        this.employee=employee;
    }
    public double salariesPay(){
        salaries=0;
        for(int i=0;i<employee.length;i++){//代码4
            salaries+=employee[i].earnings();
        }
        return salaries;
    }
}
public class CompanySalary {
    public static void main(String[] args) {
        Employee [] employee=new Employee[29];
        for(int i=0;i< employee.length;i++){
            if(i%3==0)
                employee[i]=new WeekWorker();
            else if(i%3==1)
                employee[i]=new MonthWorker();
            else if(i%3==2)
                employee[i]=new YearWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额："+company.salariesPay()+"元");
    }
}