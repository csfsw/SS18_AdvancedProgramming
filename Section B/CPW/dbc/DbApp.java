import java.sql.*;

public class DbApp{
    public static void main(String args[]){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/StudentsDb","root","admin");
            Statement select = con.createStatement();
            PreparedStatement insert = con.prepareStatement("insert student(FName,LName,Address,Gender) values(?,?,?,?)");
            insert.setString(1, "Naseer");
            insert.setString(2, "Ahmad");
            insert.setString(3, "Wardak");
            insert.setString(4,"M");
            insert.execute();
            ResultSet rs = select.executeQuery("select * from student");
            ResultSetMetaData mtdata = rs.getMetaData();
            int columns = mtdata.getColumnCount();
            for(int c=1; c <= columns; c++){
                System.out.print(mtdata.getColumnName(c) + " \t | \t");
            }
            System.out.println();

            while(rs.next()){
                for(int c=1; c <= columns; c++){
                    System.out.print(rs.getString(c) + " \t - \t");
                }
                System.out.println();
            }
        }catch(SQLException ex){
          ex.printStackTrace();
        }
    }
    
   
}