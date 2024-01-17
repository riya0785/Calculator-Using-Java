# Calculator-Using-Java
Its a Java Program which provides a versatile tool for performing mathematical computations and statistical analysis.
Java Calculator Program

Author
Riya Shukla

Overview
This Java program, authored by Riya Shukla, provides a versatile calculator that performs basic arithmetic operations and statistical calculations. The program is organized into three classes: Main, UserInput, and Calculator. It allows users to input numbers and arrays, displaying results for various mathematical and statistical operations.

Details for the same is provided below for your reference.

## Main.java

## Usage

1. Run the Main class.
2. Follow the prompts to input numbers and array elements.
3. View the calculated results for sum, difference, product, quotient, and statistical measures.
## Below is the code for the main class ##
public class Main {
    public static void main(String[] args) {
        // Get input for the first number from the user
        double num1 = UserInput.getNumberInput("Enter the first number: ");

        // Get input for the second number from the user
        double num2 = UserInput.getNumberInput("Enter the second number: ");

        // Print the sum of the two numbers
        System.out.println("Sum: " + Calculator.add(num1, num2));

        // Print the difference of the two numbers
        System.out.println("Difference: " + Calculator.subtract(num1, num2));

        // Print the product of the two numbers
        System.out.println("Product: " + Calculator.multiply(num1, num2));

        // Print the quotient of the two numbers
        System.out.println("Quotient: " + Calculator.divide(num1, num2));

        // Get input for the size of the array from the user
        int arraySize = (int) UserInput.getNumberInput("Enter the size of the array: ");

        // Get input for an array of numbers from the user
        double[] numbersArray = UserInput.getArrayInput(arraySize);

        // Printing Statements.
        // Print the sum of the array
        System.out.println("Sum of Array: " + Calculator.sumArray(numbersArray));

        // Print the mean of the array
        System.out.println("Mean of Array: " + Calculator.meanArray(numbersArray));

        // Print the mode of the array
        System.out.println("Mode of Array: " + Calculator.modeArray(numbersArray));

        // Print the median of the array
        System.out.println("Median of Array: " + Calculator.medianArray(numbersArray));

        // Print the variance of the array
        System.out.println("Variance of Array: " + Calculator.varianceArray(numbersArray));

        // Print the standard deviation of the array
        System.out.println("Standard Deviation of Array: " + Calculator.standardDeviationArray(numbersArray));
    }
}



## UserInput.java

## Input Functions ##
1. getNumberInput(String prompt): Takes a prompt and returns a double from user input.
2. getArrayInput(int size): Takes the size of an array and returns an array of double values from user input.
Below is the code for UserInput 

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


## Calculator.java

## Arithmetic Operations ##
1. add(double num1, double num2): Addition of two numbers.
2. subtract(double num1, double num2): Subtraction of two numbers.
3. multiply(double num1, double num2): Multiplication of two numbers.
4. divide(double num1, double num2): Division of two numbers.
   
## Statistical Calculations ##
1. sumArray(double[] array): Sum of elements in an array.
2. meanArray(double[] array): Mean of elements in an array.
3. modeArray(double[] array): Mode of elements in an array.
4. medianArray(double[] array): Median of elements in an array.
5. varianceArray(double[] array): Variance of elements in an array.
6. standardDeviationArray(double[] array): Standard Deviation of elements in an array.

Below is the code for the same 

import java.util.Arrays;

public class Calculator {
    // Addition of two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction of two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication of two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division of two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Not-a-Number for an undefined result
        }
    }

    // Sum of an array
    public static double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Mean of an array
    public static double meanArray(double[] array) {
        return sumArray(array) / array.length;
    }

    // Mode of an array (most frequently occurring number)
    public static double modeArray(double[] array) {
        Arrays.sort(array);
        double mode = array[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = array[i - 1];
                }
                currentCount = 1;
            }
        }

        // Check for the last element
        if (currentCount > maxCount) {
            mode = array[array.length - 1];
        }

        return mode;
    }

    // Median of an array
    public static double medianArray(double[] array) {
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 0) {
            // If the array has an even number of elements, take the average of the middle two
            int middle1 = length / 2 - 1;
            int middle2 = length / 2;
            return (array[middle1] + array[middle2]) / 2.0;
        } else {
            // If the array has an odd number of elements, return the middle element
            return array[length / 2];
        }
    }

    // Variance of an array
    public static double varianceArray(double[] array) {
        double mean = meanArray(array);
        double sumSquaredDifferences = 0;//initialisation.

        for (double num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / array.length;
    }

    // Standard Deviation of an array
    public static double standardDeviationArray(double[] array) {
        return Math.sqrt(varianceArray(array));
    }
}


Feel free to explore and modify the code to suit your specific needs. If you encounter any issues or have suggestions, please don't hesitate to open an issue or contribute to the project.

Happy coding! 👩‍💻👨‍💻
