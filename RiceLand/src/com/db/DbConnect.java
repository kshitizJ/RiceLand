package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	private static Connection connection;

	// Connection
	// A Connection is the session between java application and database. The
	// Connection interface is a factory of Statement, PreparedStatement i.e. object
	// of Connection can be used to get the object of Statement.

	// DriverManager
	// The DriverManager class acts as an interface between user and drivers. It
	// keeps track of the drivers that are available and handles establishing a
	// connection between a database and the appropriate driver.

	public static Connection getCon() {
		if (connection == null) {
			try {
				// The forName() method of 'java.lang.Class' class is used to get the instance
				// of this Class with the specified class name. This class name is specified as
				// the string parameter.
				Class.forName("com.mysql.cj.jdbc.Driver");

				// getConnection(String url,String userName,String password) is used to
				// establish the connection with the specified url, username and password.
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RiceLand", "root", "Kshitiz123@");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// if some error occurs then it gets printed in the console.
				e.printStackTrace();
			}
		}
		return connection;
	}
}
