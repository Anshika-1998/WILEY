package assignment_9july;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public class user {



private String name;
private int id;

HashMap<Integer,String> address=new HashMap<Integer,String>();
user(String name1,int id1)
{
	this.name=name1;
	this.id=id1;
	//this.address.put(add1,zip1);
	//this.address.put(add2,zip2);
}
public void setaddres(String s,int zi)
{
	this.address.put(zi,s);
}
public String string() {
	return id + " " + name + " " +address ;
}
public String toString() {
	return "id:"+id + " name:" + name + " "  ;
}
public String getcity(int a)
{
	return address.get(a);
}

//public int getzip(String s)
//{
//	return address.get();
//	
//}
}


