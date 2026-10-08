package com.javacore;
import java.util.Scanner;
public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        for(int i = number; i <= number2; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println( i + "*" + j +  " " + " = " + i*j );
            }
        }
    }
}
