package com.javacore;
import java.util.Scanner;
public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Place your order");
        System.out.println("Menu :");
        System.out.println("1.Pizza");
        System.out.println("2.Cake");
        System.out.println("3.Sandwich");
        System.out.println("4.Biriyani");
        String order = " ";
        do {
            String dish = sc.nextLine();
            switch (dish) {
                case "Cake":
                    System.out.println("How many Kgs Cake do you want to eat?");
                    int kgs = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Which flavour Cake do you want?");
                    String flavour = sc.nextLine();
                    switch (flavour){
                        case "ButterScotch":
                            System.out.println("Butterscotch cake is ready ");
                            break;
                        case "Vanilla":
                            System.out.println("Vanilla cake is ready ");
                            break;
                        case "Pineapple":
                            System.out.println("Pineapple cake is ready ");
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
                            System.out.println("Place your order");
                            System.out.println("Menu :");
                            System.out.println("1.Pizza");
                            System.out.println("2.Cake");
                            System.out.println("3.Sandwitch");
                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Chicken Pizza is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");

                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Veg Biriyani  is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
                                    }
                                    break;
                                case "Paneer":
                                    System.out.println("Your Paneer  Biriyani is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Chicken Biriyani is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
                                    }
                                    break;
                                case "Mutton":
                                    System.out.println("Your Mutton Biriyani is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Chicken Sandwich is ready ");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
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
                                    System.out.println("Your Cheese Sandwitch is ready");
                                    System.out.println("Your Order is placed");
                                    System.out.println("Do you want to continue");
                                    order = sc.nextLine();
                                    switch (order) {
                                        case "No":
                                            System.out.println("Thank you");
                                            break;
                                        case "Yes":
                                            System.out.println("Place your order");
                                            System.out.println("Menu :");
                                            System.out.println("1.Pizza");
                                            System.out.println("2.Cake");
                                            System.out.println("3.Sandwitch");
                                            System.out.println("4.Biriyani");
                                            break;
                                    }
                            }
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid dish");
                    break;
            }

        } while (order.equals("Yes"));
    }
}




