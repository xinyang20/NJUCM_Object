package data;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class RecordOrShowRecord {
    Connection con;
    String tableName;
    int heroNumber=3;
    public RecordOrShowRecord() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (Exception e) {
        }
    }
    public void setTable(String str){
        tableName="t_"+str;
        connectDatabase();
        try{
            Statement sta=con.createStatement();
            String SQL="create table "+tableName+"(p_name varchar(50),p_time int)";
            sta.executeUpdate(SQL);
            con.close();
        }catch (SQLException e){
        }
    }
    public boolean addRecord(String name,int time){
        boolean ok =true;
        if(tableName==null)
            ok=false;
        int amount=verifyScore(time);
        if(amount>=heroNumber){
            ok=false;
        }else{
            connectDatabase();
            try{
                String SQL="insert into "+tableName+" values(?,?)";
                PreparedStatement sta = con.prepareStatement(SQL);
                sta.setString(1,name);
                sta.setInt(2,time);
                sta.executeUpdate();
                con.close();
                ok=true;
            }catch(SQLException e){
                ok=false;
            }
        }
        return ok;
    }
    public String [][] queryRecord(){
        if (tableName==null)
            return null;
        String [][] record=null;
        Statement sql;
        ResultSet rs;
        try{
            sql=
                    con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String str="select * form "+tableName+" order by p_time ";
            rs= sql.executeQuery(str);
            boolean boo=rs.last();
            if(boo==false){
                return null;
            }
            int recordAmount=rs.getRow();
            record = new String[recordAmount][2];
            rs.beforeFirst();
            int i=0;
            while(rs.next()){
                record[i][0]=rs.getString(1);
                record[i][1]=rs.getString(2);
                i++;
            }
            con.close();
        }
        catch (SQLException e){
        }
        return record;
    }
    private void connectDatabase(){
        try{
            String uri="jdbc:derby:record:create=true";
            con=DriverManager.getConnection(uri);
        }
        catch (Exception e){
        }
    }
    private int verifyScore(int time){
        if(tableName==null)
            return Integer.MAX_VALUE;
        connectDatabase();
        Statement sql;
        ResultSet rs;
        int amount=0;
        String str=
                "select * form "+tableName+" where p_time < "+time;
        try{
            sql=con.createStatement();
            rs=sql.executeQuery(str);
            while(rs.next()){
                amount++;
            }
            con.close();
        }
        catch (SQLException e){
        }
        return amount;
    }
}
