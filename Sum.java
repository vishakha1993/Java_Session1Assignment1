package Java;

import java.util.Scanner;

public class Sum 
{
	public static void main(String arg[])
	{
		int num1,res;
		float num2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number (Integer) : ");
		num1=scan.nextInt();
		System.out.println("Enter 2nd number (Float) : ");
		num2=scan.nextFloat();
		
		res=(int) (num1+num2);
		
		System.out.println("Sum of the two numbers is : "+res);
		
	}

}
