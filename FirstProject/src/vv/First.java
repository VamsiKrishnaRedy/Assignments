package vv;

import java.util.Scanner;
class area{
	StudentInfo st1;
	double findarea(int r) {
		st1=new StudentInfo();
		int res1=st1.square(r);
		return 3.14*res1;
		
		} 
}

class First  {
	
	

	public static void main(String[] args) {
		area a1=new area();
		double d1=a1.findarea(10);
		System.out.println(d1);
		
		
		
	}
	
	
	
}