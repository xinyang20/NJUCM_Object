import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public JTextArea textArea;
    public JTextField textField;
    private InputListener listener;
    public MainWindow(String name){
        super(name);
        init();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBounds(300,200,250,200);

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    private void init(){
        listener=new InputListener(this);
        textArea=new JTextArea(5,20);
        textArea.setEnabled(false);
        textArea.setLineWrap(true);

        textField=new JTextField(20);
        textField.addKeyListener(listener);


        add(textField);
        add(textArea);

    }
}
