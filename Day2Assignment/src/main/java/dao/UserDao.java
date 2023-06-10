package dao;

import java.sql.Date;
import java.sql.SQLException;

import pojo.User;

public interface UserDao {
	
	User validateUser(String email,String password)throws SQLException;
	
		User registerUser( String firstName, String lastName, String email, String password, Date dob, 
				String role)throws SQLException;

}
