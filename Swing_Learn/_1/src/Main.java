import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JFrame");
        jFrame.setBounds(400,200,500,400);
//        jFrame.setLayout(new FlowLayout());//��ʽ����

//        JDialog jDialog=new JDialog(jFrame,"dialog");
//        jDialog.setBounds(400,200,200,100);
//        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        jDialog.setVisible(true);


//        ��������

//        Panel
//        JButton jButton1=new JButton("��ť1");
//        JButton jButton2=new JButton("��ť2");
//        JButton jButton3=new JButton("��ť3");
//        JPanel jPanel=new JPanel(new FlowLayout());
//        jPanel.add(jButton1);
//        jPanel.add(jButton2);
//        jPanel.add(jButton3);
//        jPanel.setVisible(true);
//        jFrame.add(jPanel);

//        �������

//        ��ǩ
//        JLabel jLabel=new JLabel("��ǩ1",SwingConstants.LEFT);
//        jFrame.add(jLabel);


//        ��ť����
//        JButton jButton1=new JButton("��ť1");
//        jButton1.setEnabled(false);
//        jButton1.setBorderPainted(false);
//        jFrame.add(jButton1);

//        ��ѡ��
//        JRadioButton jRadioButton1=new JRadioButton("��");
//        JRadioButton jRadioButton2=new JRadioButton("Ů");
//        ButtonGroup buttonGroup=new ButtonGroup();
//        buttonGroup.add(jRadioButton1);
//        buttonGroup.add(jRadioButton2);
//        jFrame.add(jRadioButton1);
//        jFrame.add(jRadioButton2);

//        ��ѡ��
//        JCheckBox jCheckBox1=new JCheckBox("˯��",true);
//        JCheckBox jCheckBox2=new JCheckBox("�Է�",false);
//        JCheckBox jCheckBox3=new JCheckBox("�򶹶�",false);
//        JCheckBox jCheckBox4=new JCheckBox("�ô���",true);
//        JCheckBox jCheckBox5=new JCheckBox("���ֻ�",true);
//        jFrame.add(jCheckBox1);
//        jFrame.add(jCheckBox2);
//        jFrame.add(jCheckBox3);
//        jFrame.add(jCheckBox4);
//        jFrame.add(jCheckBox5);

//        �����б�
//        JComboBox jComboBox=new JComboBox();
//        jComboBox.addItem("--��ѡ��ѧ��--");
//        jComboBox.addItem("����");
//        jComboBox.addItem("����");
//        jComboBox.addItem("˶��");
//        jFrame.add(jComboBox);

//        �˵�
//        JMenuBar jMenuBar=new JMenuBar();
//        JMenu jMenu1=new JMenu("�˵�1");
//        JMenu jMenu2=new JMenu("�˵�2");
//        JMenu jMenu3=new JMenu("�˵�3");
//        JMenuItem jMenuItem1_1=new JMenuItem("ѡ��һ");
//        JMenuItem jMenuItem1_2=new JMenuItem("ѡ���");
//        JMenuItem jMenuItem1_3=new JMenuItem("ѡ����");
//        JMenuItem jMenuItem2_1=new JMenuItem("ѡ��һ");
//        JMenuItem jMenuItem2_2=new JMenuItem("ѡ���");
//        JMenuItem jMenuItem2_3=new JMenuItem("ѡ����");
//        JMenuItem jMenuItem3_1=new JMenuItem("ѡ��һ");
//        JMenuItem jMenuItem3_2=new JMenuItem("ѡ���");
//        JMenuItem jMenuItem3_3=new JMenuItem("ѡ����");
//        jMenu1.add(jMenuItem1_1);
//        jMenu1.add(jMenuItem1_2);
//        jMenu1.add(jMenuItem1_3);
//        jMenu2.add(jMenuItem2_1);
//        jMenu2.add(jMenuItem2_2);
//        jMenu2.add(jMenuItem2_3);
//        jMenu3.add(jMenuItem3_1);
//        jMenu3.add(jMenuItem3_2);
//        jMenu3.add(jMenuItem3_3);
//        jMenuBar.add(jMenu1);
//        jMenuBar.add(jMenu2);
//        jMenuBar.add(jMenu3);
//        jFrame.add(jMenuBar);

//        �ı�
//        JTextField jTextField=new JTextField("������",22);
//        JLabel jLabel1=new JLabel("�˺ţ�",SwingConstants.LEFT);
//        jFrame.add(jLabel1);
//        jFrame.add(jTextField);

//        �����
//        JPasswordField jPasswordField=new JPasswordField("",20);
//        jPasswordField.setEchoChar('*');
//        JLabel jLabel2=new JLabel("���룺",SwingConstants.LEFT);
//        jFrame.add(jLabel2);
//        jFrame.add(jPasswordField);

//        �ı���
//        JTextArea jTextArea=new JTextArea(20,30);
//        jTextArea.setLineWrap(true);
//        jFrame.add(jTextArea);
//        String text=jTextArea.getText();



//        ��������

//        ��ʽ����
//        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        JButton jButton1=new JButton("��ť1");
//        JButton jButton2=new JButton("��ť2");
//        JButton jButton3=new JButton("��ť3");
//        jFrame.add(jButton1);
//        jFrame.add(jButton2);
//        jFrame.add(jButton3);
//        jFrame.setVisible(true);

//        �߽粼��
//        jFrame.setLayout(new BorderLayout());
//        JButton jButton1=new JButton("��");
//        JButton jButton2=new JButton("��");
//        JButton jButton3=new JButton("��");
//        JButton jButton4=new JButton("��");
//        JButton jButton5=new JButton("��");
//        jFrame.add(jButton1,BorderLayout.EAST);
//        jFrame.add(jButton2,BorderLayout.WEST);
//        jFrame.add(jButton3,BorderLayout.SOUTH);
//        jFrame.add(jButton4,BorderLayout.NORTH);
//        jFrame.add(jButton5,BorderLayout.CENTER);
//        jFrame.setVisible(true);

//        ���񲼾�
//        jFrame.setLayout(new GridLayout(3,3,10,20));
//        JButton jButton1=new JButton("A");
//        JButton jButton2=new JButton("B");
//        JButton jButton3=new JButton("C");
//        JButton jButton4=new JButton("D");
//        JButton jButton5=new JButton("E");
//        JButton jButton6=new JButton("F");
//        JButton jButton7=new JButton("G");
//        JButton jButton8=new JButton("H");
//        JButton jButton9=new JButton("I");
//        jFrame.add(jButton1);
//        jFrame.add(jButton2);
//        jFrame.add(jButton3);
//        jFrame.add(jButton4);
//        jFrame.add(jButton5);
//        jFrame.add(jButton6);
//        jFrame.add(jButton7);
//        jFrame.add(jButton8);
//        jFrame.add(jButton9);
//        jFrame.setVisible(true);


        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}