/*WAP to insert an element into an array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter number of Elements in array: ");
	    int n=sc.nextInt();
	    int array1[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        System.out.print("Enter elements of array: ");
	        array1[i]=sc.nextInt();
	    }
	    int array2[]=new int[n+1];
	    System.out.print("Enter element to be inserted in array: ");
	    int element=sc.nextInt();
	    System.out.print("Enter position where the element is to be inserted: ");
	    int position=sc.nextInt();
	    for(int i=0;i<=position;i++)
	    {
	        if(i==position)
	        {
	            array2[i]=element;
	        }
	        else
	        {
	            array2[i]=array1[i];
	        }
	    }
	    for(int i=position+1;i<n+1;i++)
	    {
	        array2[i]=array1[i-1];
	    }
		for(int i=0;i<n+1;i++)
	    {
	        System.out.print(array2[i]+" ");
	    }
	}
}

