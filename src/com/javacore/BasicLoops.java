package com.javacore;
import java.util.Scanner;

public class BasicLoops {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        // Using for loop printing numbers from 50 to 1

        /* for (int i = 50; i >= 1; i--) {
            System.out.println(i);
        }
       */

        // Using the for and if for even and odd numbers

        /*for(int i = 1; i<=100;i++){
            if(i%2==0){
                System.out.println(i + " " + "Even");
            }else {
                System.out.println(i + " " + "odd");
            }
        }
        */

        // Multiplication Table
        /*
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        for( int i=1; i<=10;i++){
            System.out.println(number + "*" + i  + "=" + (number * i));
        }
        */

        //Sum of the Digits
        /*
        System.out.println("Enter a number");
        int number = sc.nextInt();
                int digit = 0 ;
                int result = 0;
                while(number != 0){
                    digit += number % 10;
                    number /= 10;
                }
                System.out.println(digit);
                */
// Written for the counting number of digits
        /*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;
        int count = 0;
        while(num != 0){
            digit = num % 10;
            num = num/10;
            count++;
        }System.out.println(count);
        */
//Created for finding the largest digit ;
        /*
        int num =  sc.nextInt();
        int digit = 0;
        int larger = 0;
        while(num != 0) {
            digit = num % 10;
            num = num / 10;
            if(digit > larger){
            larger = digit;
                System.out.println(larger);
            }

        }
*/

        //Created for  findiing small digit
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;
        int small = 0;
        while(num != 0) {
            digit = num % 10;
            num = num/10;
            if(digit <= small) {
                small = digit;
                System.out.println("The smallest number is: " + small);
            }
        }
    }
}
