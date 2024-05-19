import java.sql.*;
import java.util.Random;
import java.util.Vector;

public class StudentScore {
    public static  void  main(String args[]){
        int wantRecordAmount=20;
        Random random=new Random();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            String uri="jdbc:mysql://localhost/student?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8";
            String id="root";
            String passwprd="";
            con= DriverManager.getConnection(uri,id,passwprd);
            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs= sql.executeQuery("SELECT * FROM score");//代码2
            rs.last();
            int count=rs.getRow();
            Vector<Integer> vertor=new Vector<Integer>();
            for(int i=1;i<=count;i++){
                vertor.add(i);
            }
            int itemAmount=Math.min(wantRecordAmount,count);
            System.out.println("随机抽取"+itemAmount+"条成绩。");
            double sum=0,n=itemAmount;
            while(itemAmount>0){
                int randomIndex=random.nextInt(vertor.size());
                int index=(vertor.elementAt(randomIndex).intValue());
                rs.absolute(index);
                String Id= rs.getString(1);
                String name=rs.getString(2);
                double score=rs.getDouble(3);
                sum=sum+score;
                itemAmount--;
                vertor.removeElementAt(randomIndex);
            }
            con.close();
            double aver=sum/n;
            System.out.println("均分:"+aver);
        }
        catch (SQLException e){
            System.out.println(" "+e);
        }
    }
}
