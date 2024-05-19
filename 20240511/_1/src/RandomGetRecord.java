import java.sql.*;
import java.util.*;

public class RandomGetRecord {
    public static  void  main(String args[]){
        int wantRecordAmount=10;
        Random random=new Random();
        try{//代码1
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            String uri="jdbc:mysql://localhost/shop?useSSL=false&serverTimezone=GMT&characterEncoding=utf-8";
            String id="root";
            String passwprd="";
            con=DriverManager.getConnection(uri,id,passwprd);
            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs= sql.executeQuery("SELECT * FROM goods");//代码2
            rs.last();
            int count=rs.getRow();
            Vector<Integer>vertor=new Vector<Integer>();
            for(int i=1;i<=count;i++){
                vertor.add(i);
            }
            int itemAmount=Math.min(wantRecordAmount,count);
            System.out.println("随机抽取"+itemAmount+"条记录。");
            double sum=0,n=itemAmount;
            while(itemAmount>0){
                int randomIndex=random.nextInt(vertor.size());
                int index=(vertor.elementAt(randomIndex).intValue());
                rs.absolute(index);//代码3
                String number= rs.getString(1);
                String name=rs.getString(2);
                java.util.Date date=rs.getDate(3);
                double price=rs.getDouble(4);
                sum=sum+price;
                itemAmount--;
                vertor.removeElementAt(randomIndex);
            }
            con.close();
            double aver=sum/n;
            System.out.println("均价:"+aver+"元");
        }
        catch (SQLException e){
            System.out.println(" "+e);
        }
    }
}
