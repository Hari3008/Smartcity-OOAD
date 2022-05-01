
package smartcitymini;

public class MapMlore {
	public MapMlore() {
		
		String link = "https://www.google.com/maps?q=mangalore+city+map&um=1&ie=UTF-8&sa=X&ved=2ahUKEwi4wMKvz773AhW1xzgGHZgqABUQ_AUoAXoECAEQAw";
		String cityname = "Mangalore";
		
		Map m = new Map(link, cityname);
	}
}
