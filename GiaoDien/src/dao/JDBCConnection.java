/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author Admin
 */
public class JDBCConnection {
    public static Connection getJDBCConnection(){
        final String url = "jdbc:sqlserver://ADMIN:1433;databaseName=User;instance=SQLEXPRESS;user=sa;password=123456";
        final String userName = "sa";
        final String password = "123456";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
//    public ResultSet GetResultSet(String tableName) throws SQLException {
//        ResultSet rs = null;
//        Statement stmt = con.createStatement();
//        String sql = "select * from " + tableName;
//        rs = stmt.executeQuery(sql);
//        return rs;
//    }
//
//    public static void main(String[] args) {
//         JDBCConnection kn = new JDBCConnection();
//        try {
//            ResultSet rs= kn.GetResultSet("Users");//Table Name
//            while(rs.next())
//            {
//                System.out.println(rs.getString("Name"));//Field Name
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

}