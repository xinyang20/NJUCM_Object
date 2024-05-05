import javax.swing.*;
import java.awt.*;

public class WindowNumber extends JFrame {
    public JTextField input1, input2, output;
    private JButton add, sub, mul, div;

    public WindowNumber() {
        init();
        setBounds(300, 400, 250, 180);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    private void init() {
        setTitle("¼ÆËã");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        input1 = new JTextField(20);
        input2 = new JTextField(20);
        output = new JTextField(20);
        output.setEnabled(false);

        add = new JButton("¼Ó");
        sub = new JButton("¼õ");
        mul = new JButton("»ý");
        div = new JButton("³ý");

        add.addActionListener(new NumberListener(this));
        sub.addActionListener(new NumberListener(this));
        mul.addActionListener(new NumberListener(this));
        div.addActionListener(new NumberListener(this));

        add(input1);
        add(input2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(output);
    }
}