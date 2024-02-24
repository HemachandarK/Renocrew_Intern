import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prac55qn2 {
    public static void main(String args[]) throws SQLException, IOException {
		try {
		Connection con=ConnectionProvider.getConnection();
		String q="update detail set tName=?, City=? where tId=?";
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		PreparedStatement ps=con.prepareStatement(q);
		System.out.println("Enter name:");
		String name=br.readLine();
		
		System.out.println("Enter City:");
		String city=br.readLine();
		
		System.out.println("Enter Id:");
		int id=Integer.parseInt(br.readLine());
		ps.setString(1,name);
		ps.setString(2,city);
		ps.setInt(3,id);
		ps.executeUpdate();
		System.out.println("Success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
