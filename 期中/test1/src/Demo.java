public class Demo {
    public static void main(String args[]){
        Pilot pilot=new Pilot(5);
//        Feedback feedback=new Feedback(5);//无异常测试数据
        Feedback feedback=new Feedback(25);//异常测试数据
        DataTrans dataTrans=new DataTrans(5);

        Communication communication=new Communication(pilot,feedback,dataTrans);
        communication.ExecuteProcess();
    }
}
