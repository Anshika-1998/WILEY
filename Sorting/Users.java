package collection;

public class Users {
		
		int userId;
		String name;
		Users(int userId,String name)
		{
			this.userId=userId;
			this.name=name;
		}
		public String toString() {
			return userId + " " + name ;
		}
		public int getId()
		{
			return userId;
		}
	}
