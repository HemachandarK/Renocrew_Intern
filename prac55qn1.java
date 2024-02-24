import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class prac55qn1 {
    public static void main(String args[]) throws SQLException, IOException {
		try {
		Connection con=ConnectionProvider.getConnection();
		String q="insert into pic(pic) values(?)";
		PreparedStatement st=con.prepareStatement(q);
		JFileChooser jf=new JFileChooser();
		jf.showOpenDialog(null);
		File f=jf.getSelectedFile();
		FileInputStream fis=new FileInputStream(f);
		st.setBinaryStream(1, fis,fis.available());
		st.executeUpdate();
		JOptionPane.showMessageDialog(null,"Success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
