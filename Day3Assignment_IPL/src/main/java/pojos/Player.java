package pojos;

import java.sql.Date;

public class Player {
	// id name dob avg wickets
	private int id;
	private String pName;
	private Date dob;
	private double pAverage;
	private int wickets_taken;
	private int tid;
	
	public Player()
	{
		
	}
	

	@Override
	public String toString() {
		return "Player [id=" + id + ", pName=" + pName + ", dob=" + dob + ", pAverage=" + pAverage + ", wickets_taken="
				+ wickets_taken + ", tid=" + tid + "]";
	}


	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getpAverage() {
		return pAverage;
	}

	public void setpAverage(double pAverage) {
		this.pAverage = pAverage;
	}

	public int getWickets_taken() {
		return wickets_taken;
	}

	public void setWickets_taken(int wickets_taken) {
		this.wickets_taken = wickets_taken;
	}


	public Player(int id, String pName, Date dob, double pAverage, int wickets_taken, int tid) {
		super();
		this.id = id;
		this.pName = pName;
		this.dob = dob;
		this.pAverage = pAverage;
		this.wickets_taken = wickets_taken;
		this.tid = tid;
	}

	

}
