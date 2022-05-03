package smartcitymini;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BLHyd extends JPanel {

	JButton goback; 
	JLabel back1;
	public BLHyd() {
		String b1="Name:City Park\nLocation -  5-8-450/1, Chirag Ali Ln, Abids, Hyderabad, Telangana 500001\nPhone - 040 6610 5510\nReview - 3.8";
		String i1 = ".//img//Hyderabad//lodges//City Park.jpeg";

		String b2="Name:Grand Elite\nLocation: 5-4-790/2, Gowardhan Chambers , Abids, Lane Adj. Metro Foot Wear, Nampally Station Road, Hyderabad, Telangana 500001\nPhone: 040 6590 5510\nReview - 4.2";
		String i2 = ".//img//Hyderabad//lodges//Grand Elite.jpeg";

		String b3="Name: Oakwood Residence\nLocation: Survey No. 115/1, Kapil Towers, IT Park, Nanakramguda, Financial District, Gachibowli, Hyderabad, Telangana 500032\nPhone: 040 6635 9999\nReview: 4.2";
		String i3 = ".//img//Hyderabad//lodges//Oakwood Residence.jpeg";

		String b4="Name: Lotus Grand\nLocation: Survey No. 115/1, Kapil Towers, IT Park, Nanakramguda, Financial District, Gachibowli, Hyderabad, Telangana 500032\nPhone:080 5522 6100\nReviews : 4.5 stars";
		String i4 = ".//img//Hyderabad//lodges//Lotus Grand.jpeg";

		String b5="Name: Red Fox\nLocation: Plot No. 2, Survey No. 64, Hitech City, Madhapur, Hyderabad, Telangana 500081\nPhone: 080 2521 9934\nReviews : 4.7 stars";
		String i5 = ".//img//Hyderabad//lodges//Red Fox.jpeg";

		String b6=" Name: The Golkonda\nLocation: 10-1-124, Opp. Jntu, Masab Tank, Banjara Hills, Hyderabad, Telangana 500028\nPhone: 080671 83399\nReviews : 4.5 stars";
		String i6 = ".//img//Hyderabad//lodges//The Golkonda.jpeg";
		
		String cityname = "Hyderabad";
	
		B_L b = new B_L(b1,b2,b3,b4,b5,b6,i1,i2,i3,i4,i5,i6,cityname);
		}
	}