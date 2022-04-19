package vv;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s1.nextInt();
		factorial(num);




	}
	public static void factorial(int a) {
		int fact=1;
		int i=1;
		while(i<=a) {
			fact=fact*i;
			i++;

		}
		System.out.println("The factorial of  "+a+" is :"+fact);

	}

}
