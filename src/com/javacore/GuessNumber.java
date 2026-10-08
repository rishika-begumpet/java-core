package com.javacore;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number;
        int secret  = 6;
        int count = 0;
        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if(number == secret){
                System.out.println("Correct! You guessed it in " + count + " times.");
                break;
            }else{
                System.out.println("Too High");
                count++;
            }
        }while(number != 0);
    }
}
