package com.javacore;
import java.util.Scanner;
public class BooleanEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number =  sc.nextInt();
        boolean isEven = false;
       if(number % 2 == 0){
                isEven = true;
                System.out.println("Number is even");
            }else {
                isEven = false;
                System.out.println("Number is odd");
        }
    }
}
