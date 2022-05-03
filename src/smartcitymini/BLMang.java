package smartcitymini;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BLMang extends JPanel {

	JButton goback; 
	JLabel back1;
	public BLMang() {
		String b1="Ginger hotel\nAddress: NH77, Near Infosys, Kottara Chowki Junction, Mangaluru, Karnataka 575006\nPhone:0824 666 3333\nReviews:3.6 stars";
		String i1 = ".//img//Mangalore//Ginger hotel.jpeg";

		String b2="The Saffron\nAddress: GHS Road, Hampankatta, Mangaluru, Karnataka 575001\nPhone:0824 425 5542\nRevies: 3.6 stars";
		String i2 = ".//img//Mangalore//The Saffron.jpeg";

		String b3=".Hotel Maya International\nAddress: Paramount West Gate, Opposite Mangalore Nursing Home, Balmatta - Kankanady Road, Mangaluru, Karnataka 575002\nPhone:0824 243 5111\nReviews:3.9 stars";
		String i3 = ".//img//Mangalore//Hotel Maya International.jpeg";
		
		String b4="The Gateway Hotel\nAddress: Old Port Road, Opp. D C Office, Mangaluru, Karnataka 575001\nPhone:0824 666 0420\nReviews:3.9 stars";
		String i4 = ".//img//Mangalore//The Gateway Hotel.jpeg";

		String b5="Goldfinch hotels\nAddress: Bunts Hostel Road, Near Jyoti Circle, Mangaluru, Karnataka 575003\nPhone:0824 424 5678\nReviews: 3.7 stars";
		String i5 = ".//img//Mangalore//Goldfinch hotels.jpeg";

		String b6="The Ocean Pearl\nAddress: Navabharath Circle, Kodialbail, Mangaluru, Karnataka 575003\nPhone:0824 241 3800\nReviews:4.3 stars";
		String i6 = ".//img//Mangalore//The Ocean Pearl.jpeg";
	
		String cityname = "Mangalore";
	
		B_L b = new B_L(b1,b2,b3,b4,b5,b6,i1,i2,i3,i4,i5,i6,cityname);
	}
}