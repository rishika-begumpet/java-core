package com.javacore;
import java.util.Scanner;
public class PalindromeUsingBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int digit = 0;
        int reverse = 0;
        boolean isPalindrome = false;
        while(number!=0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
            if (original == reverse) {
                isPalindrome = true;
            }
        }
            if(isPalindrome){
                System.out.println(original + " " + "is a  palindrome");
            }else {
                System.out.println(original +  " " + "is not a palindrome");
            }
    }
}
