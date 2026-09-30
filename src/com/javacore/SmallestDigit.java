package com.javacore;
import java.util.Scanner;
public class SmallestDigit {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int digit = 0;
        int small = 10;
        while(number != 0){
            digit = number % 10;
            number = number / 10;
            if(digit < small){
                small = digit;
            }
        }System.out.println(small);
    }
}
