package smartcitymini;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_LBlore extends JPanel {


	 JButton goback; 
	 JLabel back1;
	 public B_LBlore() {
		 
		String b1="Name: Elanza\nLocation : No. 88/2, Richmond Road, Bengaluru, Karnataka 560025\nPhone:080 2223 3666\nReviews : 4 stars";
		String i1 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging1-elanza.jpg";
//		            "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-sophiashighschool.jpg";
		String b2=" Name: Oberoi\nLocation : 37-39, MG Road, Bengaluru, Karnataka 560001\nPhone:080 2558 5858\nReviews : 5 stars ";
		String i2 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging1-oberoi.jpg";
		String b3="Name: Royal Orchid\nLocation :1, Golf Avenue, Adjoining KGA Golf Course, HAL Airport Rd, Bengaluru, Karnataka 560008\nPhone: +91 80 4178 3000\nReviews : 5 stars";
		String i3 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging4-royalorchid.jpg";
		String b4="Name: Trinity Suites\nLocation :1/3, Artillery Road, Cambridge Layout, Ulsoor, Bengaluru, Karnataka 560008\nPhone:080 4164 6100\nReviews : 4.7 stars";
		String i4 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging5-trinitysuites.jpg";		
		String b5="Name: Leela Palace\nLocation :23, HAL Airport Rd, ISRO Colony, Domlur, Bengaluru, Karnataka 560008\nPhone: 080 2521 1234\nReviews : 4.7 stars";
		String i5 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging3-leelapalace.jpg";
		String i6 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\lodging6-JWmarriot.jpg";
		String b6=" Name: JWmarriot\nLocation :24/1, Vittal Mallya Road, Bengaluru, Karnataka 560001\nPhone: 080671 89999\nReviews : 4.4 stars";
		
		String cityname = "Bangalore";
			 
		B_L b = new B_L(b1,b2,b3,b4,b5,b6,i1,i2,i3,i4,i5,i6,cityname);
	}


}