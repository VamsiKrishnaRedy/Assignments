package vv;

public class First {

	public static void main(String[] args) {
		
		int res=add(10,20);
		System.out.println("The sum if two numbers is :"+res);
		StudentInfo s1=new StudentInfo();
		s1.name="Vamsi Krishna Reddy";
		s1.age=21;
		s1.address="Hyderabad";
		System.out.println(s1.name);
		System.out.println(s1.address);	
		System.out.println(s1.age);
		
				
		
		
	}
 static int add(int a,int b) {
	 int result=a+b;
	 return result;
	 
 }
}
