public class Main {
    public static void main(String[] args) {
        System.out.println("体检报告1：");
        HealthForm healthForm1=new HealthForm(130,90,155,4.0,4.0);
        System.out.println("军队体检：");
        healthForm1.accept(new ArmyVisitor());
        System.out.println("工厂体检：");
        healthForm1.accept(new FactoryVisitor());

        System.out.println("体检报告2：");
        HealthForm healthForm2=new HealthForm(115,66,165,4.8,4.9);
        System.out.println("军队体检：");
        healthForm2.accept(new ArmyVisitor());
        System.out.println("工厂体检：");
        healthForm2.accept(new FactoryVisitor());

        System.out.println("体检报告3：");
        HealthForm healthForm3=new HealthForm(145,114,135,4.8,4.9);
        System.out.println("军队体检：");
        healthForm3.accept(new ArmyVisitor());
        System.out.println("工厂体检：");
        healthForm3.accept(new FactoryVisitor());
    }
}