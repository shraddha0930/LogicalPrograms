package day7assignment.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n /2) {
            if (n % i == 0) {
                System.out.println(sum);
                sum = sum + i;

            }
            i++;
        }

        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else
            System.out.println(n + " is not a perfect number.");
    }
}