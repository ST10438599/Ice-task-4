/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salesui_;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author damia
 */
public class SalesUI_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input amount of SalesPeople");

        int employees = scan.nextInt();

        int[] sales = new int[employees];

        int sum;
        int max = Integer.MIN_VALUE;
        int maxid = 0;
        int min = Integer.MAX_VALUE;
        int minid = 0;
        int numpeople = 0;

        for (int i = 0; i < sales.length; i++) {

            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");

            sales[i] = scan.nextInt();

            if (sales[i] > maxid) {
                maxid = sales[i];
                max = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minid = i;
            }

        }

        System.out.println("\nSalesperson Sales");

        System.out.println("--------------------");

        sum = 0;

        for (int x = 0; x < sales.length; x++) {

            System.out.println(" " + x + " " + sales[x]);
            sum += sales[x];

        }

        System.out.println("\nTotal sales: " + sum);

        System.out.println("\n Average calculated sale : " + (sum / employees));

        System.out.println("Salesperson " + max + " had the highest sale with $" + maxid + ".");
        System.out.println("Salesperson " + minid + " had the lowest sale with $" + min + ".");

        System.out.println("Please enter an amount:");
        int user = scan.nextInt();

        System.out.println("These SalesPeople have exceeded the amount :");
        for (int y = 0; y < sales.length; y++) {

            if (user > sales[y]) {

                System.out.println("salesperson:" + (y + 1) + "amount:" + sales[y]);

            }

            if (user < sales[y]) {

                numpeople++;

            }

        }

        System.out.println("SalesPeople who exceeded the amount: " + numpeople);

    }

}
