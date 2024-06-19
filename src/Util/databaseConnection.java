/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sadeep
 */
public class databaseConnection {
    
    private static Connection con;
	
	private databaseConnection() {
		
	}
	
	// Method to establish a database connection
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cake_shop", "root", "");
			return con;
		
	}

	public static void setCon(Connection con) {
		databaseConnection.con = con;
	}
	
	public static Connection getCon() {
		return con;
	}
    
}
