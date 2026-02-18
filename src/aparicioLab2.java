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

        // Starting position of the magic square
        int row = 0;
        // We divide by two because in integer division that will bring me to the middle position.
        int col = size / 2; // column
        // Setting the first number in the square to 1
        int num = 1;

        // First loop
        for (int i = 0; i < size * size; i++){
            magicSquare [row] [col] = num;
            System.out.print(magicSquare[row][col]);
            // adds 1 to num for each iteration.
            num += 1;

            // first step to move up one spot
            row = row - 1;
            // second step to move to the left one spot.
            col = col - 1;
            // Checks to make sure the place for the next num is inside the square
            // if it is not then it moves the number to the bottom.
            if (row < 0){
                row = row + size;
            }
            // Same thing as row. Checks to make sure col is inbound.2
            if (col < 0){
                col = col + size;
            }




        }




    }
}
