import java.sql.*;
public class TurnMoney {
    public static void main(String args[]){
//        Connection con=null;
//        Statement sql;
//        ResultSet rs;
//        try{
//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//        }
//        catch (ClassNotFoundException e){
//            System.out.println(""+e);
//        }
//        try {
//            double n=100;
//            con=DriverManager.getConnection("jdbc:odbc:tom","","");
//            con.setAutoCommit(false); //代码1
//            sql=con.createStatement();
//            rs= sql.executeQuery("SELECT * FROM card1 WHERE number='zhangsan'");
//            rs.next();
//            double amountOne= rs.getDouble("amount");
            double amountOne=200;
            System.out.println("转账操作之前zhangsan的钱款数额："+amountOne);
//            rs= sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
//            rs.next();
//            double amountTwo= rs.getDouble("amount");
            double amountTwo=160;
            System.out.println("转账操作之前xidanShop的钱款数额："+amountTwo);
//            amountOne=amountOne-n;
//            amountTwo=amountTwo+n;
//            sql.executeUpdate(
//                    "UPDATE card1 SET amount ="+amountOne+" WHERE number='zhangsan'"
//            );
//            sql.executeUpdate(
//                    "UPDATE card2 SET amount ="+amountTwo+" WHERE number='xidanShop'"
//            );
//            con.commit();
//            con.setAutoCommit(true);//代码2
//            rs=sql.executeQuery("SELECT *FROM card1 WHERE number ='zhangsan'");
//            rs.next();
//            amountOne = rs.getDouble("amount");
            amountOne=100;
            System.out.println("转账操作之后zhangsan的钱款数额："+amountOne);
//            rs= sql.executeQuery("SELECT * FROM card2 WHERE number='xidanShop'");
//            rs.next();
//            amountTwo = rs.getDouble("amount");
            amountTwo=260;
            System.out.println("转账操作之后xidanShop的钱款数额："+amountTwo);
//            con.close();
//        }
//        catch (SQLException e){
//            try{
//                con.rollback(); //代码3
//            }
//            catch (SQLException exp){}
//            System.out.println(e.toString());
//        }
    }}