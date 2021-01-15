package model;

import java.util.ArrayList;
import java.util.List;

public class Presents {

	public String name;
	public String city;
	
	public static List <Presents> stock = new ArrayList<>();

	public Presents (String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public Presents () {
		this.name = "Friede, Freude, Eierkuchen";
		this.city = "Vienna";
	}
	
	@Override
	public String toString() {
		return "Geschenk: " + name + ", Stadt: " + city;
	}
}