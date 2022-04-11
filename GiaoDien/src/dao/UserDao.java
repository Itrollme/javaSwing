/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Admin
 */
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM Users";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setID(rs.getInt("ID"));
                user.setNAME(rs.getString("NAME"));
                user.setPHONE(rs.getString("PHONE"));
                user.setUSERNAME(rs.getString("USERNAME"));
                user.setPASSWORD(rs.getString("PASSWORD"));
                user.setABOUT(rs.getString("ABOUT"));
                user.setFAVOURITES(rs.getString("FAVOURITES"));
                user.setROLE(rs.getString("ROLE"));

                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return users;
    }
    
    public void addUser(User user) {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO Users(NAME, PHONE, USERNAME, PASSWORD, ABOUT, FAVOURITES, ROLE) VALUES(?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getNAME());
            preparedStatement.setString(2, user.getPHONE());
            preparedStatement.setString(3, user.getUSERNAME());
            preparedStatement.setString(4, user.getPASSWORD());
            preparedStatement.setString(5, user.getABOUT());
            preparedStatement.setString(6, user.getFAVOURITES());
            preparedStatement.setString(7, user.getROLE());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void updateUser(User user){

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE Users SET NAME = ?,PHONE = ?,USERNAME = ?,PASSWORD = ?,ABOUT = ?,FAVOURITES = ?,ROLE = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getNAME());
            preparedStatement.setString(2, user.getPHONE());
            preparedStatement.setString(3, user.getUSERNAME());
            preparedStatement.setString(4, user.getPASSWORD());
            preparedStatement.setString(5, user.getABOUT());
            preparedStatement.setString(6, user.getFAVOURITES());
            preparedStatement.setString(7, user.getROLE());
            preparedStatement.setInt(8, user.getID());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser(int id){

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM Users WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
     public User getUserById(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM Users WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setID(rs.getInt("ID"));
                user.setNAME(rs.getString("NAME"));
                user.setPHONE(rs.getString("PHONE"));
                user.setUSERNAME(rs.getString("USERNAME"));
                user.setPASSWORD(rs.getString("PASSWORD"));
                user.setABOUT(rs.getString("ABOUT"));
                user.setFAVOURITES(rs.getString("FAVOURITES"));
                user.setROLE(rs.getString("ROLE"));

                return user;
            }   

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
     
     
     
     
}
