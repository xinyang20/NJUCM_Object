public class Familiy {
    TV homeTV;
    void buyTV(TV tv){
        homeTV=tv;//代码1
    }
    void remoteControl(int m){
        homeTV.setChannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}
