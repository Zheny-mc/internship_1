import java.util.ArrayList;
import java.util.Random;

public class BaseArrayOperation implements IArrayOperation {
    public void outputArray(ArrayList<Integer> array, String mess) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println(mess);
    }

    //-------------------------------------------------------------
    public void deleteRandomElement(ArrayList<Integer> array) {
        int randNumb = getRandIntNumber(array.size());
        array.remove(randNumb);
    }

    /* generate number [0..n) */
    public int getRandIntNumber(int upperBound) {
        return (int) ( Math.random() *  upperBound );
    }
    //---------------------------------------------------------------------
    /* random shuffling of the array */
    public void mixingArray(ArrayList<Integer> array) {
        int index;
        Random random = new Random();
        for (int i = array.size() - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i) {
                array.set(index, array.get(index) ^ array.get(i));
                array.set(i, array.get(i) ^ array.get(index));
                array.set(index, array.get(index) ^ array.get(i));
            }
        }
    }
}
