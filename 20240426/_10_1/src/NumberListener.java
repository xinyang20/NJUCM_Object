import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberListener implements ActionListener {
    WindowNumber view;
    public void setView(WindowNumber view){
        this.view=view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int num=0;
        double sum=0,mean=0;
        String str=view.input.getText();
        String[] numbers = str.split("[^\\d]+");
        num=numbers.length;
        for(int i=0;i<num;i++)
            sum=sum+Integer.parseInt(numbers[i]);
        mean=sum/num;
        view.output.setText("求和："+sum+"\n平均值："+mean+"\n");
    }
}
