package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class fibo {
	public static void main(String args[])
	{
		series s=new series();
		Thread t1=new Thread(s);
		t1.start();
		addition disp=new addition(s.getIntegers());
		Thread t2=new Thread(disp);
		t2.start();
		System.out.println("[");
		for(int i=0;i<s.getIntegers().size()-2;i++)
		System.out.println(disp.print(i));
		System.out.println("]");
	
	}
}
class series implements Runnable
{
	private static List<Integer> integers =new ArrayList<>();
	List<Integer> disp=new ArrayList<>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int j=0,n=100;
		for(int i=1;i<n;i=i+j)
		{
			integers.add(i);
			j=j+i;
			integers.add(j);
		}
	}
	public List<Integer> getIntegers() {
        return integers;
    }
}
 class addition implements Runnable
{
	List<Integer> list= new ArrayList<>();
	List<Integer> sum=new ArrayList<>();
	addition(List<Integer> l)
	{
		this.list=l;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			sum.add(count);
			count=count+list.get(i);
		}
	}
	public String print(int i) 
	{
		
		return sum.get(i) + " + " + list.get(i) + " = " +(sum.get(i) + list.get(i)+",") ;
	}
}