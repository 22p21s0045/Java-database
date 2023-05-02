/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming3;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
/**
 *
 * @author Student
 */
public class LAB14 {
    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb3";
            String username = "root";
            String password = "mysql@sit";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection connection = DriverManager.getConnection(URL, username, password);
                DatabaseMetaData meta = connection.getMetaData();

                System.out.println("Database url:"+ meta.getURL());
                System.out.println("Product name:"+meta.getDatabaseProductName());
                System.out.println("Driver name:"+meta.getDriverName());
                System.out.println("Driver version:"+meta.getDriverVersion());
                System.out.println("Connecting:"+ meta.getMaxConnections());
                
                
               
            } catch (SQLException ex) {
                Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
