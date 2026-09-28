import java.util.Arrays;

public class arrays6 {
    public static void main (String[] args) {
        int[][] carSales = {{25, 25, 35,}, {25, 55, 35}, {11, 20, 45}, {17, 27, 25}};
        String[] carNames = {"SUV", "COUP", "SEDAN", "VAN"};
        String[] months = {"JAN", "FEB", "MAR"};
        int totalSales = 0;

        System.out.println("**********************************************************");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("**********************************************************");

        System.out.printf("%-18s", "");
        for (int vehicle = 0; vehicle < months.length; vehicle++) {
            System.out.printf("%-8s", months[vehicle]);
    }
        System.out.printf("%-10s %-10s%n", "TOTAL", "RATING");

        System.out.println();
        for (int car = 0; car < carSales.length; car++) {
            System.out.printf("%-18s", carNames[car]);
            int carTotal = 0;

            for (int vehicle = 0; vehicle < carSales[car].length; vehicle++) {
                System.out.printf("%-8d", carSales[car][vehicle]);
                carTotal += carSales[car][vehicle];

            }
            String star = (carTotal >= 100) ? "Gold star" : "Silver star";
            System.out.printf("%-10d %-10s%n", carTotal, star);
            totalSales += carTotal;


        }

        System.out.println(" ");
        System.out.println("**********************************************************");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("**********************************************************");
        System.out.println("Total deliveries: " + totalSales);
        System.out.println("**********************************************************");

    }

}
