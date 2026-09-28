public class test3 {
    public static void main (String[]args){
        String[] Cameras = {"CANON", "SONY", "NIKON"};
        double[][] Costs = {{10500.00, 8500.00},{9500.00, 7200.00},{12000.00, 8000.00}};
        double maxDiff = 0;
        String maxCamera = "";

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.printf("%-16s", "");

        System.out.printf("%-25s%-25s\n", "MIRRORLESS", "DSLR");

        for (int row = 0; row < Cameras.length; row ++){
            System.out.printf("%-16s", Cameras[row]);

            for (int clm = 0; clm < Costs[row].length; clm ++){
                System.out.printf("%-25s", String.format("R %.2f", Costs[row][clm]));
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int row = 0; row < Cameras.length; row ++){
            double diff = Costs[row][0] - Costs[row][1];

            String stars = "";
            if (diff >= 2500) {
                stars = "***";
            }

            if (diff > maxDiff) {
                maxDiff = diff;
                maxCamera = Cameras[row];
            }

            System.out.printf("%-16s %s%s \n",
                    Cameras[row], String.format("R %.2f", diff), stars);

        }

        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + maxCamera);
        System.out.println("-------------------------------------------------------------------------------------");


    }
}
