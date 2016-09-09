package storytime;

import java.util.Scanner;

public class storyTimeProject {


	public static void main(String[] args) {
	 
		 
		Scanner userInput = new Scanner(System.in);
		
		// Ask user to input their name
		System.out.println("Welcome! What is your name?  (enter your name): ");
		String name = userInput.nextLine();
		
		System.out.println("Would you like to play a game? (yes or no): ");
		String choice = userInput.nextLine();
		
		
		if (choice.equals("yes")) {
			System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What do you do? (face the beast or run away)");
		String option = userInput.nextLine();
		switch (option) {
		case "run away":
			System.out.println("You live another day");
			break;
		case "face the beast":
			System.out.println("You approach the dragon. You see that it has _ heads  (1, 2 or 3)");
			int value = userInput.nextInt();
			if (value == 1){
				System.out.println("A One-headed Dragon");
			break; }
			else if (value == 2) {
				System.out.println("A Twin-headed Dragon");
				break; }
			else if (value == 3) {
				System.out.println("No one has ever faced a Tri-headed Dragon before!");
			}
		
			}
			System.out.println("Choose your weapon (Slingshot, Sword or Bow)");
			String weapon = userInput.next();
			
			switch (weapon) {
			case "slingshot":
				System.out.println("Armed with your Slingshot, you approach the Dragon");
				break;
			case "sword":
				System.out.println("Armed with your sword, you approach the Dragon");
				break;
			case "bow":
				System.out.println("Armed with your bow, you approach the Dragon");
				break; }
				
				System.out.println("As you get closer, you notice that the Dragon has ____ colored eyes");
				String eyes = userInput.next();
				
				System.out.println("Well aren't you lucky because Dragons with " + eyes + " colored eyes are friendly");
				
				System.out.println("You call the Dragon _____");
				String dName = userInput.next();
				
				System.out.println(name + " and " + dName + " part ways peacefully after a fun and exciting day.");
			
		}
		}	
	}				
		
			