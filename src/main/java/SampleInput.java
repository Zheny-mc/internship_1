import java.util.ArrayList;
import java.util.Scanner;

public class SampleInput {
    private static Scanner in = new Scanner(System.in);

    /* entering the int number */
    public static int enterIntNumber(String mess) {
        System.out.print(mess);
        return in.nextInt();
    }

    /* filling an array with data  */
    public static void enterIntArray(ArrayList<Integer> array, int size, String mess) {
        System.out.print(mess);
        for (int i = 0; i < size; i++)
            array.add(i+1);
            //array.add(enterIntNumber(""));
    }
}
