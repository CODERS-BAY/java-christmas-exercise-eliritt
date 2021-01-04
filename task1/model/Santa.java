package model;

import view.Console;

public class Santa {

	public static void generateWishList() {
		
		System.out.println("Folgende Wünsche wurden eingetragen:");
		
		for (int i = 0; Console.children[i] != null; i++) {
			System.out.println(Console.children[i].name + ", " + Console.children[i].age + ", " + Console.children[i].city + ", "+ Console.children[i].wish);
			}
		}
	
	public static void viewPresents() {
		System.out.println("Folgende Geschenke wurden angefordert:");
		
		for (int i = 0; Console.stock[i] != null; i++) {
			System.out.println(Console.stock[i].name + ", " + Console.stock[i].city);
	}
	}
}