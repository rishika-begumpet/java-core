package com.javacore;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum=0;
        int digit = 0;
        while(number!=0){
            digit = number % 10;
            number = number / 10;
            sum+=digit;
        }
        System.out.println(sum);
    }
}
