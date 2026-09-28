public class arrays8 {
    public static void main(String[] args){
        int[][] weight = {{10,20,27},{22,5,20},{30,20,10}};
        String[] months = {"MONTH1","MONTH2","MONTH3"};
        String[] gyms = {"GYM1","GYM2","GYM3"};

        int[] maximum = new int[gyms.length];
        int[] minimum = new int[gyms.length];
        int[] total = new int[gyms.length];
        double[] average = new double[gyms.length];

        System.out.println("GYM WEIGHT-LOSS APPLICATION");
        System.out.println("---------------------------------------------------------------------------------------------------------");

             for(int clm = 0; clm < gyms.length; clm++) {
                 minimum[clm] = weight[clm][0];
                 maximum[clm] = weight[clm][0];

                 for (int row = 0; row < months.length; row++) {
                     total[clm] += weight[row][clm];

                     if (weight[row][clm] < minimum[clm]) {
                         minimum[clm] = weight[row][clm];
                     }
                     if (weight[row][clm] > maximum[clm]) {
                         maximum[clm] = weight[row][clm];
                     }

                 }
                 average[clm] = (double) total[clm] / months.length;
             }

             System.out.printf("%-11s","");
             System.out.printf("%-12s%-12s%-13s%-7s%-12s%-13s%-12s%-12s\n",
              "MONTH1", "MONTH2", "MONTH3","|","TOTAL", "AVERAGE", "MAX", "MIN");

             for(int row = 0; row < gyms.length; row++) {
                 System.out.printf("%-12s", gyms[row]);

                         for(int clm = 0; clm < months.length; clm++) {
                             System.out.printf("%-12s", weight[row][clm] + "kg");
                         }
                         
                         System.out.printf("%-8s","|");
                         String formattedAve = String.format("%.2fkg", average[row]);
                         System.out.printf("%-12s%-12s%-12s%-12s\n",
                                 total[row] + "kg", formattedAve , maximum[row] + "kg" ,minimum[row] + "kg" );
             }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}
