import java.sql.*;
public class QueyExcel {
    public static void main(String args[]) {
        try{
            Class.forName("sun.jdbc.odbc.JKbcOdbcDriver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        Connection con;
        Statement sql;
        ResultSet rs;
        try{
            con=DriverManager.getConnection("jdbc:odbc:myExcel","","");
            DatabaseMetaData metaData= con.getMetaData();
            ResultSet rsl=metaData.getColumns(null,null,"message",null);
            int �ֶθ���=0;
            while(rsl.next()){
                �ֶθ���++;
            }
            sql=con.createStatement();
            rs= sql.executeQuery("select * from message");
            while (rs.next()){
                for (int k=1;k<=�ֶθ���;k++){
                    System.out.println(" "+rs.getString(k)+" ");
                }
                System.out.println(" ");
            }
        }
        catch (SQLException e){
            System.out.println(""+e);
        }
    }
}
