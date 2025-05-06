
public class Main {
    private static void placeMyQueens(int[] queens, int row) {
        if (row >= queens.length) {
            System.out.println("**********");
            for (int i = 0; i < queens.length; i++) {
                // Printing rows and columns
                System.out.println("[" + i + ", " + queens[i] + "]");
            }
        } else {

            for (int col = 0; col < queens.length; col++) {
                if (isSafe(queens, row, col)) {
                    queens[row] = col; // Placing our queen
                    placeMyQueens(queens, row + 1);
                }
            }
        }
    }

    private static boolean isSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Checking for same column
            if (queens[i] == col)
                return false;
            // Checking for top left to bottom right diagonal
            if (i - row == queens[i] - col)
                return false;
            // Checking for top right to bottom left diagonal
            if (i - row == col - queens[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        // if n<4 no solution

        int[] queens = new int[n];
        int row = 0;
        placeMyQueens(queens, row);
    }
}