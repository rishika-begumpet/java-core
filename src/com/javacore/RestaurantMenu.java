package com.javacore;
import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int sum = 0;
        int price=0, price1 =0 , price2 = 0;
        int price3 =0, price4 =0 , price5=0, price6=0, price7=0, price8=0, price9=0, price10 = 0;
        int total = 0;
        String order = " ";
        do {
            System.out.println("Place your order");
            System.out.println("Menu :");
            System.out.println("1.Pizza");
            System.out.println("2.Cake");
            System.out.println("3.Sandwich");
            System.out.println("4.Biriyani");
            String dish = sc.nextLine();
            switch (dish) {
                case "Cake":
                    System.out.println("How many Kgs Cake do you want to eat?");
                    int kgs = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Which flavour Cake do you want?");
                    String flavour = sc.nextLine();
                    switch (flavour) {
                        case "ButterScotch":
                            System.out.println("Butterscotch cake is ready ");
                            price = kgs * 120;
                            System.out.println("Total Price is " + price);
                            break;
                        case "Vanilla":
                            System.out.println("Vanilla cake is ready ");
                            price1 = kgs * 80;
                            System.out.println("Total Price is " + price1);
                            break;
                        case "Pineapple":
                            System.out.println("Pineapple cake is ready ");
                            price2 = kgs * 100;
                            System.out.println("Total Price is " + price2);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    System.out.println("Do you want to continue");
                    order = sc.nextLine();
                    switch (order) {
                        case "No":
                            System.out.println("Thank you");
                            break;
                        case "Yes":
                            System.out.println(" ");
                    }
                    break;
                case "Pizza":
                    System.out.println("Do you want Veg or Non-Veg");
                    String type = sc.nextLine();
                    switch (type) {
                        case "Veg":
                            System.out.println("In Veg, Cheese pizza is available");
                            System.out.println("Do you want the to place the order ");
                            String option = sc.nextLine();
                            switch (option) {
                                case "Yes":
                                    System.out.println("How many  Pizza's do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price3 = count * 200;
                                    System.out.println("Total Price is " + price3);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case "Nonveg":
                            System.out.println("In Non-Veg, Chicken pizza is available");
                            System.out.println("Do you want the to place the order ");
                            type = sc.nextLine();
                            switch (type) {
                                case "Yes":
                                    System.out.println("How many Pizza's do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price4 = count * 300;
                                    System.out.println("Your Order is placed");
                                    System.out.println("Total Price is " + price4);
                                    System.out.println("Do you want to continue");

                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                    }
                                    break;
                            }
                            break;
                    }
                    break;

                case "Biriyani":
                    System.out.println("Do you want Veg or Non-Veg");
                    type = sc.nextLine();
                    switch (type) {
                        case "Veg":
                            System.out.println("Which one do you want Vegetable Biriyani or Paneer Biriyani");
                            System.out.println("Enter your choice : ");
                            String choice = sc.nextLine();
                            switch (choice) {
                                case "Vegetable":
                                    System.out.println("How many Plates do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price5 = count * 150;
                                    System.out.println("Total Price is " + price5);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                    }
                                    break;
                                case "Paneer":
                                    System.out.println("How many Plates do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price6 = count * 180;
                                    System.out.println("Total Price is " + price6);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                    }
                                    break;
                            }
                            break;
                        case "Nonveg":
                            System.out.println("Which one do you want Chicken Biriyani or Mutton Biriyani");
                            System.out.println("Enter your choice : ");
                            choice = sc.nextLine();
                            switch (choice) {
                                case "Chicken":
                                    System.out.println("How many Plates do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price7 = count * 200;
                                    System.out.println("Total Price is " + price7);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                            break;
                                    }
                                    break;
                                case "Mutton":
                                    System.out.println("How many Plates do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price8 = count * 300;
                                    System.out.println("Total Price is " + price8);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                            break;
                                    }
                            }
                    }
                    break;
                case "Sandwich":
                    System.out.println("Do you want Veg or Non-Veg");
                    type = sc.nextLine();
                    switch (type) {
                        case "Nonveg":
                            System.out.println("In NonVeg, Chicken Sandwich is available");
                            System.out.println("Do you want to place the order ");
                            String confirm = sc.nextLine();
                            switch (confirm) {
                                case "Yes":
                                    System.out.println("How many Sandwich's do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price9 = count * 150;
                                    System.out.println("Total Price is " + price9);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");

                                            break;
                                    }
                                    break;
                            }
                            break;
                        case "Veg":
                            System.out.println("In Veg, Cheese Sandwitch is available");
                            System.out.println("Do you want the to place the order ");
                            String choice = sc.nextLine();
                            switch (choice) {
                                case "Yes":
                                    System.out.println("How many Sandwich's do you want:");
                                    count = sc.nextInt();
                                    sc.nextLine();
                                    price10 = count * 100;
                                    System.out.println("Total Price is " + price10);
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println(" ");
                                            break;
                                    }
                            }
                        break;
                        default:
                            System.out.println("Invalid dish");
                            break;
                    }
            }
            total = (price + price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9 + price10);
            System.out.println("The Total Bill is " + total);
        } while (order.equals("Yes"));
    }
}





