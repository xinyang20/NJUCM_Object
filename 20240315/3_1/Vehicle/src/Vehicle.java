public class Vehicle {
    double speed;//代码1
    int power;//代码2
    void speedUp(int s){
        speed = speed + s;//代码3
        if(speed > 200)
            speed = 200;
    }
    void speedDown(int d){
        speed = speed - d;//代码4
        if(speed < 0)
            speed = 0;
    }
    void setPower(int p){
        power = p;//代码5
    }
    int getPower(){
        return power;//代码6
    }
    double getSpeed(){
        return speed;
    }
    void brake(){
        speed = 0;
    }
}
