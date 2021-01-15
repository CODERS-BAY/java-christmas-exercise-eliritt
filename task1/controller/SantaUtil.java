package controller;

import model.Child;
import model.Presents;
import model.Sledge;

public class SantaUtil {
	
	public static void generateWishList() {
		System.out.println("Here's a list of all children who made a wish:");
		System.out.println(Child.children);
		}
	
	public static void viewPresents() {
		System.out.println("Here's a list of all wished-for presents:");
		System.out.println(Presents.stock);
		}
	
	public static void viewSledge() {
		if(Sledge.sledge.isEmpty()) {
			System.out.println("The Sledge has not been loaded.");
		} else {
			System.out.println("The Sledge is loaded.");
			System.out.println(Sledge.sledge.toString());
		}
	}
}