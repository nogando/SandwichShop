package com.pluralsight;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //Define known values
        String userName = getNameFromUser();
        int size = getSizeFromUser();
        int userAge = getAgeFromUser();

        //Calculate unknown values
        double subtotal = getPriceFromSizeType(size);
        float discountPercent = getDiscountPercent(userAge);
        double discountAmount = subtotal * discountPercent;
        double totaldue = subtotal - discountAmount;

        //Display the results
        displayResults(userName,subtotal, discountAmount, totaldue);

    }

    private static float getDiscountPercent(int age){
        float discountStudentPercent = 0.10f;
        float discountSeniorPercent = 0.20f;
        if(age <= 17){
            //student discount
            return discountStudentPercent;
        } else if (age >= 65) {
            //senior discount
            return discountSeniorPercent;
        }
        else{
            //no discount
            return 0;
        }
    }

    /**
     * Given the size of the sandwich, return the correct price
     * @param size Size of Sandwich (1 or 2)
     * @return price
     */
    private static double getPriceFromSizeType(int size){
        double priceRegular = 5.45;
        double priceLarge = 8.95;

        if(size == 1){
            return priceRegular;
        }
        else{
            return priceLarge;
        }

    }

    /**
     * Prompt the user for their name.
     * @return Customer's Name
     */
    private static String getNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.print("What is your name?: ");
        return scanner.nextLine();
    }

    /**
     * Prompt the user for the size of their sandwich
     * @return 1 or 2 (sandwich size)
     */
    private static int getSizeFromUser(){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for unknown values.  (What size, how old are you)
        System.out.println("Please choose your sandwich size");
        System.out.println("   1) Regular: base price: $5.45");
        System.out.println("   2) Large: base price: $8.95");
        System.out.print("Please select 1 or 2: ");
        int userOption = scanner.nextInt();
        scanner.nextLine();
        return userOption;
    }

    /**
     * Prompt the user for their age
     * @return the users age
     */
    private static int getAgeFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    private static void displayResults(String name, double subtotal, double discountAmount, double totaldue){
        System.out.println("------------------------------------------------------------------");
        System.out.println("Thanks for shopping with us, " + name + " your order is as follows:");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Discount: $%.2f\n", discountAmount);
        System.out.printf("Total Due: $%.2f\n", totaldue);
    }


}





