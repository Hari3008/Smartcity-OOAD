package smartcitymini;

import java.sql.*;

import javax.swing.JOptionPane;

public class DbConnect {
	Connection connect=null;
	public static Connection dataConnector()
	{
		
		try
		{
//			Class.forName("org.sqlite.JDBC");
//			Connection connect=DriverManager.getConnection("jdbc:sqlite:E:\\accounts.db");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "hari2001");

			return connect;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	

}