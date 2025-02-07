/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class JDBCUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String DB_Name="FPTU_Library_Management";
        String DB_USERName="sa";
        String DB_PASSWORD="12345";
        Connection conn=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;database = "+ DB_Name;
        conn =DriverManager.getConnection(url,DB_USERName,DB_PASSWORD);
        return conn;
    }
    public static void main(String[] args) {
        try {
            Connection c = getConnection();
            System.out.println(c);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
