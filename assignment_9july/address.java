package assignment_9july;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class address {
	private String city;
	public int zip;
	List<user> users = new ArrayList();
	address(String c,int z,user u)
	{
		this.city = c;
		users.add(u);
		this.zip=z;
	}
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
	public void setuser1(user u) {
		// TODO Auto-generated method stub
		users.add(u);
	}
}
