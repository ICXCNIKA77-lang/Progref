import java.util.Scanner;

public class arrays4 {
    public static void main (String[]args ) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1, 1, 1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7};

        for(int i = 0; i < numbers.length; i ++)
            System.out.print(numbers[i] + " ");
        System.out.println("Choose a number from the array:");;
        int target = input.nextInt();

        System.out.println( target + " Occurs: " + getNumberCounter(numbers, target) + " times");

    }

    public static int getNumberCounter(int[] numbers, int target) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++)
            if (target == numbers[i])
                counter++;

        return counter;
    }
}
