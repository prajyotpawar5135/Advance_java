package dao;

import java.sql.SQLException;

import pojos.User;

public interface Userdao {
//for user login
	User authenticateUser (String user,String password)throws SQLException;
	
}
