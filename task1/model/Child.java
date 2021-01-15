package model;

import java.util.ArrayList;
import java.util.List;

public class Child {

	public String name;
	public int age;
	public String city;
	public Presents wish;
	
	public static List <Child> children = new ArrayList<>();
	
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
	
	@Override
	public String toString() {
		return "Name: " + name + ", Alter: " + age + ", " + wish;
	}
}