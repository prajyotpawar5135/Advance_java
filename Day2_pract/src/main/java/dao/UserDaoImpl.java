package dao;

import java.sql.*;
import static utils.DButils.*;

import pojos.User;

public class UserDaoImpl implements Userdao {

	private Connection cn;
	private PreparedStatement pst1;

	public UserDaoImpl() throws SQLException {
		cn = getConnection();
		pst1 = cn.prepareStatement("select * from users where email=? and password=?");
		System.out.println("connection established");
	}
//id | first_name | last_name | email | password | dob | status | role

	@Override
	public User authenticateUser(String email, String password) throws SQLException {

		pst1.setString(1, email);
		pst1.setString(2, password);
		try (ResultSet res = pst1.executeQuery()) {
			if (res.next()) 
			{
				return new User(res.getInt(1), res.getString(2), res.getString(3), email, password, res.getDate(6),
						res.getBoolean(7), res.getString(8));
			}

		}

		return null;
	}

	public void cleanUP() throws SQLException {
		if (pst1 != null) {
			cn.close();
			closeConnection();
			System.out.println("connection closed");
		}
	}

}
