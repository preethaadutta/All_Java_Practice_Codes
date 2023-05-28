//Swapping the values of two variables without using third variable
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value of 1st variable: ");
	    int a=sc.nextInt();
	    System.out.println("Enter value of 2nd variable: ");
	    int b=sc.nextInt();
	    //Before swapping the values are 
	    System.out.println("Before swapping the values are: ");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	    //swapping
	    a=a+b;
	    b=a-b;
	    a=a-b;
		//After swapping the values are 
	    System.out.println("After swapping the values are: ");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	}
}
