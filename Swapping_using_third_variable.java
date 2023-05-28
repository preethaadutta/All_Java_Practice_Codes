//Swapping the values of two variables using third variable
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
	    int c=0;
	    //Before swapping the values are 
	    System.out.println("Before swapping the values are: ");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	    //swapping
	    c=a;
	    a=b;
	    b=c;
		//After swapping the values are 
	    System.out.println("After swapping the values are: ");
	    System.out.println("a: "+a);
	    System.out.println("b: "+b);
	}
}