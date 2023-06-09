package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {

	private static Connection cn;

	public static Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		Connection cn = DriverManager.getConnection(dbURL, "root", "root123");
		System.out.println("connection established");
		return cn;
	}

	public static void closeConnection() throws SQLException {

		if (cn != null) {
			cn.close();
			System.out.println("db connection closed");
		}

	}

}
