package com.pluralsight;

import jdk.dynalink.beans.StaticClass;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = 0;
        int age;
        double discountPrice = 0;
        double discount;

        System.out.println("Please enter the size of the sandwich 1 or 2");
        int sandwichNum = scanner.nextInt();

        if (sandwichNum == 1){

            price = 5.45;

        }
        else if (sandwichNum == 2){

            price = 8.95;
        }
        System.out.println("How old are you?");
        age = scanner.nextInt();
            if (age <= 17){
                discount = price * .10;
                discountPrice = price - discount;
            }
            else if (age >= 65){

                discount = price * .20;
                discountPrice = price - discount;

            }



        System.out.printf("The price of your sandwich is: %.2f $ \n",discountPrice);
    }
}