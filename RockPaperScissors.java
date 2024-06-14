import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose rock, paper, or scissors
        System.out.println("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // Choice of Rock, Paper or Scissors
        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter rock, paper, or scissors: ");
            userChoice = scanner.nextLine().toLowerCase();
        }

        // Random choice for the computer
        String computerChoice = getRandomChoice();

        // Display choices
        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }

    // Method to randomly select rock, paper, or scissors
    public static String getRandomChoice() {
        Random random = new Random();
        int choice = random.nextInt(3); // Generates a random number between 0 and 2

        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "rock";
        }
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "WOOO! You win!!!";
        } else {
            return "Oh no...Computer wins!";
        }
    }
}
