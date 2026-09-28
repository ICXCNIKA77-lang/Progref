public class arrays7 {
    public static void main(String[] args) {
        int[][] shoes = {
                {100, 150, 70},
                {88, 92, 103},
                {75, 45, 90},
                {65, 95, 175}};
        String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
        String[] quarter = {"Q1", "Q2", "Q3", "Q4"};

        int[] total = new int[brands.length];
        double[] average = new double [brands.length];
        int[] minimum = new int [brands.length];
        int[] maximum = new int [brands.length];

        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.print("QUARTER");

        System.out.printf("%-10s", "");
        for (int quest = 0; quest < brands.length; quest++)
            System.out.printf("%-16s", brands[quest]);
        System.out.println();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (int names = 0; names < quarter.length; names++) {
            System.out.printf("%-16s", quarter[names]);

            for (int quest = 0; quest < shoes[names].length; quest++) {
                System.out.printf("%-16d", shoes[names][quest]);

            }

            System.out.println();

        }


        for(int col = 0; col < brands.length; col++) {
            minimum[col] = shoes[0][col];
            maximum[col] = shoes[0][col];

            for (int row = 0; row < quarter.length; row++) {
                total[col] += shoes[row][col];

                if (shoes[row][col] < minimum[col]) {

                    minimum[col] = shoes[row][col];
                }
                if (shoes[row][col] > maximum[col]) {
                    maximum[col] = shoes[row][col];
                }

            }
            average[col] = (double) total[col] / quarter.length;
        }

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.printf("%-16s", "TOTAL:");
        for (int col = 0; col < brands.length; col++) {
            System.out.printf("%-16d", total[col]);
        }
        System.out.println();

        System.out.printf("%-16s", "AVERAGE:");
        for (int col = 0; col < brands.length; col++) {
            System.out.printf("%-16.1f", average[col]);
        }
        System.out.println();

        System.out.printf("%-16s", "MIN:");
        for (int col = 0; col < brands.length; col++) {
            System.out.printf("%-16d", minimum[col]);
        }
        System.out.println();
        System.out.printf("%-16s", "MAX:");
        for (int col = 0; col < brands.length; col++) {
            System.out.printf("%-16d", maximum[col]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");



    }
}

