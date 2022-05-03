package smartcitymini;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BLChennai extends JPanel {

	JButton goback; 
	JLabel back1;
	public BLChennai() {
		
		String b1="Name: Ginger Hotel Chennai\nAddress: IITM No. 1 FA, 11th Floor, Behind Tidel, IIT Madras Research Park, Kanagam Rd, Kanagam, Park Town, Chennai, Tamil Nadu 600113\nPhone:044 6666 3333\nReviews: 3.2 stars";
		String i1 = ".//img//gingerhotel.jpg";
		
		String b2=" Name: Hyatt Regency Chennai\nAddress: 365, Anna Salai, Teynampet, Chennai, Tamil Nadu 600018\nPhone:044 6100 1234\nReviews: 4.2 stars";
		String i2 = ".//img//hyattregencychennai.jpg";
		
		String b3="Name: Leela palace\nAddress: Adyar Seaface, M.R.C Nagar, Chennai, Tamil Nadu 600028\nPhone:044 3366 1234\nReviews: 4.6 stars";
		String i3 = ".//img//leelapalace.jpg";
		
		String b4="Name: Hotel Chennai Deluxe\nAddress: Block No. 1, Plot No. 5, E Road, Koyambedu, Near Omni Bus Stop, Opp Kamaraj Flower Market, Chennai, Tamil Nadu 600107\nPhone:044 2479 9911\nReviews : 4.3 stars";
		String i4 = ".//img//hotelchennaideluxe.jpg";
		
		String b5="Name: Lemon tree hotel\nAddress: 72, Sardar Patel Rd, Venkta Puram, Guindy, Chennai, Tamil Nadu 600032\nPhone:044 4423 2323\nReviews:3.6";
		String i5 = ".//img//lemontreehotel.jpg";
		
		String b6="Name: Radisson Blu Hotel GRT Chennai\nAddress: No. 531, GST Road, St. Thomas Mount, Chennai, Tamil Nadu 600016\nPhone:044 2231 0101\nReviews:4.2 stars";
		String i6 = ".//img//radissonblu.jpg";
		
		String cityname = "Chennai";
		
		B_L b = new B_L(b1,b2,b3,b4,b5,b6,i1,i2,i3,i4,i5,i6,cityname);
	}
}