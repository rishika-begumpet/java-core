package com.javacore;
import java.util.Scanner;
public class NumberPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int digit = 0;
        int sequence = 0;
        for( int i = 1;i <= number; i++) {
            sequence = sequence * 10 + i;
            System.out.println(sequence);
            }
    }
}
