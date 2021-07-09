package assignment_9july;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;







public class mainclass {
	public static void main(String args[])
	{
		List<user> users=new ArrayList<user>();//(new sortuser());
		users.add(new user("user3",3));
		int size=users.size();
		users.get(size-1).setaddres("BLR", 560001);
		users.get(size-1).setaddres("BLR", 560002);
		users.get(size-1).setaddres("DEL", 110001);
		users.add(new user("user44",44));//,"GN",560013,"BLR",560011));
		 size=users.size();
		users.get(size-1).setaddres("BLR", 560038);
		users.get(size-1).setaddres("DEL", 110096);
		users.get(size-1).setaddres("DEL", 110001);
		users.add(new user("user2",2));//,,"GN",560013,"BLR",560011));
		size=users.size();
		users.get(size-1).setaddres("BOM", 400018);
		users.get(size-1).setaddres("BOM", 400037);
		users.get(size-1).setaddres("DEL", 110001);
		users.get(size-1).setaddres("BLR", 560001);
		Collections.sort(users,new mycomp());
		for(user u:users)
		System.out.println(u.string());
		
		
		
		List<address> adress=new ArrayList();
		boolean check=false;
		for(user u:users)
		{
			Set<Integer> zip=u.address.keySet();
			for(Integer z:zip)
			{
				String city=u.getcity(z);
				for(address add:adress)
				{
					if(add.getzip()==z)
					{
						check=true;
						add.setuser(u);
					}
				}
				if(check==false)
				{
					size=adress.size();
					adress.add(size,new address(city,z,u));
				}
				check=false;
			}	
		}
		Collections.sort(adress,new comp());
		System.out.println(adress);
	}
}
class mycomp implements Comparator<user>
{


	@Override
	public int compare(user o1, user o2) {
		// TODO Auto-generated method stub
		Set<Integer> key1=((user)o1).address.keySet();
		Set<Integer> key2=((user)o2).address.keySet();
		for(Integer s:key1)
		{
			for(Integer ss:key2)
			{
				if(s==ss)
				{
					break;
				}
				return s-ss;
				
			}
		}
		return 0;
	}
	
}
class comp implements Comparator<address>
{

	@Override
	public int compare(address o1, address o2) {
		// TODO Auto-generated method stub
		
		return o1.getzip()-o2.getzip();
	}
	
}