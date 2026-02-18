import java.util.Scanner;

public class aparicioLab2 {
    public static void main(String[] args) {
        // Scanner will read in input.
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter an odd number. This will determing the
        // size of the square
        System.out.println("Please enter Odd number Only!");
        int size = sc.nextInt();

        // Checks to make sure user input is valid.
        while (size % 2 == 0) {
            System.out.println("Please enter ODD NUMBER ONLY");
            size = sc.nextInt();
        }

        int[][] magicSquare = new int[size][size]; // initialize 2d array

        int row = 0;
        int col = size / 2; // integer division will place index in the middle of the table.
        int num = 1; // starting value for the magic square table.

        for (int i = 0; i < size * size; i++){ // Runs the loop enought times to fill in each square in the arrray.
            magicSquare[row][col] = num; // place the number
            num += 1; // adds 1 to num for every iteration.

            int tempRow = row - 1;
            int tempCol = col -1;

            if (tempRow < 0){ // if row is outside of array
                row = tempRow + size; // row to the bottom of the table
            } else {
                row = tempRow; // if not leave it as is.
            }
            if (tempCol < 0){ // if column is outside of array
                col = tempCol + size; // moves it across the table.
            } else {
                col = tempCol;
            }
            if (magicSquare[row][col] > 0) { // Checks to see if spot is filled.
                row = tempRow + 2;// moves down 2
                col = tempCol + 1; // moves to the right once.
            }
        }

        for (int j = 0; j < size; j++){// Displays 2d array.
            System.out.println();
            for (int k = 0; k < size; k++){
                System.out.print(magicSquare[j][k] + "\t");
            }
        }


    }
}
