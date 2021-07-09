package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class user {
private String name;
private int id;

HashMap<String,Integer> address=new HashMap<String,Integer>();
user(String name1,int id1,String add1,int zip1,String add2,int zip2)
{
	this.name=name1;
	this.id=id1;
	this.address.put(add1,zip1);
	this.address.put(add2,zip2);
}
public String string() {
	return id + " " + name + " " +address ;
}
public String toString() {
	return "id:"+id + " name:" + name + " "  ;
}

public int getzip(String s)
{
	return address.get(s);
	
}
}
