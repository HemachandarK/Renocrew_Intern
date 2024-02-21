package newjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class firstjdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","root","hemsmysql3");
		System.out.println("Connected");
		Statement s=con.createStatement();
		String q="select * from student";
		ResultSet rs=s.executeQuery(q);
		while(rs.next()) {
			String n=rs.getString("name");
			int i=rs.getInt("id");
			System.out.println(n);
			System.out.println(i);
		}
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
 