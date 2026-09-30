package com.javacore;
import java.util.Scanner;
public class CountingEvenOddDigits {
    public static void main(String args[]){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number :");
        int number  = sc.nextInt();
        int digit = 0;
        int countEven  = 0;
        int countOdd = 0;
        while(number != 0){
            digit  = number % 10;
            number = number / 10;
            if(digit % 2 == 0){
                countEven++;
            }else {
                countOdd++;
            }
        }System.out.println("The number of Even digits are :" + countEven);
        System.out.println("The number of Odd digits are :" + countOdd);
    }
}
