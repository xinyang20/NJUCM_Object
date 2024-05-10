public class Main {
    public static void main(String[] args) {
        Window win[]=new Window[10];
        win[0]=new Woodwindow();win[0].setHeight(40);win[0].setWidth(30);
        win[1]=new AluminumWindow();win[1].setHeight(41);win[1].setWidth(31);
        win[2]=new Woodwindow();win[2].setHeight(42);win[2].setWidth(32);
        win[3]=new AluminumWindow();win[3].setHeight(39);win[3].setWidth(29);
        win[4]=new Woodwindow();win[4].setHeight(38);win[4].setWidth(28);
        win[5]=new AluminumWindow();win[5].setHeight(40);win[5].setWidth(30);
        win[6]=new Woodwindow();win[6].setHeight(12);win[6].setWidth(30);
        win[7]=new AluminumWindow();win[7].setHeight(12);win[7].setWidth(9);
        win[8]=new Woodwindow();win[8].setHeight(40);win[8].setWidth(30);
        win[9]=new AluminumWindow();win[9].setHeight(3);win[9].setWidth(6);
        Building building=new Building();
        building.use(win);
    }
}