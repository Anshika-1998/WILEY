package assignments;

import java.util.ArrayList;
import java.util.List;

public class address {
	private String city;
	private int zip;
	List<user> users = new ArrayList();
	public int getlistsize()
	{
		return users.size();
	}
	public String getcity() {
		return city;
	}
	public int getzip() {
		return zip;
	}
	address(String c,int z,user u)
	{
		this.city = c;
		users.add(u);
		this.zip=z;
	}
	public void setuser(user u) {
		users.add(u);
	}

	public void setcity(String c) {
		this.city = c;
	}

	address(String c, int zip1)// ,user u)
	{
		this.city = c;
		this.zip = zip1;
		// users.add(u);
	}

	public String toString() {
		return "\ncity:"+city + " zip:" + zip + " USERS[ " + users+"]";
	}
}
