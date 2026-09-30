package com.javacore;
import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int large = 0;
    int digit = 0;
    while  (number != 0) {
        digit = number % 10;
        number = number / 10;
        if(digit > large){
            large = digit;
        }

    }System.out.print(large);
}
}
