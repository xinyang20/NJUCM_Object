import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test1 {
    public static void main(String[] args){
        JFrame jf=new JFrame("µÇÂ½½çÃæ");
        jf.setBounds(300,200,300,200);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));


        JLabel account=new JLabel("ÕËºÅ£º",SwingConstants.LEFT);
        JLabel password=new JLabel("ÃÜÂë£º",SwingConstants.LEFT);
        JTextField accountField=new JTextField("",20);
        JPasswordField passwordField=new JPasswordField("",20);
        passwordField.setEchoChar('*');
//        JComboBox state=new JComboBox();
//        state.addItem("--ÇëÑ¡ÔñµÇÂ¼×´Ì¬--");
//        state.addItem("------ÔÚÏß------");
//        state.addItem("------ÒþÉí------");
//        state.addItem("------ÀëÏß------");
        JTextField state=new JTextField("µÇÂ½×´Ì¬",20);
        JButton loginButton=new JButton("µÇÂ¼");
        loginButton.setSize(40,20);
        loginButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state.setText("µÇÂ½³É¹¦");
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
