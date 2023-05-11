/*WAP to perform Insertion Sort*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of Elements in array: ");
	    int n=sc.nextInt();
	    int array[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        System.out.print("Enter elements of array: ");
	        array[i]=sc.nextInt();
	    }
	    int temp=0;
	    for(int i=1;i<n;i++)
	    {
	        temp=array[i];
	        while(i>0 && array[i-1]>temp)
	        {
	            array[i]=array[i-1];
	            i=i-1;
	        }
	        array[i]=temp;
	    }
		for(int i=0;i<n;i++)
	    {
	        System.out.print(array[i]+" ");
	    }
	}
}
