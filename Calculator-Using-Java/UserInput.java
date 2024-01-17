import java.util.Scanner;

public class UserInput {
    // Scanner object to read input from the console
    private static Scanner scanner = new Scanner(System.in);

    // Function to get input for a single number
    public static double getNumberInput(String prompt) {
        System.out.print(prompt); // Print the prompt message
        return scanner.nextDouble(); // Read and return a double value from the console
    }

    // Function to get input for an array of numbers
    public static double[] getArrayInput(int size) {
        double[] array = new double[size]; // Create an array to store input numbers
        System.out.println("Enter the elements of the array:");

        // Loop to get input for each element of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble(); // Read and store each element in the array
        }

        return array; // Return the array containing input numbers
    }
}

