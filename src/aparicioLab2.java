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
        while (size % 2 == 0){
            System.out.println("Please enter ODD NUMBER ONLY");
            size = sc.nextInt();
        }

        // Builds two dimensional array to fit the size of the user input.
        int [][] magicSquare = new int[size][size];

        int row = 0; // Starting position of the magic square
        int newRow; // where the next row will move to

        // We divide by two because in integer division that will bring me to the middle position.
        int col = size / 2; // column
        int newcol; // where the next column will move to

        int num = 1; // Setting the first number in the square to 1

        // First loop
        for (int i = 0; i < size * size; i++) {
            magicSquare[row][col] = num;
            System.out.println(magicSquare[row][col]);

            // add 1 to each iteration
            num += 1;

            if (magicSquare[row][col] > 0) { // Checks to see if the spot in the array is already filled.
                newRow = row + 1; // moves down one.
            }
        }
    }
}
