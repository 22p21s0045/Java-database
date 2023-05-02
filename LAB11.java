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
public class LAB11 {
    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb3";
            String username = "root";
            String password = "mysql@sit";
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, username, password);
            } catch (SQLException ex) {
                Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Statement statement = connection.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
