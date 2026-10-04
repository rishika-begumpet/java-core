package com.javacore;
import java.util.Scanner;
public class CantainsParticularDigit {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int digit = 0;
    int digit1 = 4;
    int original = number;
    boolean isContain = false;
    while(number != 0) {
        digit = number % 10;
        number /= 10;
        if(digit == digit1){
            isContain = true;
        }
    }if(isContain){
        System.out.println( original + " " +"Yes Contains the same digit" + " " + digit1);
    }else{
        System.out.println( original + " " + "Not Contains the same digit" + " " +  digit1);
    }
    }
}
