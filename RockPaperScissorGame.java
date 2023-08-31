import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    // Function to get user input
    public static String getUserChoice() {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your choice (rock, paper, scissors): ");

        // Store user input
        String choice = sc.nextLine();

        return choice;
    }

    // Function to generate computer choice
    public static String getComputerChoice() {
        // Create a Random object
        Random rand = new Random();

        // Generate a random number between 0 and 2
        int randomNum = rand.nextInt(3);

        // Use random number to determine computer choice
        if (randomNum == 0) {
            return "rock";
        } else if (randomNum == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Function to determine the winner of the game
    public static String determineWinner(String userChoice, String computerChoice) {
        // Compare user and computer choices
        if (userChoice.equals(computerChoice)) {
            return "tie";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "user";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "user";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "user";
        } else {
            return "computer";
        }
    }

    public static void main(String[] args) {
        while (true) {
            // Get user and computer choices
            String userChoice = getUserChoice();
            String computerChoice = getComputerChoice();

            // Determine the winner
            String winner = determineWinner(userChoice, computerChoice);

            // Print the results
            System.out.println("User choice: " + userChoice);
            System.out.println("Computer choice: " + computerChoice);
            System.out.println("Winner: " + winner);
        }
    }
}
