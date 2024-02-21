package newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertdata {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","hemsmysql3");
			String q= "insert into detail(tName,City) values(?,?)";
			PreparedStatement s=con.prepareStatement(q);
			s.setString(1,"tom");
			s.setString(2,"newyork");
			s.executeUpdate();
			System.out.println("inserted");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
