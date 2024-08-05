public class Volume {
    Area area;
    float height;
    Volume(Area area,float height){
        this.area=area;
        this.height=height;
    }
    public double getVolume(){
        return (area.getArea*height);
    }
}