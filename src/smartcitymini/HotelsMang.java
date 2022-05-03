package smartcitymini;



public class HotelsMang  {
	public HotelsMang() {
		String text1="Chefs\nAddress: Surathkal, Opp Surathkal Post Office, Mangalore, Karnataka 575019\nPhone:0824 247 7606\nReviews:4 stars";
    
		
		String text2="Hao Ming\nAddress: Yenepoya Chambers, KMC Mercara Trunk Road, Balmatta, Upper Bendoar, Mangaluru, Karnataka 575001\nPhone:0824 221 8693\nReviews: 4.0 stars";
		
		
		String text3="Pallkhi\nAddress: 3rd Floor, Tej Towers, Balmatta Road, Opp. Jyothi Cinema, Mangaluru, Karnataka 575001\nPhone:090190 21553\nReviews:4.2 stars";
		
		
		String text4=".Gajalee\nAddress: Circuit House Compound, Kadri Hills, Mangaluru, Karnataka 575004\nPhone:0824 222 1900\nReviews: 3.7 stars";
		
		String text5="Girimanja's\nAddress: Near Kalikamba Temple, Gopalkrishna Temple Road & Car St, Mangaluru, Karnataka 575001\nPhone:099000 00080\nReviews:4.8 stars";
		
		String text6="Village Restaurant\nAddress: Airport Rd, Yeyyadi, Mangaluru, Karnataka 575008\nPhone:0824 221 4158\nReviews:4.5 stars";
	
		String img1 = ".//img//Mangalore//Chefs.jpeg";
		String img2 = ".//img//Mangalore//Hao Ming.jpeg";
		String img3 = ".//img//Mangalore//Pallkhi.jpeg";
		String img4 = ".//img//Mangalore//Gajalee.jpeg";
		String img5 = ".//img//Mangalore//Girimanja's.jpeg";
		String img6 = ".//img//Mangalore//Village Restaurant.jpeg";
		
		String cityname = "Mangalore";
		
		Hotels h = new Hotels(text1,text2,text3,text4,text5,text6,img1,img2,img3,img4,img5, img6, cityname);
	}
}