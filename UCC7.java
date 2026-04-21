import java.util.Random;

public class ComputerMove {

    // Convert slot to row & column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-');
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Computer move logic
    public static void makeComputerMove(char[][] board, char symbol) {
        Random rand = new Random();
        int slot;
        int row, col;

        while (true) {
            // Step 1: Generate random slot (1–9)
            slot = rand.nextInt(9) + 1;

            // Step 2: Convert to row & column
            int[] position = convertSlotToIndex(slot);
            row = position[0];
            col = position[1];

            // Step 3: Validate
            if (isValidMove(board, row, col)) {
                // Step 4: Place move
                placeMove(board, row, col, symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };

        System.out.println("Before Computer Move:\n");
        printBoard(board);

        makeComputerMove(board, 'O');

        System.out.println("\nAfter Computer Move:\n");
        printBoard(board);
    }
}