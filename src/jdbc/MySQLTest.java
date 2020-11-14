package jdbc;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource; 
/**  *  * Java program to connect to MySQL Server database running on localhost,  * using JDBC type 4 driver.  *  * @author http://java67.blogspot.com  */ 
public class MySQLTest{ 
	public static void main(String args[]) { 
	 
	Connection dbCon = null; 
	Statement stmt = null; 
	ResultSet rs = null; 
	String query ="select count(*) from myusers"; 
	try { 
		
		//getting database connection to MySQL server 
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
	    dataSource.setPortNumber(3306);
	    dataSource.setDatabaseName("mylaravel");
	    dataSource.setUser("root");
	    dataSource.setPassword("");
		dbCon = dataSource.getConnection(); 
		//getting PreparedStatment to execute query 
		stmt = dbCon.prepareStatement(query); 
		//Resultset returned by query 
		rs = stmt.executeQuery(query); 
		while(rs.next()){ 
			int count = rs.getInt(1); 
			System.out.println("count of users : " + count); 
		} 
	} 
	catch (SQLException ex) { 
		System.out.println(ex);
	} 
	finally{ //close connection ,stmt and resultset here } } }
	}
	}
}