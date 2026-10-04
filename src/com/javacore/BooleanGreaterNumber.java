package com.javacore;
import java.util.Scanner;
public class BooleanGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  sc.nextInt();
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        boolean isLarge = false;
        if(number>number1){
            isLarge = true;
            System.out.println(number+" is large.");
        }else if(number1>number2){
            isLarge = true;
            System.out.println(number1+" is large.");
        }else{
            isLarge = true;
            System.out.println(number2+" is large.");
        }
    }
}
