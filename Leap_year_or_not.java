import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a year:");
	    int year=sc.nextInt();
	    if((year%100==0)&&(year%400==0))
	    {
	        System.out.println("It is a leap year");
	    }
	    else if((year%100!=0)&&(year%4==0))
	    {
	        System.out.println("It is a leap year");
	    }
	    else
	    {
	        System.out.println("It is not a leap year");
	    }
	}
}
