import java.io.PrintStream;
import java.util.Arrays;

public class arrays5 {
    public static void main(String[]args ){
        String[] months = {"JAN", "FEB","MAR" };
        int[][] deliveries = {{128, 135, 139},{155, 129, 175},{129, 130, 185}};
        String[] delivery = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
        int total = 0;
        int maximum = deliveries[0][0];
        int minimum = deliveries[0][0];

        System.out.println("****************************************************************************************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("****************************************************************************************************************************");

        System.out.printf("%-18s", "");
        for(int month = 0; month < months.length; month++) System.out.printf("%-8s", months[month]);

        System.out.println();
        for (int deliveryYear = 0; deliveryYear < deliveries.length; deliveryYear++ ) {
            System.out.printf("%-18s", delivery[deliveryYear]);

            for (int month = 0; month < deliveries [deliveryYear].length; month++ ) {
                System.out.printf("%-8d", deliveries[deliveryYear][month]);
                
                total += deliveries[deliveryYear][month];
                if (deliveries[deliveryYear][month] > maximum) {
                    maximum = deliveries[deliveryYear][month];
                }
                if (deliveries[deliveryYear][month] < minimum) {
                    minimum = deliveries[deliveryYear][month];
                }
                

            }
            System.out.println();
        }
        System.out.println("******************************************************************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("******************************************************************************************************");
        System.out.println("Total deliveries: " + total);
        System.out.println("Maximum deliveries: " + maximum);
        System.out.println("Minimum deliveries: " + minimum);
        System.out.println("******************************************************************************************************");

    }

    }

