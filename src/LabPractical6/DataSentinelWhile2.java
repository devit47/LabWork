package LabPractical6;

import java.util.Scanner;

/**
 * Created by devit47 on 10/11/2016.
 */
public class DataSentinelWhile2 {
    public static void main(String[] args) {
        float price, totalPrice = 0;
        int numProducts = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price of product " + (numProducts + 1) + " (-1 to exit): ");
        price = input.nextFloat();

        while(price != -1){
            totalPrice = totalPrice + price;
            numProducts = numProducts + 1;

            System.out.println("Please enter the price of product " + (numProducts + 1) + " (-1 to exit): ");
            price = input.nextFloat();
        }

        System.out.println("\nTotal products entered: " + numProducts + "\nTotal price: EUR" +
                String.format("%.2f", totalPrice));
    }
}
