import java.util.Scanner;

public class aparicioLab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the odd number only!");
        System.out.println("Enter the square size: ");

        // Use user input to create the rows and columns of the 2d array
        int size = sc.nextInt();

        // initialize 2d array
        int[][] magicSquare = new int [size] [size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }

    }
}
