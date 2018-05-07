package StoryTimeRun;

import java.io.Serializable;

public class Member implements Serializable {
	
	private String username;
	private String password;
	private String fName;
	private String lName;
	public static int numOfMembs = 0;

	public Member(String uName, String pWord, String first, String last) {
		username = uName;
		password = pWord;
		fName = first;
		lName = last;
		numOfMembs++;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void setNumOfMembs(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
