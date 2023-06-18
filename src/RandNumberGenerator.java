
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandNumberGenerator {
    public static void main(String[] args) {
        // Generate an array of 500 random numbers
        int[] randomNumbers = new int[500];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000) + 1;
        }

        // Ask the user for the value of n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick the smallest number at nth position: ");
        int n = scanner.nextInt();

        // Sort the array of random numbers
        Arrays.sort(randomNumbers);

        // Print the nth smallest number
        if (n <= randomNumbers.length) {
            int nthSmallest = randomNumbers[n - 1];
            System.out.println("The smallest number at position " + n + " is " + nthSmallest);
        } else {
            System.out.println("Invalid value of n. There are not enough numbers.");
        }
        scanner.close();
    }
}