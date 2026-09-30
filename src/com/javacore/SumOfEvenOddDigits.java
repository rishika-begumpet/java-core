package com.javacore;
import java.util.Scanner;
public class SumOfEvenOddDigits {
    public static void main(String arsg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =sc.nextInt();
        int digit  = 0;
        int sumEven = 0;
        int sumOdd = 0;
        while(number != 0){
            digit = number % 10;
            number =  number/10;
            if(digit % 2 == 0){
                sumEven += digit;
            }else {
                sumOdd += digit;
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
