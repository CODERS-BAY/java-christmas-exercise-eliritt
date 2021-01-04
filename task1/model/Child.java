package model;

public class Child {

	public String name;
	public int age;
	public String city;
	public Presents wish;
	
	public Child (String name, int age, String city, Presents wish) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.wish = wish;
	}
	
	public Child () {
		this.name = "Dagobert Duck";
		this.age = 73;
		this.city = "Entenhausen";
		this.wish = new Presents();
	}
}