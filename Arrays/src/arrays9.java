public class arrays9 {
    public static void main (String[] args) {
        int[][] jobs = {{8, 2, 5},{7, 4, 5},{5, 5, 2},{2, 2, 3},{7, 7, 9},{7, 8, 5}};
        String[] months = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE"};
        String[] rooms = {"BATHROOMS", "KITCHENS", "GARDEN"};

        int[] total = new int[months.length];

        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("-------------------------------------------------------------");

        System.out.printf("%-18s", " ");
        System.out.printf("%-18s%-18s%-12s\n",
                "BATHROOMS", "KITCHENS", "GARDEN");


        for(int row = 0; row < months.length; row ++ ) {
            System.out.printf("%-18s", months[row]);



            for (int col = 0; col < rooms.length; col++) {
                System.out.printf("%-18s", jobs[row][col]);
                total[row] += jobs[row][col];

            }
            System.out.println();

        }

        System.out.println("-------------------------------------------------------------");
        System.out.println(" MONTHLY REPORT ");
        System.out.println("-------------------------------------------------------------");

        for(int row = 0; row < months.length; row ++ ) {
            System.out.printf("%-18s", months[row]);




                System.out.printf("%-18d", total[row]);
            System.out.println();

        }






    }
}
