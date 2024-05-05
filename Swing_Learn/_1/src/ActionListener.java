import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionListener {
    public static void main(String[] args){
        JFrame jFrame=new JFrame("事件监听测试");
        jFrame.setBounds(400,300,500,500);
        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextArea jTextArea=new JTextArea(20,30);
        jTextArea.setLineWrap(true);
        JButton jButton=new JButton("暴打马老师");
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append("年轻人好自为之");
            }
        });

        jFrame.add(jTextArea);
        jFrame.add(jButton);


        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
