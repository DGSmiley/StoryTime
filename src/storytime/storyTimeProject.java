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
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What do you do? (face the beast or run away)");
		String option = userInput.nextLine();
		switch (option) {
		case "run away":
			System.out.println("live another day");
			break;
		case "face the beast":
			System.out.println("You approach the dragon. You see that it has _ heads  (1, 2 or 3)");
			int value = userInput.nextInt();
			if (value == 1){
				System.out.println("A one-headed Dragon");
			break; }
			else if (value == 2) {
				System.out.println("A twin-headed Dragon");
				break; }
			else if (value == 3) {
				System.out.println("No one has ever faced a Tri-headed Dragon before!");
			}
			
			}
			System.out.println("Choose your weapon");
		}
		}	
						
		
		
			
		}
			
	


