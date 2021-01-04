package view;

import model.Child;

import model.Presents;

import model.Santa;

import java.util.Scanner;

public class Console {
	
	public static final int size = 50;

	public static Child[] children = new Child[size];
	
	public static Presents[] stock = new Presents[size];
	
	public static Presents[] sledge = new Presents[size];
	
	public int childrenIndex = 0;
	
	public int stockIndex = 0;
	
	public void dialog() {
	
		boolean running = true;
				
		while(running) {
			System.out.println("Please login:");
			System.out.println("Press S for Santa, E for Elf and any other key for Child.");
			Scanner myScanner = new Scanner(System.in);
			String input1 = myScanner.nextLine();
	
			if(input1.equalsIgnoreCase("S") ) {
				System.out.println("Hello! Please enter your super-secret Santa password here:");
				String input2 = myScanner.nextLine();
				int santaPassword = Integer.parseInt(input2);
			
				if(santaPassword == 12345) {
					System.out.println("Ho Ho Ho Santa! Let's get to work!");
					
					boolean working = true;
					
					while(working) {
					System.out.println("What would you like to do? Press C for a list of the Children, press S for looking at the Sledge and P for looking at the Presents.");
			
					String input3 = myScanner.nextLine();
			
					switch(input3.toLowerCase()) {
						case "c": Santa.generateWishList();
								break;
						case "s": //TODO Insert Method here
								break;
						case "p": Santa.viewPresents();
								break;
						default: System.out.println("Please try again and select a valid character!");
					}
					
					System.out.println("Would you like to Continue (C) or exit (X)?");
					String input4 = myScanner.nextLine();
					
					if(input4.equalsIgnoreCase("X")) {
						working = false;
						System.out.println("");
						System.out.println("Bye Bye, Santa! See you soon!");
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					}
					}
			
		} else {
			System.out.println("Sorry, this is the wrong password. Please start again.");
		}
		
	} else if(input1.equalsIgnoreCase("E") ) {
		System.out.println("Hello Random Elf! Please enter your name:");
		String inputElfName = myScanner.nextLine();
		
		System.out.println("Ho Ho Ho " + inputElfName + "! Let's get to work!");
		
		boolean doing = true;
		
		while(doing) {
		System.out.println("What would you like to do? Press L for Loading the Sledge, S for Sorting the presents on the Sledge and X for Letting it snow!");
		String inputElfChoice = myScanner.nextLine();
		
		switch(inputElfChoice.toLowerCase()) {
		case "l": //TODO Insert Method here
					break;
		case "s": //TODO Insert Method here
					break;
		case "x": //TODO Insert Method here
					break;
		default: System.out.println("Please try again and select a valid character!");
		}
		
		System.out.println("Would you like to Continue (C) or exit (X)?");
		String input5 = myScanner.nextLine();
		
		if(input5.equalsIgnoreCase("X")) {
			doing = false;
			System.out.println("");
			System.out.println("Bye Bye, " + inputElfName + "! See you soon!");
			System.out.println("");
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
			System.out.println("");
		}
		}
		
	} else {
		System.out.println("Hello Random Child! You want to make your wish? Please enter your name:");
		String inputChildName = myScanner.nextLine();
		
		System.out.println("Enter your age:");
		int inputChildAge = Integer.parseInt(myScanner.nextLine());
		
		System.out.println("Enter your city:");
		String inputChildCity = myScanner.nextLine();
		
		System.out.println("Make your wish! Enter anything you wish for Christmas! But remember: Only one wish per child!");
		String inputChildWish = myScanner.nextLine();
		
		Presents wish = new Presents (inputChildWish, inputChildCity);
		toStockArray(wish);
				
		Child child = new Child(inputChildName, inputChildAge, inputChildCity, wish);
		toChildrenArray(child);
		
		System.out.println("");
		System.out.println("Thank you for choosing Santa Inc. for making your wish! We're at your service 24/7/365!");
		System.out.println("We wish you a Merry Christmas! Bye bye!");
		System.out.println("");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("");
	}
}
}

	void toChildrenArray(Child child) {
		children[childrenIndex++] = child;
	}
	
	void toStockArray(Presents wish) {
		stock[stockIndex++] = wish;
	}	
}
		