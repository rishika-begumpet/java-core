package com.javacore;

import java.util.Scanner;

public class Product_Discount_FinalPrice_Calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product : ");
        int price  = sc.nextInt();
        System.out.println("Enter the discount_percentage of the product : ");
        int discount_percentage  = sc.nextInt();
        System.out.println("Enter the Quantity : ");
        int quantity = sc.nextInt();
        int stateTax = 3;
        int centralTax = 2;
        int total_price = quantity * price;
        stateTax = total_price * stateTax/100;
        centralTax = total_price * centralTax/100;
        int priceOfEachProduct = price + stateTax + centralTax ;
        int discountOnEach = price * discount_percentage/100;
        int  discounted = total_price * discount_percentage / 100;
        int  finalPrice  = total_price - discounted + centralTax +  stateTax;
        int amountSaved = discounted - stateTax -  centralTax ;
        System.out.println("The Final Price on each Product is : " + priceOfEachProduct );
        System.out.println("The Amount saved on Each product : " + discountOnEach);
        System.out.println("Your total price is: " + total_price);
        System.out.println("Your discounted Price  is: " + discounted );
        System.out.println("Your final price is: " + finalPrice);
        System.out.println("The Amount saved is: " + amountSaved);
    }
}
