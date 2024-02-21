package newjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class runtimeinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","hemsmysql3");
			String q= "insert into detail(tName,City) values(?,?)";
			PreparedStatement s=con.prepareStatement(q);
			BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Enter name :");
			String name=br.readLine();
			System.out.println("Enter city:");
			String city=br.readLine();
			s.setString(1,name);
			s.setString(2,city);
			s.executeUpdate();
			System.out.println("inserted");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
