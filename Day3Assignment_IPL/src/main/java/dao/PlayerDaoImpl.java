package dao;

import static utils.DButils.openConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pojos.Player;

public class PlayerDaoImpl implements PlayerDao {

	private Connection cn;
	private PreparedStatement pst1;

	public PlayerDaoImpl() throws SQLException {
		cn = openConnection();
		 pst1 = cn.prepareStatement("insert into player value(?,?,?,?,?,?)");

	}

	@Override
	public Player registerPlayer(Player p) throws SQLException {
		System.out.println(p);
		pst1.setInt(1, p.getId());
		pst1.setString(2, p.getpName());
		pst1.setDate(3, p.getDob());
		pst1.setDouble(4, p.getpAverage());
		pst1.setInt(5, p.getWickets_taken());
		pst1.setInt(6,p.getTid());

		int n = pst1.executeUpdate();

		if (n == 1) {
			System.out.println("player registered");
		} else {
			System.out.println("player registration failed");
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
