package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class mainclass {
public static void main(String args[])
{
	Set<user> users=new TreeSet(new sortuser());
	users.add(new user("user1",1,"DEL",560012,"BLR",560011));
	users.add(new user("user2",2,"GN",560013,"BLR",560011));
	users.add(new user("user3",3,"GN",560013,"BLR",560011));
	for(user u:users)
	System.out.println(u.string());
	
	int size;
	//Set<address> adress=new HashSet<address>();//(new sortaddress());
	List<address> adress=new ArrayList();
	boolean check=false;
	for(user u:users)
	{
		Set<String> key1=((user)u).address.keySet();
		Collection<Integer> value=((user)u).address.values();
		for(String s:key1)
		{
			int val=u.getzip(s);
			for(address add:adress)
			{
				if(add.getcity().equals(s))
				{
					check=true;
					add.setuser(u);
				
				}
			}
			if(check==false)
			{
				size=adress.size();
				adress.add(size,new address(s,val,u));
			
			}
			check=false;
		}
	}
	for(address add:adress)
	{
		if(add.getlistsize()<2)
		{
			adress.remove(add);
		}
	}
	System.out.println(adress);
}
}
class sortuser implements Comparator<user>
{
	@Override
	public int compare(user o1, user o2) {
		// TODO Auto-generated method stub
		Set<String> key1=((user)o1).address.keySet();
		Set<String> key2=((user)o2).address.keySet();
		for(String s:key1)
		{
			for(String ss:key2)
			{
				if(s.compareTo(ss)==0)
				{
					break;
				}
				return s.compareTo(ss);
				
			}
		}
		return 0;
	}
	
}
class sortaddress implements Comparator<address>
{

	@Override
	public int compare(address o1, address o2) {
		// TODO Auto-generated method stub
		return o1.getzip()-o2.getzip();
	}
	
}