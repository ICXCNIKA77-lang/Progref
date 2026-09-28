import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {
        int[][] values = {{1, 2, 3, 4}, {5, 6, 7, 8}};


        for (int i = 0; i < values.length; i ++ ) {
            System.out.print( "Values " + (i + 1) + " ");;


            for (int y = 0; y < values.length; y ++ )
                System.out.print( values[i][y] + " ");

            }

    }
}
