public class arrays10 {
    public static void main (String[]args) {
        int[][] jobs = {{8, 2, 5},{7, 4, 5},{5, 5, 2},{2, 2, 3},{7, 7, 9},{7, 8, 5}};
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE"};
        String[] rooms = {"BATHROOMS", "KITCHENS", "GARDEN"};
        int total = 0;

        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.printf("%-18s"," ");

        System.out.printf("%-18s%-18s%-18s\n",
                "Bathroom", "Kitchens", "Gardens");

        for (int row = 0; row < months.length; row ++){
            System.out.printf("%-18s",months[row]);

            for (int col = 0; col < rooms.length; col++) {
                System.out.printf("%-18d", jobs[row][col]);

            }


            System.out.println();

        }

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int row = 0; row < jobs.length; row ++){
            total = 0;

            for (int col = 0; col < rooms.length; col ++) {
                total += jobs[row][col];
            }

            String stars = (total >= 15) ? "***" : "";
            System.out.printf("%-8s %-8d %-10s %n",months[row], total, stars);

        }

        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
