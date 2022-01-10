package bestWay.DbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DbManager {
 
	
	public DbManager() {
		super();
	}

	Connection con;
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestwaydb","root","MAL18091998");
			System.out.println("Connected");
			return conn;
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet getResult(String query) throws SQLException {
		con=DbManager.getConnection();
		Statement statement = con.createStatement();
		ResultSet result=statement.executeQuery(query);
		return result;
	}
	
	public Statement getStatement() throws SQLException {
		con=DbManager.getConnection();
		Statement statement = con.createStatement();
		//ResultSet result=statement.executeQuery(query);
		return statement;
	}
}
