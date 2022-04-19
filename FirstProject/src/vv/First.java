package vv;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {

		
		StudentInfo s1=new StudentInfo();
		
		
		StudentInfo s2=new StudentInfo("Vamsi ");
		StudentInfo s3=new StudentInfo("Vamsi",23000);
		System.out.println(s1);
		
		System.out.println("The student name is "+s2.name);
		System.out.println("The student name is "+s1.name);
		
		System.out.println("The student name is  "+s3.name+" salary is "+s3.salary);
		
		

		



	}
	

}
