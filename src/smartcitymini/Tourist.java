package smartcitymini;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Tourist {
	Tourist(String Name, String Username, String Password, String HomeTown){
	try {
		Connection connect=null;
		connect=DbConnect.dataConnector();
		String query = "INSERT INTO STUDENT(Name, Username, Password, HomeTown) VALUES (?,?,?,?)";
		PreparedStatement pst=connect.prepareStatement(query);
		
		pst.setString(1,Name);
		pst.setString(2,Username);
		pst.setString(3,Password);
		pst.setString(4,HomeTown);
		pst.execute();
		pst.close();
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
