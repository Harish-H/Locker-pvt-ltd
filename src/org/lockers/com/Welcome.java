package org.lockers.com;

public class Welcome {
	public static void main(String[] args) {
		// Welcome Page

		System.out.println("Welcome to Lockers.com");
		System.out.println("Developed By HARISH H \n");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		Boolean validation = new Login().login();

		if (validation == true) {
			System.out.println("Welcome to Lockers.com");
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println("Developed By HARISH H");
			System.out.println();
			// Call UserInterface function
			UserInterface ui = new UserInterface();
			ui.userInterface();
		} else {
			System.out.println("Not a valid User ");
		}

	}

}
