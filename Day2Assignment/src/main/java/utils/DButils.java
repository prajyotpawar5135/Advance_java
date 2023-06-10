package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DButils {
	private static Connection cn;

	public static Connection openConnection() throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(URL, "root", "root123");
		System.out.println("db connected");
		return cn;
	}

	public static void cleanUp() throws SQLException {
		if (cn != null) {
			cn.close();
			System.out.println("db connection closed");
		}
	}

}
