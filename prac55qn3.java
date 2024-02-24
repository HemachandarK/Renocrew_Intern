import java.sql.Connection;
import java.sql.ResultSet;

public class prac55qn3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="select * from detail";
			
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery(q);
			
			while(rs.next()) {
				int i=rs.getInt(1);
				String n=rs.getString(2);
				String c=rs.getString(3);
				System.out.println(i+":"+n+':'+c);
			}
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}

	}
}
