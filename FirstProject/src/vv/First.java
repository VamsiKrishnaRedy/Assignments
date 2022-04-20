package vv;

import java.util.Scanner;




class First extends StudentInfo {
	
	 int add(int a,int b) {
		System.out.println("vamsi krishna reddy");
		return a+b;
		
	}
	  void result() {
		 super.run();
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
		First f1=new First();
		
		 int res = f1.add(40,50);
		System.out.println(res);
		f1.result();
		
	}
	
	
	
}