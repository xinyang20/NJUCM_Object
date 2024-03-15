public class ComputerArea {
    double area;
    public ComputerArea(){}
    public double getArea(Triangle t){
        double p = (t.a+t.b+t.c)/2.0;
        this.area=Math.sqrt(p*(p-t.a)*(p-t.b)*(p-t.c));
        t.area=this.area;
        return area;
    }
    public double getArea(Circle c){
        this.area=Math.PI*c.r*c.r;
        c.area=this.area;
        return area;
    }
    public double getArea(Rectangle r){
        this.area=r.a*r.b;
        r.area=this.area;
        return area;
    }
}
