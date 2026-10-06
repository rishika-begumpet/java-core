package com.javacore;
import java.util.Scanner;
public class PrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter the first number: ");
        int number1 =  sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        boolean isPrime = false;
        for(int i = number1; i <= number2; i++) {
            isPrime = true;
            if(i<2){
                isPrime = false;
            }
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
        }
}