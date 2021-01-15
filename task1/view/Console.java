package view;

import model.Child;

import model.Presents;

import model.Santa;

import java.util.Scanner;

import controller.ChildUtil;
import controller.ElfUtil;
import controller.PresentsUtil;
import controller.SantaUtil;

public class Console {
	
	public void dialog() {
	
		boolean running = true;
				
		while(running) {
			System.out.println("Please login:");
			System.out.println("Press S for Santa, E for Elf and any other key for Child.");
			Scanner myScanner = new Scanner(System.in);
			String role = myScanner.nextLine();
	
			if(role.equalsIgnoreCase("S") ) {
				System.out.println("Hello! Please enter your super-secret Santa password here:");
				String santaInput1 = myScanner.nextLine();
				int santaPassword = Integer.parseInt(santaInput1);
			
				if(santaPassword == Santa.getSantaPassword()) {
					System.out.println("Ho Ho Ho Santa! Let's get to work!");
					
					boolean working = true;
					
					while(working) {
					System.out.println("What would you like to do? Press C for a list of the Children, press S for looking at the Sledge and P for looking at the Presents.");
			
					String santaInput2 = myScanner.nextLine();
			
					switch(santaInput2.toLowerCase()) {
						case "c": SantaUtil.generateWishList();
								break;
						case "s": SantaUtil.viewSledge();
								break;
						case "p": SantaUtil.viewPresents();
								break;
						default: System.out.println("Please try again and select a valid character!");
					}
					
					System.out.println("Would you like to Continue (C) or exit (X)?");
					String santaInput3 = myScanner.nextLine();
					
					if(santaInput3.equalsIgnoreCase("X")) {
						working = false;
						System.out.println("");
						System.out.println("Bye Bye, Santa! See you soon!");
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					}
					}
			
					} else {
					System.out.println("This is the wrong password. Please start again.");
					}
		
				} else if(role.equalsIgnoreCase("E") ) {
					System.out.println("Hello Random Elf! Please enter your name:");
					String elfInputName = myScanner.nextLine();
		
					System.out.println("Ho Ho Ho " + elfInputName + "! Let's get to work!");
		
					boolean doing = true;
		
					while(doing) {
						System.out.println("What would you like to do? Press L for Loading the Sledge, S for Sorting the presents on the Sledge and X for Letting it snow!");
						String elfInputChoice = myScanner.nextLine();
		
						switch(elfInputChoice.toLowerCase()) {
							case "l": ElfUtil.ElfLoading();
									break;
							case "s": ElfUtil.ElfSorting();
									break;
							case "x": ElfUtil.ElfSnowing();
								break;
							default: System.out.println("Please try again and select a valid character!");
							}
		
						System.out.println("Would you like to Continue (C) or exit (X)?");
						String elfInputContinue = myScanner.nextLine();
		
						if(elfInputContinue.equalsIgnoreCase("X")) {
							doing = false;
							System.out.println("");
							System.out.println("Bye Bye, " + elfInputName + "! See you soon!");
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println("");
							}
						}
		
				} else {
					System.out.println("Hello Random Child! You want to make your wish? Please enter your name:");
					String childInputName = myScanner.nextLine();
		
					System.out.println("Enter your age:");
					int childInputAge = Integer.parseInt(myScanner.nextLine());
		
					System.out.println("Enter your city:");
					String childInputCity = myScanner.nextLine();
		
					System.out.println("Make your wish! Enter anything you wish for Christmas! But remember: Only one wish per child!");
					String childInputWish = myScanner.nextLine();
		
					Presents wish = new Presents (childInputWish, childInputCity);
					PresentsUtil.toStockArray(wish);
				
					Child child = new Child(childInputName, childInputAge, childInputCity, wish);
					ChildUtil.toChildrenArray(child);
		
					System.out.println("");
					System.out.println("Thank you for choosing Santa Inc. for making your wish! We're at your service 24/7/365!");
					System.out.println("");
					System.out.println("We wish you a Merry Christmas! Bye bye!");
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
					}
				}
	}
}		