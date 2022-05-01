package smartcitymini;



public class HotelsHyd  {
	public HotelsHyd() {
		String text1="Minerva\nName: Minerva\nFood type: vegetarian and non-vegetarian.\nBranches: Somajiguda, HimayathNagar, Jubilee Hills \nReviews : 4.5 stars";
		
		String text2="Ohri's\nName: Ohri's\nFood type: Veg and Nonveg\nBranches: Banjara Hills, Panjagutta, Hitech city\nReview: 4.5 stars  ";
		
		String text3="Bawarchi\nName: Bawarchi\nFood type: Nonveg and veg. famous for biryani\nBranches: Nallakunta\nReview: 4 stars";
		
		String text4="Tabla\n Name: Tabla\nFood type: Veg\nBranches: Jubilee Hills, Kukatpally\nReview: 4.5 stars";
		
		String text5="Paradise\nName: Paradise\nFood type: Nonveg and veg. famous for hyderabadi biryani\nBranches: Secunderabad\nReview: 5 stars";
		
		String text6="Marriott\nName: Marriott\nFood type: Nonveg and veg and chineese\nBranches: Hitech city\nReview: 5 stars";
		
		String img1 = ".//img//Hyderabad//hotel//Minerva.jpeg";
		String img2 = ".//img//Hyderabad//hotel//Ohri's.jpeg";
		String img3 = ".//img//Hyderabad//hotel//Bawarchi.jpeg";
		String img4 = ".//img//Hyderabad//hotel//Tabla.jpeg";
		String img5 = ".//img//Hyderabad//hotel//Paradise.jpeg";
		String img6 = ".//img//Hyderabad//hotel//Marriott.jpeg";
		
		String cityname = "Hyderabad";
		
		Hotels h = new Hotels(text1,text2,text3,text4,text5,text6,img1,img2,img3,img4,img5, img6, cityname);
	}
}
