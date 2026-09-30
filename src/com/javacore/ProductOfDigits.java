package com.javacore;
import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int digit = 0;
        int product = 1;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            product *= digit;
        }System.out.println(product);
    }
}
