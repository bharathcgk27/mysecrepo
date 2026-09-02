import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.util.Scanner);
        
        System.out.print("Enter a number to square: ");
        int number = scanner.nextInt();
        
        int result = number * number;
        System.out.println("The square of " + number + " is: " + result);
        
        // Always close the scanner to prevent memory leaks
        scanner.close();
    }
}

