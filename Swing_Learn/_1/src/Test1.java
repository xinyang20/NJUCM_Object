import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test1 {
    public static void main(String[] args){
        JFrame jf=new JFrame("��½����");
        jf.setBounds(300,200,300,200);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));


        JLabel account=new JLabel("�˺ţ�",SwingConstants.LEFT);
        JLabel password=new JLabel("���룺",SwingConstants.LEFT);
        JTextField accountField=new JTextField("",20);
        JPasswordField passwordField=new JPasswordField("",20);
        passwordField.setEchoChar('*');
//        JComboBox state=new JComboBox();
//        state.addItem("--��ѡ���¼״̬--");
//        state.addItem("------����------");
//        state.addItem("------����------");
//        state.addItem("------����------");
        JTextField state=new JTextField("��½״̬",20);
        JButton loginButton=new JButton("��¼");
        loginButton.setSize(40,20);
        loginButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.setText("��½�ɹ�");
            }
        });

        jf.add(account);
        jf.add(accountField);
        jf.add(password);
        jf.add(passwordField);
        jf.add(state);
        jf.add(loginButton);

        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
