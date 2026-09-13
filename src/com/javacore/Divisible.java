package com.javacore;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number = sc.nextInt();
            if (number % 5 ==0 && number % 11 == 0 ) {
                System.out.println("It is Divisible by both the number");
            } else {
                System.out.println("It is not Divisible by both the number" );
            }
    }
}
