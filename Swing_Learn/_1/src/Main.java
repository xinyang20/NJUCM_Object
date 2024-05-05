import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("JFrame");
        jFrame.setBounds(400,200,500,400);
//        jFrame.setLayout(new FlowLayout());//流式布局

//        JDialog jDialog=new JDialog(jFrame,"dialog");
//        jDialog.setBounds(400,200,200,100);
//        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        jDialog.setVisible(true);


//        常见容器

//        Panel
//        JButton jButton1=new JButton("按钮1");
//        JButton jButton2=new JButton("按钮2");
//        JButton jButton3=new JButton("按钮3");
//        JPanel jPanel=new JPanel(new FlowLayout());
//        jPanel.add(jButton1);
//        jPanel.add(jButton2);
//        jPanel.add(jButton3);
//        jPanel.setVisible(true);
//        jFrame.add(jPanel);

//        常见组件

//        标签
//        JLabel jLabel=new JLabel("标签1",SwingConstants.LEFT);
//        jFrame.add(jLabel);


//        按钮设置
//        JButton jButton1=new JButton("按钮1");
//        jButton1.setEnabled(false);
//        jButton1.setBorderPainted(false);
//        jFrame.add(jButton1);

//        单选框
//        JRadioButton jRadioButton1=new JRadioButton("男");
//        JRadioButton jRadioButton2=new JRadioButton("女");
//        ButtonGroup buttonGroup=new ButtonGroup();
//        buttonGroup.add(jRadioButton1);
//        buttonGroup.add(jRadioButton2);
//        jFrame.add(jRadioButton1);
//        jFrame.add(jRadioButton2);

//        多选框
//        JCheckBox jCheckBox1=new JCheckBox("睡觉",true);
//        JCheckBox jCheckBox2=new JCheckBox("吃饭",false);
//        JCheckBox jCheckBox3=new JCheckBox("打豆豆",false);
//        JCheckBox jCheckBox4=new JCheckBox("敲代码",true);
//        JCheckBox jCheckBox5=new JCheckBox("玩手机",true);
//        jFrame.add(jCheckBox1);
//        jFrame.add(jCheckBox2);
//        jFrame.add(jCheckBox3);
//        jFrame.add(jCheckBox4);
//        jFrame.add(jCheckBox5);

//        下拉列表
//        JComboBox jComboBox=new JComboBox();
//        jComboBox.addItem("--请选择学历--");
//        jComboBox.addItem("高中");
//        jComboBox.addItem("本科");
//        jComboBox.addItem("硕博");
//        jFrame.add(jComboBox);

//        菜单
//        JMenuBar jMenuBar=new JMenuBar();
//        JMenu jMenu1=new JMenu("菜单1");
//        JMenu jMenu2=new JMenu("菜单2");
//        JMenu jMenu3=new JMenu("菜单3");
//        JMenuItem jMenuItem1_1=new JMenuItem("选项一");
//        JMenuItem jMenuItem1_2=new JMenuItem("选项二");
//        JMenuItem jMenuItem1_3=new JMenuItem("选项三");
//        JMenuItem jMenuItem2_1=new JMenuItem("选项一");
//        JMenuItem jMenuItem2_2=new JMenuItem("选项二");
//        JMenuItem jMenuItem2_3=new JMenuItem("选项三");
//        JMenuItem jMenuItem3_1=new JMenuItem("选项一");
//        JMenuItem jMenuItem3_2=new JMenuItem("选项二");
//        JMenuItem jMenuItem3_3=new JMenuItem("选项三");
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

//        文本
//        JTextField jTextField=new JTextField("请输入",22);
//        JLabel jLabel1=new JLabel("账号：",SwingConstants.LEFT);
//        jFrame.add(jLabel1);
//        jFrame.add(jTextField);

//        密码框
//        JPasswordField jPasswordField=new JPasswordField("",20);
//        jPasswordField.setEchoChar('*');
//        JLabel jLabel2=new JLabel("密码：",SwingConstants.LEFT);
//        jFrame.add(jLabel2);
//        jFrame.add(jPasswordField);

//        文本域
//        JTextArea jTextArea=new JTextArea(20,30);
//        jTextArea.setLineWrap(true);
//        jFrame.add(jTextArea);
//        String text=jTextArea.getText();



//        常见布局

//        流式布局
//        jFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
//        JButton jButton1=new JButton("按钮1");
//        JButton jButton2=new JButton("按钮2");
//        JButton jButton3=new JButton("按钮3");
//        jFrame.add(jButton1);
//        jFrame.add(jButton2);
//        jFrame.add(jButton3);
//        jFrame.setVisible(true);

//        边界布局
//        jFrame.setLayout(new BorderLayout());
//        JButton jButton1=new JButton("东");
//        JButton jButton2=new JButton("西");
//        JButton jButton3=new JButton("南");
//        JButton jButton4=new JButton("北");
//        JButton jButton5=new JButton("中");
//        jFrame.add(jButton1,BorderLayout.EAST);
//        jFrame.add(jButton2,BorderLayout.WEST);
//        jFrame.add(jButton3,BorderLayout.SOUTH);
//        jFrame.add(jButton4,BorderLayout.NORTH);
//        jFrame.add(jButton5,BorderLayout.CENTER);
//        jFrame.setVisible(true);

//        网格布局
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