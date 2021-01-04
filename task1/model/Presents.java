package model;

public class Presents {

	public String name;
	public String city;

	public Presents (String name, String city) {
		this.name = name;
		this.city = city;
	}
	
	public Presents () {
		this.name = "Friede, Freude, Eierkuchen";
		this.city = "Vienna";
	}
}