package com.javacore;
import java.util.Scanner;
public class AtmSimulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int Deposit = 0;
        int withDraw = 0;
        String option = "";
        int choice;
        do{
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println ("3.Withdraw");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("The Balance in your Account is :" + balance);
                    break;
                case 2:
                    System.out.println("Enter Amount to Deposit");
                    int amount = sc.nextInt();
                    Deposit = amount + balance;
                    System.out.println("The Balance in your Account is :" + Deposit);
                    break;
                case 3:
                    System.out.println("Enter Amount to Withdraw");
                    amount = sc.nextInt();
                    withDraw = balance - amount;
                    System.out.println("The Balance in your Account is : " + withDraw);
                    break;
            }
            System.out.println("Do you want to Continue");
            System.out.println("1.YES");
            System.out.println("2.NO");
            sc.nextLine();
            option = sc.nextLine();
        }while(option.equals("YES"));
        System.out.println("THANK YOU");
    }
}
