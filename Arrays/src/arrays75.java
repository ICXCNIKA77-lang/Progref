public class arrays75 {
    public static void main(String[] args) {
        int[][] shoes = {{100, 150, 70}, {88, 92, 103}, {75, 45, 90}, {65, 95, 175}};
        String[] brands = {"NIKE", "ADIDAS", "REEBOK"};
        String[] quarter = {"Q1", "Q2", "Q3", "Q4"};

        int[] total = new int[quarter.length];
        double[] average = new double[quarter.length];
        int[] minimum = new int[quarter.length];
        int[] maximum = new int[quarter.length];

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("ULTIMATE SHOE SALES");
        System.out.println("---------------------------------------------------------------------------------------------------------");


        for (int row = 0; row < quarter.length; row++) {

            minimum[row] = shoes[row][0];
            maximum[row] = shoes[row][0];


            for (int col = 0; col < brands.length; col++) {
                total[row] += shoes[row][col];

                if (shoes[row][col] < minimum[row]) {
                    minimum[row] = shoes[row][col];
                }
                if (shoes[row][col] > maximum[row]) {
                    maximum[row] = shoes[row][col];
                }
            }

            average[row] = (double) total[row] / brands.length;
        }

        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12s%-12s\n",
                "QUARTER", "NIKE", "ADIDAS", "REEBOK", "TOTAL", "AVERAGE", "MIN", "MAX");

        for (int row = 0; row < quarter.length; row++) {
            System.out.printf("%-12s", quarter[row]);

            for (int col = 0; col < brands.length; col++) {
                System.out.printf("%-12d", shoes[row][col]);
            }

            System.out.printf("%-12d%-12.1f%-12d%-12d\n",
                    total[row], average[row], minimum[row], maximum[row]);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");



    }
}

