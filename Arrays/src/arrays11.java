import javax.swing.*;

public class arrays11 {
    public static void main (String[] args) {
         int[][]  sales = {
                 {300, 150, 700},
                 {250, 200, 600}
         };

         String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

         int maximum = sales[0][0];
         int minimum = sales[0][0];
         int total = 0;

         System.out.println("PRODUCT SALES REPORT - 2025");
         System.out.println("---------------------------------------------------------------------------------------");


         for (int col = 0; col < sales.length; col ++) {

             for (int row = 0; row < quarters.length; row ++){
                 total += sales[col][row];

                 if (maximum < sales[col][row]) {
                     maximum = sales[col][row];
                 }

                 if (minimum > sales[col][row]) {
                     minimum = sales[col][row];
                 }
             }


         }

        double average = (double) total / 6;

        System.out.println("Total sales: " + total);
         String frmAverage = String.format("%-1.0f" ,average);
        System.out.println("Average sales: " + frmAverage);
        System.out.println("Maximum sales: " + maximum);
        System.out.println("Minimum sales: " + minimum);

        System.out.println("---------------------------------------------------------------------------------------");
    }
}
