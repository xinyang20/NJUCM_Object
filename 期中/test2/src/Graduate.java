public class Graduate extends Student implements StudentManageInterface,TeacherManageInterface{
    private String direction;
    private int pay;
    public Graduate(String name,int age,String degree,String direction,int fee,int pay){
        this.name=name;
        this.age=age;
        this.degree=degree;
        this.direction=direction;
        this.fee=fee;
        this.pay=pay;
    }

    @Override
    void show() {
        System.out.print("姓名："+name+" ");
        System.out.print("年龄："+age+" ");
        System.out.print("学位："+degree+" ");
        System.out.print("研究方向："+direction+" ");
        System.out.print("学费："+fee+" ");
        System.out.println("月工资："+pay);
    }

    @Override
    public void setFee(int fee) {
        this.fee=fee;
    }

    @Override
    public int getFee() {
        return fee;
    }

    @Override
    public void setPay(int pay) {
        this.pay=pay;
    }

    @Override
    public int getPay() {
        return pay;
    }
}
