package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static utils.DButils.*;

import pojo.User;

public class UserDaoImpl implements UserDao {

	private Connection cn;
	private PreparedStatement pst1, pst2;

	// String firstName, String lastName, String email, String password, Date dob,
	// String role
	public UserDaoImpl() throws SQLException {
		cn = openConnection();
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		pst2 = cn.prepareStatement("insert into users values(Default,?,?,?,?,?,0,?)");
		System.out.println("db connection created");

	}

	@Override
	public User validateUser(String email, String password) throws SQLException {
		pst1.setString(1, email);
		pst1.setString(2, password);

		try (ResultSet rst = pst1.executeQuery()) {
			if (rst.next()) {
				
				return new User(rst.getInt(1), rst.getString(2), rst.getString(3), email, password, rst.getDate(6),
						rst.getInt(7), rst.getString(8));
			}
		}
		return null;
	}

	@Override
	public User registerUser( String firstName, String lastName, String email, String password, Date dob,
			String role) throws SQLException {
//		pst2.setInt(1, id);
		pst2.setString(1, firstName);
		pst2.setString(2, lastName);
		pst2.setString(3, email);
		pst2.setString(4, password);
		pst2.setDate(5, dob);
		pst2.setString(6, role);

		int n = pst2.executeUpdate();
		if (n == 1) {
			System.out.println("user added successfully");
		} else {
			System.out.println("unable to add user");
		}
		return null;

	}

	public void cleanUp() throws SQLException {
		if (cn != null) {
			cn.close();
			System.out.println("db connection closed");
		}
	}
}
