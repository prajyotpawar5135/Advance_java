package dao;

import java.sql.Date;
import java.sql.SQLException;

import pojos.Player;

public interface PlayerDao {
	///id name dob avg wickets
	Player registerPlayer(Player p)throws SQLException;

}
