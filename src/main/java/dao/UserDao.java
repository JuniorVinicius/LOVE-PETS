package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.User;

public class UserDao implements CRUD{
	
	private static Connection connection = MySqlConnection.createConnection();
	private static String sql;
	
	public static void create(User user) {
		sql = "INSERT INTO Ongs VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getOngName());
			preparedStatement.setString(2, user.getTypePets());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPhone());
			preparedStatement.setString(5, user.getCity());
			preparedStatement.setString(6, user.getZipCode());
			preparedStatement.setString(7, user.getAddress());
			preparedStatement.setString(8, user.getNeighborhood());
			preparedStatement.setString(9, user.getAddressNumber());
			preparedStatement.setString(10, user.getDescription());
			
			preparedStatement.executeUpdate();
			
			System.out.println("-- Insert success --");
			
		} catch (SQLException e) {
			System.out.println("-- No insert on database -- >> " + e.getMessage());
		}
	}
	
	public static void delete(int userId) {
		
		sql = "DELETE FROM Ongs WHERE id = ?";
		
		
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, userId);
			
			preparedStatement.executeUpdate();
			
			System.out.println("-- Delete success --");
			
		} catch (SQLException e) {
			System.out.println("-- Failed Delete -- >> " + e.getMessage());
		}
		
	}
	
	public static List<User> listAll() {
		
		sql = String.format("SELECT * FROM Ongs");
		
		List<User> users = new ArrayList<User>();
		
		try {
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setOngName(resultSet.getString("ongName"));
				user.setTypePets(resultSet.getString("typePets"));
				user.setEmail(resultSet.getString("email"));
				user.setPhone(resultSet.getString("phone"));
				user.setCity(resultSet.getString("city"));
				user.setZipCode(resultSet.getString("zipCode"));
				user.setAddress(resultSet.getString("address"));
				user.setNeighborhood(resultSet.getString("neighborhood"));
				user.setAddressNumber(resultSet.getString("addressNumber"));
				user.setDescription(resultSet.getString("description"));
				
				users.add(user);
			}
			
			System.out.println("-- correct select ongs --");
			return users;
			
			
		} catch (SQLException e) {
			System.out.println(" -- Incorrect select ongs -- >> " + e.getMessage());
			return null;
		}
		
		
		
	}
	
	public static User findByPk(int userId) {
		sql = String.format("SELECT * FROM Ongs WHERE id = %d", userId);
		
		
		try {
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(sql);
			User user = new User();
			
			while(resultSet.next()) {
				
				user.setId(resultSet.getInt("id"));
				user.setOngName(resultSet.getString("ongName"));
				user.setTypePets(resultSet.getString("typePets"));
				user.setEmail(resultSet.getString("email"));
				user.setPhone(resultSet.getString("phone"));
				user.setCity(resultSet.getString("city"));
				user.setZipCode(resultSet.getString("zipCode"));
				user.setAddress(resultSet.getString("address"));
				user.setNeighborhood(resultSet.getString("neighborhood"));
				user.setAddressNumber(resultSet.getString("addressNumber"));
				user.setDescription(resultSet.getString("description"));

			}
			
			System.out.println("-- correct select ongs by pk --");

			return user;
			
		} catch (SQLException e) {
			System.out.println(" -- Incorrect select ongs by pk -- >> " + e.getMessage());
			return null;
		}
		
	}
	
	public static void update(User user) {
		sql = "UPDATE Ongs Set ongName=?, typePets=?, email=?, phone=?, city=?, zipCode=?, address=?, neighborhood=?, addressNumber=?, description=? WHERE id=?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getOngName());
			preparedStatement.setString(2, user.getTypePets());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPhone());
			preparedStatement.setString(5, user.getCity());
			preparedStatement.setString(6, user.getZipCode());
			preparedStatement.setString(7, user.getAddress());
			preparedStatement.setString(8, user.getNeighborhood());
			preparedStatement.setString(9, user.getAddressNumber());
			preparedStatement.setString(10, user.getDescription());
			preparedStatement.setInt(11, user.getId());
			
			preparedStatement.executeUpdate();
			
			System.out.println("-- Update success --");
			
		} catch (SQLException e) {
			System.out.println("-- No Update on database -- >> " + e.getMessage());
		}
	}
}
