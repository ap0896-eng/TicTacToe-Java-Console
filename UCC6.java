public class BoardUpdater {

    // Method to place symbol on the board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to print the board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Place move
        placeMove(board, row, col, symbol);

        // Display updated board
        System.out.println("Updated Board:\n");
        printBoard(board);
    }
}