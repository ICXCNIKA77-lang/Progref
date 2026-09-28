public class test5 {
    public static void main (String[] args){
        String[] Months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] MakeOVer = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};



        System.out.println("------------------------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("------------------------------------------------------------------------------");

        System.out.printf("%-20s", "");

        System.out.printf("%-18s%-18s%-18s \n", "Bathrooms", "Kitchens", "Gardens");

        for (int row = 0; row < Months.length; row ++){
            System.out.printf("%-20s", Months[row]);

            for (int clm = 0; clm < MakeOVer[row].length; clm ++){
                System.out.printf("%-18d", MakeOVer[row][clm]);
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("------------------------------------------------------------------------------");

        for (int row = 0; row < Months.length; row ++){

            int total = 0;
            for (int clm = 0; clm < MakeOVer[row].length; clm ++) {
                total += MakeOVer[row][clm];
            }

                String stars = "";
                if (total >= 15){
                    stars = "***";
                }

            System.out.printf("%-10s%-8d %s\n",Months[row], total, stars);

        }


    }
}
