import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number of elements in array:");
	    int n=sc.nextInt();
	    int array[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        System.out.println("Enter elements of array:");
	        array[i]=sc.nextInt();
	    }
	    System.out.println("Enter value of k:");
	    int k=sc.nextInt();
	    int kthsmallest=0;
	    int kthhighest=0;
	    Arrays.sort(array);
	    System.out.println("K-th smallest: "+array[k-1]);
	    System.out.println("K-th highest: "+array[n-k]);
	}
}
