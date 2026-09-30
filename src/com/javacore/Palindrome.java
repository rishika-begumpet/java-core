package com.javacore;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int digit = 0;
        int reverse = 0;
        while(number != 0){
            digit =  number % 10;
            number = number / 10;
            reverse = reverse * 10 + digit;
        }System.out.println(reverse);
    }
}
