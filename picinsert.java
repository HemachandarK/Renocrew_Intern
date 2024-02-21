package newjdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class picinsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","hemsmysql3");
			String q= "insert into pic(pic) values(?)";
			PreparedStatement s=con.prepareStatement(q);
			FileInputStream fis=new FileInputStream("/Users/hemachandark/Documents/documents/IMG_20220321_223341.jpg");
			s.setBinaryStream(1,fis,fis.available());
			s.executeUpdate();
			System.out.println("inserted");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
