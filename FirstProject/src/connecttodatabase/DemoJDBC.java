package connecttodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoJDBC {
	static String retry="No";
	public static void main(String[] args) {
		DemoJDBC d1=new DemoJDBC();
		
		do {
			
		
		int choice=DemoJDBC.Menu();
		switch (choice) {
		case 1: {
			
			DemoJDBC.insert();
			DemoJDBC.Menu();
			break;
		}
		case 2: {
			DemoJDBC.Fetch();

			break;
		}
		
		case 3: {
				DemoJDBC.Delete();
			break;
		}
		
		}
		
		
		}while(retry!="No");
	
	}
	
	public static int Menu() {
		 Scanner s2=new Scanner(System.in);
		System.out.println("Menu is here....");
			
		System.out.println(" 1. Insert the details");
		System.out.println(" 2. Delete the details");
		System.out.println(" 3. Fetch the details");
		
		System.out.println("Select your menu option!");
		int a=s2.nextInt();
		
		return a;
		
		}
	
	
	public static void insert() {
		
		
		//DemoJDBC.EnterDetails();
		System.out.println("Enter the name :");
		 Scanner s1=new Scanner(System.in);
		 
		 String name=s1.next();
		 
		 System.out.println("Enter the address :");
		 String address=s1.next();
		 System.out.println("Enter the city :");
		 String city=s1.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
			Statement statement = connection.createStatement();
			String sql = "INSERT INTO details (`Name`,`Address`,`City`) VALUES ('"+name+"','"+address+"','"+city+"')";
	        
			statement.executeUpdate(sql);
			System.out.println("Connection success");

					}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	 
	}
	
	public static void Delete() {
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the name to delete the data from table");
		String a1=s3.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
			Statement statement = connection.createStatement();
			String sql = "delete from details " +
	                "where name='"+a1+"' ";
	        
			statement.executeUpdate(sql);
			System.out.println("Deleted  successfully");

					}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	 
	}
	
	
	public static void Fetch() {
		
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the name to fetch the detais;");
		String a1=s3.next();
		String QUERY =  "select * from details " +
                "where Name='"+a1+"' ";

		
		 try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
		         Statement stmt = connection.createStatement();
		         ResultSet rs = stmt.executeQuery(QUERY);
		      ) {		      
		         while(rs.next()){
		            //Display values
		            System.out.print("Name: " + rs.getString("Name"));
		            System.out.print(", Address: " + rs.getString("Address"));
		            System.out.print(", City: " + rs.getString("City"));
		            
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
	
	}
	
}


