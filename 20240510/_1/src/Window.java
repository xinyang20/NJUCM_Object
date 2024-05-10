abstract public class Window {
    private double width,height;
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w){
        width=w;
    }
    public void setHeight(double h){
        height=h;
    }
    abstract public String getMaterial();
}
