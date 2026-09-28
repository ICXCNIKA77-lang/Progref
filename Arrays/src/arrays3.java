import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args) {
         int[] numbers = {1, 2, -3, 5, 7};
         int sum = 0;
         int product = 1;
         double average = 0;

         for (int i = 0; i < numbers.length; i ++)
              sum += numbers[i];

        for (int i = 0; i < numbers.length; i ++)
            product *= numbers[i];

        for (int i = 0; i < numbers.length; i ++)
            average = (double) sum / numbers.length;

        System.out.println(Arrays.toString(numbers));
          System.out.println( "Sum: " + sum + ",");
          System.out.print("Product: " + product + ", ");
          System.out.print("Average: " + average + ",");


    }
}
