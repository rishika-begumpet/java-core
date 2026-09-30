package com.javacore;
import java.util.Scanner;
public class CountingNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  sc.nextInt();
        int digit = 0;
        int count = 0;
        while(number != 0){
            digit  = number % 10;
            number = number / 10;
            count++;
        }
        System.out.println(count);
    }
}
