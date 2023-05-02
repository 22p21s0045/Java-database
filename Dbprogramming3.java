/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Dbprogramming3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        String sql = "SELECT * FROM student;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            try {
                Connection connection = DriverManager.getConnection(URL, username, password);
                System.out.println("Database connected");
                Statement statement = connection.createStatement();
                ResultSet results = statement.executeQuery(sql);
                while (results.next()) {
                    System.out.println(results.getString(1)+" "+ results.getString(2) +" "+ results.getString(3)+" "+
                    results.getString(4)
                    );
                    
                }
                
                System.out.println(results);

//                statement.executeUpdate("UPDATE course SET numOfCredits = 3 WHERE CourseId = 11111");
                // TODO code application logic here
            } catch (SQLException ex) {
                Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
