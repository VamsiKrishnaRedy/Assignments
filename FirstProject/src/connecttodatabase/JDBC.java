package connecttodatabase;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.*;
import java.util.*;

public class JDBC {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		String address=sc.nextLine();
		String city= sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
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

}
