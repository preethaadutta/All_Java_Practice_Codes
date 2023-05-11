/*WAP to perform Selection Sort*/
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
	    int min,temp=0;
	    for(int i=0;i<n;i++)
	    {
	        min=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(array[j]<array[min])
	            {
	                min=j;
	            }
	        }
	        //swapping with third variable
	        temp=array[i];
	        array[i]=array[min];
	        array[min]=temp;
	    }
		for(int i=0;i<n;i++)
	    {
	        System.out.print(array[i]+" ");
	    }
	}
}
