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

/**
 *
 * @author Student
 */
public class LAB10 {
    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb3";
            String username = "root";
            String password = "mysql@sit";
            String sql = "DELETE FROM student WHERE firstname = 'Akkarawit'";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
