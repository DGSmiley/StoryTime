package storytime;

import java.util.Scanner;

public class storyTimeProject {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		// Ask user to input their name
		System.out.println("Welcome! What is your name?  (enter your name): ");
		String name = userInput.nextLine();
		
		System.out.println("Would you like to play a game? (enter yes or no): ");
		String choice = userInput.nextLine();
		
		
		if (choice.equals("yes")) {
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What do you do? (enter face the beast or run away)");
		String option = userInput.nextLine();
		switch (option) {
		case "run away":
			break;
		case "face the beast":
			System.out.println("You approach the dragon. You see that it has");
			break;
		}
		}	
						
		
		
			
		}
			
	}


