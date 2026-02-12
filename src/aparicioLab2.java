import java.util.Scanner;

public class aparicioLab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the odd number only!");
        System.out.println("Enter the square size: ");

        // Use user input to create the rows and columns of the 2d array
        int size = sc.nextInt();


        // Print 2d array
        int[][] magicSquare = new int [size] [size];
        // index pointers
        int num1 = 1;
        int rowPlacement = 0;
        // Dividing by two makes sure its in the middle considering its integer division.
        int columnPlacement = size / 2;
        // Places the number 1 in the middle column at the top row.
        magicSquare[rowPlacement][columnPlacement] = num1;

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(magicSquare[i][j] + " ");

            }
            System.out.println();
        }

    }
}
