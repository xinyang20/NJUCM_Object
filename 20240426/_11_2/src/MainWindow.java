import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    JTextArea textArea;
    JButton button;
    ButtonLisner listner=new ButtonLisner(this);
    public MainWindow(String name){
        super(name);
        init();
        setBounds(300,400,450,410);
//        pack();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void init(){
        textArea=new JTextArea(20,30);
        textArea.setLineWrap(true);
        textArea.setEnabled(true);

        button=new JButton("ÑÕÉ«");
        button.addActionListener(listner);

        add(textArea);
        add(button);
    }
}
