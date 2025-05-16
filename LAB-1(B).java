public class ChessboardPattern {
    public static void main(String[] args) {
        int size = 8; // Size of the chessboard

        // Loop through each row
        for (int i = 0; i < size; i++) {
            // Loop through each column
            for (int j = 0; j < size; j++) {
                // Check if the sum of row and column indices is even
                if ((i + j) % 2 == 0) {
                    // Print black square for even sum
                    System.out.print("**");
                } else {
                    // Print white square for odd sum
                    System.out.print("  ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
