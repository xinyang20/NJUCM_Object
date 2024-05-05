import javax.swing.*;
import java.awt.*;

public class WindowNumber extends JFrame {
    JTextField input;
    JTextArea output;
    NumberListener listener;
    public WindowNumber(){
        init();
        setBounds(300,400,300,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void init(){
        setTitle("º∆À„");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        listener=new NumberListener();
        listener.setView(this);
        input=new JTextField(20);
//        input.setLineWrap(true);
        output=new JTextArea(2,30);
        output.setLineWrap(true);
        output.setEnabled(false);
        input.addActionListener(listener);
        add(input);
        add(output);
    }
}
