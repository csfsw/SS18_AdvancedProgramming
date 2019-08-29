import java.sql.*;

public class MySqlDBApp{
    public static void main(String args[]){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/StudentsDb", "root", "admin");
            Statement stmt = con.createStatement();
            PreparedStatement insert = con.prepareStatement("insert into student(FName,LName,Address,Gender) values(?,?,?,?)");
            stmt.execute("delete from student where FName like '%Haris%'");
            insert.setString(1, "Haris");
            insert.setString(2, "All Rounder");
            insert.setString(3, "Scotland");
            insert.setString(4, "M");
            insert.execute();
            ResultSet rs = stmt.executeQuery("select * from student");
            ResultSetMetaData mtdata = rs.getMetaData();
            int columns = mtdata.getColumnCount();
            for(int c=1;c<=columns; c++){
                System.out.print(mtdata.getColumnName(c)+"\t | \t");
            }
            System.out.println();
            while(rs.next()){
                for(int c=1;c<=columns; c++){
                System.out.print(rs.getString(c)+"\t | \t");
                }
                System.out.println();
                //System.out.println("Id: "+rs.getInt(1)+ "\t Name: "+rs.getString(2)+' '+ rs.getString(3));
            }
            con.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
       
    }
}