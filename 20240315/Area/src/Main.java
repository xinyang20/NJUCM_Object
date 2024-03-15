public class Main {
    public static void main(String[] args) {
        ComputerArea area = new ComputerArea();

        Triangle image1=new Triangle(3,4,5);
        System.out.println(area.getArea(image1));

        Rectangle image2 = new Rectangle(4,5);
        System.out.println(area.getArea(image2));

        Circle image3 = new Circle(3);
        System.out.println(area.getArea(image3));
    }
}