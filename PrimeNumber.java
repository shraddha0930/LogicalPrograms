package day7assignment.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {

        //For the value of n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
         int n = scanner.nextInt();

        int count = 0;
        int number = 1;
        while (count < n) {
            boolean isPrime = true;
            int initialValue = 2;
            while (initialValue <= number / 2) {
                if (number % initialValue == 0) {
                    isPrime = false;
                    break;
                }
                initialValue++;
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
