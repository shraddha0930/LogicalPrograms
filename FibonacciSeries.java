package day7assignment.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci series Number:");
        int n = sc.nextInt(); //n-->fiblength


        int  firstTerm = 0, secondTerm = 1;


        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
