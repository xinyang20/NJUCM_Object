import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class CalendarFrame extends JFrame implements ActionListener{
    JLabel labelDay[]=new JLabel[42];
    JButton titleName[]=new JButton[7];
    String name[]={"日","一","二","三","四","五","六"};
    JButton nextMonth,previousMonth;
    CalendarBean calendar;
    JLabel showMessage=new JLabel("",JLabel.CENTER);
    JTextField input;
    int year=2011,month=2;
    public CalendarFrame(){
//        input=new JTextField();
        JPanel pCenter=new JPanel();
        pCenter.setLayout(new GridLayout(7,7));//代码1
        for(int i=0;i<7;i++){
            titleName[i]=new JButton(name[i]);
            titleName[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
            pCenter.add(titleName[i]);
        }
        for(int i=0;i<42;i++){
            labelDay[i]=new JLabel("",JLabel.CENTER);
            labelDay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
            pCenter.add(labelDay[i]);//代码2
        }
        calendar=new CalendarBean();
        nextMonth=new JButton("下月");
        previousMonth=new JButton("上月");
        nextMonth.addActionListener(this);
        previousMonth.addActionListener(this);
        JPanel pNorth=new JPanel(),
                pSouth=new JPanel();
        pNorth.add(previousMonth);
        pNorth.add(nextMonth);
        pSouth.add(showMessage);
        add(pCenter,BorderLayout.CENTER);
        add(pNorth,BorderLayout.NORTH);//代码3
        add(pSouth,BorderLayout.SOUTH);//代码4
        setYearAndMonth(year,month);//???
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void setYearAndMonth(int y,int m){
        calendar.setYear(y);
        calendar.setMonth(m);
        String day[]= calendar.getCalendar();
        for(int i=0;i<42;i++)
            labelDay[i].setText(day[i]);
        showMessage.setText("日历："+calendar.getYear()+"年"+calendar.getMonth()+"月");
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==nextMonth){
            month=month+1;
            if(month>12)
                month=1;
            calendar.setMonth(month);
            String day[]= calendar.getCalendar();
            for(int i=0;i<42;i++){
                labelDay[i].setText(day[i]);
            }
        }
        else if(e.getSource()==previousMonth){
            month=month-1;
            if(month<1)
                month=12;
            calendar.setMonth(month);
            String day[]= calendar.getCalendar();
            for(int i=0;i<42;i++)
                labelDay[i].setText(day[i]);
        }
        showMessage.setText("日历："+calendar.getYear()+"年"+calendar.getMonth()+"月");
    }
}