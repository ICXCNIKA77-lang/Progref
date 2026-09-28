import java.util.Scanner;

public class test1 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);

        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[][] accidents = new int[3][2];
        int[] cityTotals = new int[3];

        for (int row = 0; row < cities.length; row ++) {
            System.out.print("Enter the number of car accidents for " + cities[row] + " :");
            accidents[row][0] = scanner.nextInt();

            System.out.print("Enter the number of motor bike accidents for " + cities[row] + " :");
            accidents[row][1] = scanner.nextInt();

            cityTotals[row] = accidents[row][0] + accidents[row][1];

        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-20s%-16s%-16s%n", "", "CAR", "MOTOR BIKE");

        for(int row = 0; row < cities.length; row ++){
            System.out.printf("%-20s%-16d%-16d%n", cities[row], accidents[row][0], accidents[row][1]);
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTAL FOR EACH CITY");
        System.out.println("--------------------------------------------------------------------------------------");

        int maxAccidents = -1;
        int maxIndex = 0;

        for(int row = 0; row < cities.length; row ++) {
            System.out.printf("%-20s%-16d%n", cities[row], cityTotals[row]);

            if(cityTotals[row] > maxAccidents) {
                maxAccidents = cityTotals[row];
                maxIndex = row;
            }


        }

        System.out.println();
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[maxIndex]);
        System.out.println("------------------------------------------------------------------------------");

        scanner.close();

    }
}
