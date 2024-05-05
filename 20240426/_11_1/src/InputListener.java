import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener {
    MainWindow view;
    public InputListener(MainWindow view){
        this.view=view;
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            int number=Integer.parseInt(view.textField.getText());
            if(number>1000){
                int n=JOptionPane.showConfirmDialog(view,"数字大于1000，是否继续放入？","确认对话框",JOptionPane.YES_NO_CANCEL_OPTION);
                if(n==JOptionPane.YES_OPTION){
                    view.textArea.append(number+"\n");
                }
            }else{
                view.textArea.append(number+"\n");
            }
        }
    }

}
