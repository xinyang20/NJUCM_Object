import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonLisner implements ActionListener {
    MainWindow view;
    ButtonLisner(MainWindow view){
        this.view=view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Color color=JColorChooser.showDialog(view,"ѡ���ı���ɫ",null);
        if(color!=null)
            view.textArea.setForeground(color);
    }
}
