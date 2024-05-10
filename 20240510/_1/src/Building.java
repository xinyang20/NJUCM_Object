public class Building {
    Window window[]=new Window[10];
    int window_num=0;
    double std_height=40,std_width=30;
    public void use(Window []w){
        for(int i=0;i<w.length;i++){
            if(Math.abs(w[i].getHeight()-std_height)<3&&
                    (Math.abs(w[i].getWidth()-std_width)<3)){
                window[window_num]=w[i];
                System.out.println("第"+(window_num+1)+"层窗户时："+window[window_num].getMaterial());
                window_num+=1;
            }
        }
    }
}
