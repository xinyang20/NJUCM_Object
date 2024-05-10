public class Undergraduate extends Student implements StudentManageInterface{
    private String specialty;

    public Undergraduate(String name,int age,String degree,String specialty,int fee){
        this.name=name;
        this.age=age;
        this.degree=degree;
        this.specialty=specialty;
        this.fee=fee;
    }

    @Override
    void show() {
        System.out.print("姓名："+name+" ");
        System.out.print("年龄："+age+" ");
        System.out.print("学位："+degree+" ");
        System.out.print("专业："+specialty+" ");
        System.out.println("学费："+fee);
    }

    @Override
    public void setFee(int fee) {
        this.fee=fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
}
