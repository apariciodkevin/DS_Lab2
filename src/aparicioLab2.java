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


    }
}
