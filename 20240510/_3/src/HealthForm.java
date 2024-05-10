public class HealthForm {
    private int bloodPressure;
    private int heartRate;
    private double height;
    private double visionLeft;
    private double visionRight;
    public int getBloodPressure() {
        return bloodPressure;
    }
    public int getHeartRate() {
        return heartRate;
    }
    public double getHeight() {
        return height;
    }
    public double getVisionLeft() {
        return visionLeft;
    }
    public double getVisionRight() {
        return visionRight;
    }
    public HealthForm(int bloodPressure,int heartRate,double height,double visionLeft,double visionRight){
        this.bloodPressure=bloodPressure;
        this.heartRate=heartRate;
        this.height=height;
        this.visionLeft=visionLeft;
        this.visionRight=visionRight;
    }
    public void accept(Visitor visitor){
        System.out.print("体检结果：");
        boolean result=visitor.visit(this);
        if(result==true)
            System.out.println("合格");
        else
            System.out.println("不合格");
    }
}
