public class ArmyVisitor extends Visitor{
    private int bloodPressure_max=120;
    private int heartRate_max=80;
    private int heartRate_min=60;
    private double height_min=160;
    private double vision_min=4.5;
    @Override
    public boolean visit(HealthForm healthForm) {
        if(healthForm.getBloodPressure()>bloodPressure_max||
            healthForm.getHeartRate()<heartRate_min||
            healthForm.getHeartRate()>heartRate_max||
            healthForm.getHeight()<height_min||
            healthForm.getVisionLeft()<vision_min||
            healthForm.getVisionRight()<vision_min){
            return false;
        }else{
            return true;
        }
    }
}
