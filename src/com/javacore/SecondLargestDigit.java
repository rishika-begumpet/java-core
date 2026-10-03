package com.javacore;
import java.util.Scanner;
public class SecondLargestDigit {
   public static void main(String[] args) {
       Scanner sc   = new Scanner(System.in);
       System.out.println("Enter a number");
       int number  = sc.nextInt();
       int digit = 0 ;
       int large = 0;
       int secondLarger = 0;
       while(number != 0){
           digit = number % 10;
           number  = number/10;
           if(digit > large) {
               large = digit;
           }
               if (digit < large && digit > secondLarger) {
                   secondLarger = digit;
           }
       }System.out.println(large);
       System.out.println(secondLarger);
   }
}
