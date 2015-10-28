
import java.sql.*;
import javax.swing.*;
 class MySql{
Connection mycon=null;

public static Connection ConnectDB(){
        try{
             Class.forName("com.mysql.jdbc.Driver"); // setting the driver
       
                Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost/project", "root","circus465");
               // JOptionPane.showMessageDialog(null,"connected to database");
                return mycon;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }

 }
 }


      

        
    
