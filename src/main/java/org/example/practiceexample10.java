/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 10 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a simple self-checkout system.
Prompt for the prices and quantities of three items.
Calculate the subtotal of the items.
Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
 */

package org.example;
import java.util.Scanner;

public class practiceexample10 {
    public static void main(String[] args) {

        float price[] = new float[3]; //price conversion
        float quantity[] = new float[3]; //quantity conversion
        float subtotal = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.printf("Enter the price of item %d: ", (i+1)); //prompt for item 1 price
            price[i] = sc.nextInt();
            System.out.printf("Enter the quantity of items %d: ", (i+1)); //promp for qwuantity of item 1
            quantity[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){ //for loop with 3 items increment by 1
            subtotal += price[i] * quantity[i];
        }
        System.out.println("Subtotal: $" + String.format("%.2f",subtotal)); //print results 1
        System.out.println("Tax: $" + (subtotal * 0.055)); //print results 2
        System.out.println("Total: $" + (subtotal + (subtotal * 0.055))); //print results 3
    }
}
