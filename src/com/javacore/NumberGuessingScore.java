package com.javacore;
import java.util.Scanner;
public class NumberGuessingScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int secret = 9;
        int count = 0;
        do {
            System.out.println("Enter Number: ");
            number = sc.nextInt();
            if(number == secret){
                System.out.println("You guessed Correct!" );
                System.out.println("You guessed after " + count + " " +  " attempts.");
                break;
            }
            else {
                 if (number == secret - 1 || number == secret + 1) {
                        System.out.println("Very Close!");
                    } else if(count <= 5) {
                    System.out.println("Too low");
                }

                else{
                        System.out.println("Too high");
                    }
            }
                count++;
        }while(number != 0);

    }
}
