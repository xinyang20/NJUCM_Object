import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
public class Teacher implements ActionListener{
    int numebrOne,numberTwo;
    String operator="";
    boolean isRight;
    Random random;
    int maxInteger;
    JTextField textOne,textTwo,textResult;
    JLabel operatorLabal,message;
    Teacher(){
        random=new Random();
    }
    public void setMaxInteger(int n){
        maxInteger=n;
    }
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("getProblem")){
            numebrOne=random.nextInt(maxInteger)+1;
            numberTwo= random.nextInt(maxInteger)+1;
            double d=Math.random();
            if(d<=0.333)
                operator="+";
            else if(d<=0.667)
                operator="-";
            else
                operator="*";
            textOne.setText(""+numebrOne);
            textTwo.setText(""+numberTwo);
            operatorLabal.setText(operator);
            message.setText("请回答");
            textResult.setText(null);
        }
        else if(str.equals("answer")){
            String answer=textResult.getText();
            try{
                int result=Integer.parseInt(answer);
                if(operator.equals("+")){
                    if(result==numebrOne+numberTwo)
                        message.setText("你回答正确");
                    else
                        message.setText("你回答错误");
                }
                else if(operator.equals("-")){
                    if(result==numebrOne-numberTwo)
                        message.setText("你回答正确");
                    else
                        message.setText("你回答错误");
                }
                else if(operator.equals("*")){
                    if(result==numebrOne*numberTwo)
                        message.setText("你回答正确");
                    else
                        message.setText("你回答错误");
                }
            }
            catch (NumberFormatException ex){
                message.setText("请输入数字字符");
            }
        }
    }
    public void setJTextField(JTextField ... t){
        textOne=t[0];
        textTwo=t[1];
        textResult=t[2];
    }
    public void setJLabel(JLabel ... label){
        operatorLabal=label[0];
        message=label[1];
    }
}
