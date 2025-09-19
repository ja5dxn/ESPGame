/*
 * Class: CMSC203 
 * Instructor: Prof. Thai
 * Description: This program is a guessing game with colors where the user has to guess colors from a file.
 * Due: 09/19/2025
 * Platform/compiler: Java
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Jayden Esperanza
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ESPGame {

	public static void main(String[] args) throws FileNotFoundException {
		// These are constants for the total colors and the file name
		final int TOTAL_COLORS = 16;
		final String COLOR_FILE = "colors.txt";
		
		// Scanner for the user input and the file reading
		Scanner keyboard = new Scanner(System.in);
		Scanner fileScanner = null;
		

		// These are variables to store colors from the file.
		String color1 = "";
		String color2 = "";
		String color3 = "";
		String color4 = "";
		String color5 = "";
		String color6 = "";
		String color7 = "";
		String color8 = "";
		String color9 = "";
		String color10 = "";
		String color11 = "";
		String color12 = "";
		String color13 = "";
		String color14 = "";
		String color15 = "";
		String color16 = "";
		// This opens the file and reads the colors into the variables
		fileScanner = new Scanner(new File (COLOR_FILE));
		int numberOfColors = 1;
		while (fileScanner.hasNextLine() && numberOfColors <=16) {
			String line = fileScanner.nextLine();
			if (numberOfColors == 1) {
			color1 = line;
			} else if (numberOfColors == 2) {
			color2 = line;
			} else if (numberOfColors == 3) {
			color3 = line;
			} else if (numberOfColors == 4) {
			color4 = line;
			} else if (numberOfColors == 5) {
			color5 = line;
			} else if (numberOfColors == 6) {
			color6 = line;
			} else if (numberOfColors == 7) {
			color7 = line;
			} else if (numberOfColors == 8) {
			color8 = line;
			} else if (numberOfColors == 9) {
			color9 = line;
			} else if (numberOfColors == 10) {
			color10 = line;
			} else if (numberOfColors == 11) {
			color11 = line;
			} else if (numberOfColors == 12) {
			color12 = line;
			} else if (numberOfColors == 13) {
			color13 = line;
			} else if (numberOfColors == 14) {
			color14 = line;
			} else if (numberOfColors == 15) {
			color15 = line;
			} else if (numberOfColors == 16) {
			color16 = line;
			}
			numberOfColors++;
		}
		fileScanner.close(); // This closes the file scanner
		
	// These are variables for the user input and game status
	String userInputName;
	String userInputDescription; 
	String userDueDate;
	String continueGame= "Yes";
	int correctCount = 0;
	// This is a welcome message, greeting the user into the game
	System.out.println("Test your 6th sense (ESP skills)");
	System.out.println("Welcome to the ESP game");
	
	// Main loop for the game
	while (continueGame.equalsIgnoreCase("Yes")) {
		int option = 0;
		boolean validOption = false;
		
		while (!validOption) {
			System.out.println("Chose one of the four following options from the menu bellow: "); 
			System.out.println("Option 1 Display the first 16 colors");
			System.out.println("Option 2 Display the first 10 colors");
			System.out.println("Option 3 Display the first 5 colors");
			System.out.println("Option 4 Exit the game");
			System.out.println("Enter the option # : ");
			
			if (keyboard.hasNextInt()) {
				option = keyboard.nextInt();
				keyboard.nextLine(); // It takes the newline
				if (option >= 1 && option <= 4) {
					validOption = true;
				} else {
					System.out.println("Invalid option. Please enter any # from 1-4.");
				}
			} else {
					System.out.println("Invalid input. Enter a number 1-4.");
					keyboard.nextLine(); // It takes the invalid input
			}
		}
		// If the user chooses to exit the game he pick this option
		if (option == 4) {
			// File to save game results
			PrintWriter outputFile = new PrintWriter ("ESPGameResults.txt");
			System.out.println("Enter your Name: ");
			userInputName = keyboard.nextLine();
			
			System.out.println("Describe your self: ");
			userInputDescription = keyboard.nextLine();
			
			System.out.println("Enter the due date (MM/DD): ");
			userDueDate = keyboard.nextLine();
			
			// This saves the results to the file
			outputFile.println("\nGAME OVER");
			outputFile.println("You guessed " + correctCount + " out of 3 colors correctly.");
			outputFile.println("Due Date: " + userDueDate);
			outputFile.println("Username: " + userInputName);
			outputFile.println("User Description: " + userInputDescription);
			
			outputFile.close();
			
			// This prints the results to the console
			System.out.println("\nGAME OVER");
			System.out.println("You guessed " + correctCount + " out of 3 colors correctly.");
			System.out.println("Username: " + userInputName);
			System.out.println("Description: " + userInputDescription);

			break; // This ends the game by exiting the loop
		} 
	
		// This displays colors based on the user input from the menu options
		if (option == 1) {
			System.out.println("There are 16 colors from a file");
			System.out.println("1 " + color1 + "\n2 " + color2 + "\n3 " + color3 + "\n4 " + color4);
			System.out.println("5 " + color5 + "\n6 " + color6 + "\n7 " + color7 + "\n8 " + color8);
			System.out.println("9 " + color9 + "\n10 " + color10 + "\n11 " + color11 + "\n12 " + color12);
			System.out.println("13 " + color13 + "\n14 " + color14 + "\n15 " + color15 + "\n16 " + color16);
		} else if (option == 2) {
			System.out.println("There are 10 colors from a file");
			System.out.println("1 " + color1 + "\n2 " + color2 + "\n3 " + color3 + "\n4 " + color4);
			System.out.println("5 " + color5 + "\n6 " + color6 + "\n7 " + color7 + "\n8 " + color8);
			System.out.println("9 " + color9 + "\n10 " + color10);
		} else if (option == 3) {
			System.out.println("There are 5 colors from a file");
			System.out.println("1 " + color1 + "\n2 " + color2 + "\n3 " + color3 + "\n4 " + color4 + "\n5 " + color5);
		}

		// This does 3 rounds of guessing
		for (int round = 1; round <= 3; round++) {
			System.out.println("\nRound " + round);
			System.out.println("\nI am thinking of a color from the file.");
			
			int maxColors = 0;
			
			// This sets the max amount of colors an option can have
			if (option == 1) {
				maxColors = 16;
			} else if (option == 2) {
				maxColors = 10;
			} else if (option == 3) {
				maxColors = 5;
			}
			// This picks a random color
			int random = 1 + (int) (Math.random() * maxColors);
			String chosenColor = "";
			if (random == 1) chosenColor = color1;
			if (random == 2) chosenColor = color2;
			if (random == 3) chosenColor = color3;
			if (random == 4) chosenColor = color4;
			if (random == 5) chosenColor = color5;
			if (random == 6) chosenColor = color6;
			if (random == 7) chosenColor = color7;
			if (random == 8) chosenColor = color8;
			if (random == 9) chosenColor = color9;
			if (random == 10) chosenColor = color10;
			if (random == 11) chosenColor = color11;
			if (random == 12) chosenColor = color12;
			if (random == 13) chosenColor = color13;
			if (random == 14) chosenColor = color14;
			if (random == 15) chosenColor = color15;
			if (random == 16) chosenColor = color16;
			// This asks the user to guess
			System.out.println("What is your guess? Enter it here: ");
			String guess = keyboard.nextLine();
			// This checks if the user got the guess correct.
			if (guess.equalsIgnoreCase(chosenColor)) {
				correctCount++;
				System.out.println("Correct. I was thinking of the color " + chosenColor + ".");
			} else {
				System.out.println("Wrong. I was thinking of the color " + chosenColor + ".");
			}
		}
			// This asks the user if they would like to play again
			System.out.println("Would you like to play another round? Type Yes/No: ");
			continueGame = keyboard.nextLine();
	}
	// Goodbye message
	System.out.println("Thank you for playing the ESP game.");
	System.out.println("Programer: Jayden Esperanza");
	// Closes the files and scanners
	keyboard.close();
	}
}
