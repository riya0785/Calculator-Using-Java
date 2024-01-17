// Name : Riya Shukla 
//prn: 22070126090
// Batch- AIML(B1)


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
