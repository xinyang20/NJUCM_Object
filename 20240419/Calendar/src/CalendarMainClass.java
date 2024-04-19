public class CalendarMainClass {
    public static void main(String[] args) {
        CalendarFrame frame =new CalendarFrame();
        frame.setBounds(100,100,360,300);
        frame.setVisible(true);
        frame.setYearAndMonth(2015,5);
    }
}