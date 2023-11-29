package Const;
//1.It is like a Method
//2.Constructor and Class name is same.
//3.No return type
//4.No need to call the Constructor, its automatically called when object of the class is created
public class ConstructorUnderstanding 
{
	public ConstructorUnderstanding() 
		{
		// to create constructor we write the class name with CTL+Space
		System.out.println("Default Constructor");
		
	
		}
	public ConstructorUnderstanding(int a) 
	{
		this(2,4);
	// to create constructor we write the class name with CTL+Space
		System.out.println("One Parameterized Constructor");
	
	}
	public ConstructorUnderstanding(int a,int b) 
	{
		this();
		// to create constructor we write the class name with CTL+Space
	System.out.println("Two Parameterized Constructor");
	
	
	// TODO Auto-generated constructor stub
	}
	//1.Create Class
	//2.Create Main method creation
	//3.Object creation inside main method
	//4.calling method using object.
	
	public static void main(String[] args) 
	{
		ConstructorUnderstanding ob= new ConstructorUnderstanding(1);
		ConstructorUnderstanding ob1= new ConstructorUnderstanding(1,2);
		ConstructorUnderstanding ob2= new ConstructorUnderstanding();
	
	}
}


