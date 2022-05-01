package smartcitymini;

public class MapBlore {
	
	public MapBlore() {

		String link = "https://www.google.com/maps?q=bangalore+city+map&um=1&ie=UTF-8&sa=X&ved=2ahUKEwiq3P7szL73AhWazjgGHRrmB7EQ_AUoAXoECAEQAw";
		String cityname = "Bangalore";
		
		Map m = new Map(link, cityname);
	}

}
