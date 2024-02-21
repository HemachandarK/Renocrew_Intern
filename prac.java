package newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","hemsmysql3");
			Statement s=con.createStatement();
			String q= "create table detail(tId int(20) primary key auto_increment,tName varchar(20) not null, City varchar (40))";
			s.executeUpdate(q);
			System.out.println("created");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
