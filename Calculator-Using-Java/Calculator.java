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

