import java.text.Format;

public class Arrays85 {
    public static void main (String[] args){
        int[][] sales = {
                {300, 150, 700},
                {250, 200, 600},
        };
        int total = 0;
        int max = sales[0][0];
        int min = sales[0][0];


        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("---------------------------------------------------------------------");

       for(int row = 0; row < sales.length; row ++) {

           for(int col = 0; col < sales[row].length; col++) {
               total += sales[row][col];

               if(sales[row][col] > max) {
                   max = sales[row][col];
               }
               if (sales[row][col] < min) {
                   min = sales[row][col];
               }
           }
       }
       double average = (double) total / 6;

       System.out.println("Total sales: " + total);
       String frmAverage = String.format ("%-1.0f", average);
       System.out.println("Average sales: " + frmAverage);
       System.out.println("Maximum sales: " + max);
       System.out.println("Minimum sales: " + min);
       System.out.println("------------------------------------------------------------------");
    }
}