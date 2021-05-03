package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	private static Connection connection;

	public static Connection getCon() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RiceLand",
						"root", "Kshitiz123@");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
