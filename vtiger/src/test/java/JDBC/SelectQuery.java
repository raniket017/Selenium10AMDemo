package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		//1 register driver to java
	Driver driver = new Driver();
 DriverManager.registerDriver(driver);
 //2 Establishing connection to your database
  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	//3 create the statement
 Statement statement = connection.createStatement();	
 // 4 writte a query
  ResultSet result = statement.executeQuery("select* from project;");
  while(result.next()) {
	  
	  System.out.println(result.getString(2));
  }
//5 close the database 
	connection.close()
;	}

}
