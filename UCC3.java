import java.util.Scanner;

public class TicTacToeInput {

    // Method to get user input
    public static int getUserMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userMove = getUserMove();

        System.out.println("You selected slot: " + userMove);
    }
}