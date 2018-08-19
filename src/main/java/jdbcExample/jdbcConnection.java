package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcConnection {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/db_example";

	static final String JDBC_USER = "root";
	static final String JDBC_PASS = "password";
	
	public static void main(String[] args) {
		try {
			Class.forName(JDBC_DRIVER);
			Connection conn = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
			
			PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM user_table");
			
			ResultSet rs = preparedStatement.executeQuery();
			System.out.println(rs.first());
			
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
