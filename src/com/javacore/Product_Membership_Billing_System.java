package com.javacore;
 import java.util.Scanner;
public class Product_Membership_Billing_System {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char G;
        char S;
        char P;
        System.out.println("Enter the Membership : ");
        char membership = sc.next().charAt(0);
        if(membership == 'G'){
            System.out.println("Membership G : ");
            System.out.println(" Enter the Price of Gold : ");
            float price = sc.nextFloat();
            System.out.println("Enter the Quantity  : ");
            int quantity = sc.nextInt();
            System.out.println("Enter the discount Percentage : ");
            float discount = sc.nextFloat();
            float centralTax = price *  2.5f / 100;
            float stateTax =  price * 2.5f / 100;
            System.out.println("central tax is : " + centralTax);
            int shipping_charges  = 500;
            float priceOf_G = price*quantity + centralTax  + stateTax + shipping_charges;
            System.out.println("Price of gold : " + priceOf_G);
            float discount_percentage =  priceOf_G * discount / 100;
            System.out.println("Discount Amount is  : " + discount_percentage);
            float total_amount =  priceOf_G + discount_percentage;
            System.out.println("Total Amount is : " + total_amount);
            float finalPrice  =  priceOf_G - discount_percentage;
            System.out.println("Final Price is : " + finalPrice);
            float amountSaved = discount_percentage;
            System.out.println("Saved Amount is : " + amountSaved);
        }
        else if(membership == 'S'){
            System.out.println("Membership S");
            System.out.println(" Enter the Price of Silver : ");
            float price = sc.nextFloat();
            System.out.println("Enter the Quantity  : ");
            int quantity = sc.nextInt();
            System.out.println("Enter the discount Percentage : ");
            float discount = sc.nextFloat();
            float centralTax = price *  2.5f / 100;
            float stateTax =  price * 2.5f / 100;
            int shipping_charges  = 500;
            float priceOf_S = price*quantity + centralTax  + stateTax + shipping_charges;
            System.out.println("Price of silver : " + priceOf_S);
            float discount_percentage =  priceOf_S * discount / 100;
            System.out.println("The Discounted Amount is : " + discount_percentage);
            float total_amount =  priceOf_S + discount_percentage;
            System.out.println("The Total Amount is : " + total_amount);
            float finalPrice  =  priceOf_S - discount_percentage;
            System.out.println("The Final Price is : " + finalPrice);
            float amountSaved = discount_percentage;
            System.out.println("The Amount Saved is : " + amountSaved);
        }
        else if(membership == 'P'){
            System.out.println("Membership P");
            System.out.println(" Enter the Price of Platinum : ");
            float price = sc.nextFloat();
            System.out.println("Enter the Quantity  : ");
            int quantity = sc.nextInt();
            System.out.println("Enter the discount Percentage : ");
            float discount = sc.nextFloat();
            float centralTax = price *  2.5f / 100;
            float stateTax =  price * 2.5f / 100;
            int shipping_charges  = 500;
            float priceOf_P = price*quantity + centralTax  + stateTax + shipping_charges;
            System.out.println("Price of platinum : " + priceOf_P);
            float discount_percentage =  priceOf_P * discount / 100;
            System.out.println("The Discount Amount is : " + discount_percentage);
            float total_amount =  priceOf_P + discount_percentage;
            System.out.println("The Total Amount is : " + total_amount);
            float finalPrice  =  priceOf_P - discount_percentage;
            System.out.println("The Final Price is : " + finalPrice);
            float amountSaved = discount_percentage;
            System.out.println("The Amount Saved is : " + amountSaved);
        }
    }
}
