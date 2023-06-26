package day7assignment.logicalprograms;

import java.util.Scanner;

class ReverseNumber {
   public static void main(String args[]) {

      int reversenum =0, temp = 0;
      System.out.println("Enter the number: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      while( num > 0 )
      {
          temp = num % 10;
          reversenum = reversenum * 10 + temp;
          num = num/10;
      }

      System.out.println("Reverse of number is: "+reversenum);
   }
}