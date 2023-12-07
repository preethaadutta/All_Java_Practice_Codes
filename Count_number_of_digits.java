/*Count the number of digits of a number*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int a=123;
	    int count=0;
	    while(a!=0)
	    {
	        int c=a%10;
	        count=count+1;
	        a=a/10;
	    }
		System.out.println(count);
	}
}
