public class test4 {
    public static void main(String[] args) {
        String[] Cities = {"JHB", "DBN", "CTN", "PE"};
        int[][] Speeds = {{128, 135, 139}, {155, 129, 175}, {129, 130, 185}, {195, 155, 221}};
        int maximum = Speeds[0][0];
        int minimum = Speeds[0][0];
        
        System.out.println("*************************************************************************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("*************************************************************************************");

        System.out.printf("%-25s", "");

        System.out.printf("%-15s%-15s%-15s \n", "JAN", "FEB", "MAR");

        for (int row = 0; row < Cities.length; row++ ){
            System.out.printf("%-25s", Cities[row]);

            for (int clm = 0; clm < Speeds[row].length; clm ++){
                System.out.printf("%-15s", Speeds[row][clm] + "km");

                if (maximum < Speeds[row][clm]){
                    maximum = Speeds[row][clm];
                }

                if (minimum > Speeds[row][clm]){
                    minimum = Speeds[row][clm];
                }
            }

            System.out.println();
        }

        System.out.println("*************************************************************************************");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("*************************************************************************************");
        System.out.println("Maximum speed captured: " + maximum + "km");
        System.out.println("Minimum speed captured: " + minimum + "km");


    }
}
