/*
WAP to extract integer and float part from a floating point value:
Input: 32.78
Output: Integer: 32
        Float: 78
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		double n=32.78;
		int int_value=(int)n;
		System.out.println("Integer: "+int_value);
		double double_value=n-int_value;
		float float_value=(float)double_value;
		//System.out.println(float_value);
		float float_part=float_value*100;
		//System.out.println(float_part);
		int float_final=(int)float_part;
		System.out.println("Float: "+float_final);
	}
}
