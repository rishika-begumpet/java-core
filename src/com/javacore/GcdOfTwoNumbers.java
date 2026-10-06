package com.javacore;
import java.util.Scanner;
public class GcdOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = sc.nextInt();
        int gcd = 0;
        for(int i = 1; i <= number1 ; i++){
            if(number1 % i==0 && number2 % i==0){
                gcd =  i;
            }
        }System.out.println(gcd);
    }
}
