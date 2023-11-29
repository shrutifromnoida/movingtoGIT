package Const;

public class ConstAssignment1
	{
	public ConstAssignment1()
	{
		this(1,2,3,4);
		System.out.println("Default Parameterized");
	}
		public ConstAssignment1(int a)
	{
		this();
		System.out.println("One Parameterized");
	}
		public ConstAssignment1(int a, int b)
	{
		this(1,2,3);
		System.out.println("two parameterized");
	}
		public ConstAssignment1(int a, int b, int c)
	{
		this(1);
		System.out.println("Three Parameterized");
	}
	public ConstAssignment1(int a, int b, int c,int d)
	{
		System.out.println("Four Parameterized");
	}
	public static void main(String[] args) {
		
		ConstAssignment1 objj= new ConstAssignment1(1,2);
 	}
	}


