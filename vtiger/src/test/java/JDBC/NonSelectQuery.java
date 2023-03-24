package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		 DriverManager.registerDriver(driver);
		 
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
		 Statement statement = connection.createStatement();
	int result = statement.executeUpdate("insert into project values(2,'sumit',971919548);" );
	System.out.println(result);
	if (result == 1) {
		System.out.println("the database has been update");
	}
	else 
System.out.println("the database has not been update");
	connection.close();
	}

}
