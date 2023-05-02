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

/**
 *
 * @author Student
 */
public class LAB12 {

    public static void main(String[] args) {
        try {
            String URL = "jdbc:mysql://localhost:3306/mydb3";
            String username = "root";
            String password = "mysql@sit";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, username, password);
                String sql = "INSERT INTO student(studentID,firstname,lastname,email,deptID) VALUES(?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, "8889");
                preparedStatement.setString(2, "Jack");
                preparedStatement.setString(3, "Ryan");
                preparedStatement.setString(4, "jackzzz@gmail.com");
                preparedStatement.setString(5, "CS");
                preparedStatement.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
