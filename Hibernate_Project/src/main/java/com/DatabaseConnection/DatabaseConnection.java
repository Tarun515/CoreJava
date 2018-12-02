package com.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static void connectToDatabase() {
		String connectionUrl = "jdbc:sqlserver://TK\\SQLEXPRESS;user=Hibernate_JPA_Schema;password=password";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection Successfully established.");
		} catch (Exception e) {
			System.out.println("Error in Connection");
			System.out.println("Error" + e.getStackTrace());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		connectToDatabase();
	}
}
