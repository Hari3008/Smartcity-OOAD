package smartcitymini;



public class HotelsChennai  {
	public HotelsChennai() {
		String text1="Barbeque Nation\nName: Barbeque nation\nAddress: Ground Floor, Shri Devi Park Hotel, No.1,, Hanumantha Rd, T Nagar, Chennai, Tamil Nadu 600017\nPhone:044 6060 0000\nReviews: 4.4 stars";
		String text2="Faruuzi\nName:Faruuzi\nAddress: 407/7, Chennai Theni Hwy, Chromepet, Chennai, Tamil Nadu 600044\nPhone:044 4304 2644\nReviews: 4.2";
		String text3="The Flying Elephant\nName: The Flying Elephant\nFood: Veg and Non veg\nAddress: PARK HYATT CHENNAI, 39, Velachery Main Road, Guindy, Raj Bhavan, Chennai, Tamil Nadu 600032\nPhone:044 7177 1655\nReviews: 3.9";
		String text4="Daalchini\nName:Daalchini\nFood : Vegetarian\nAddress: No. Near New Saravana Store, 130, Chennai Theni Hwy, Guindy Industrial Estate, Chakrapani Colony, Chromepet, Chennai, Tamil Nadu 600044\nPhone:074010 22232\nReviews: 3.6 stars";
		String text5="Alreef\nName: Alreef\nFood: Indian\nAddress: 703, Mosque Building, Pallavaram 200 Feet Road, Near Chennai 1 EIFFEL Tower, Okkiyam Thuraipakkam, Chennai, Tamil Nadu 600100\nPhone:044 2978 0567\nReviews: 3.6 stars";
		String text6="Benjarong\nName: Benjarong\nAddress: 146, TT Krishnamachari Road, Alwarpet, Chennai, Tamil Nadu 600018\nPhone:044 2432 2640\nReviews:4.2 stars";

		String img1 = ".//img//Chennai//Barbeque Nation.jepg";
		String img2 = ".//img//Chennai//Faruuzi.jepg";
		String img3 = ".//img//Chennai//The Flying Elephant.jepg";
		String img4 = ".//img//Chennai//Daalchini.jepg";
		String img5 = ".//img//Chennai//Alreef.jepg";
		String img6 = ".//img//Chennai//Benjarong.jepg";

		String cityname = "Chennai";
	
		Hotels h = new Hotels(text1,text2,text3,text4,text5,text6,img1,img2,img3,img4,img5, img6, cityname);
	}
}