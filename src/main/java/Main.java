import java.util.*;

/*
an example of work
is submitted to the input: 12
* a sequence is generated from [1, 12]: 1 2 3 4 5 6 7 8 9 10 11 12
* A random element is removed: 1 2 3 4 5 6 7 8 10 11 12
* mixed: 12 3 8 7 4 6 2 1 5 11 10
* missing item: **** 9
*/

public class Main {
    static public void run(int number) {
        IArrayOperation arrOper = new BaseArrayOperation();
        //entering the size of the array
        //final int size = SampleInput.enterIntNumber("Enter array length: \n");
        final int size = number;
        //--------------------------------------------------
        //creating an array
        ArrayList<Integer> array = new ArrayList<>();
        //--------------------------------------------------
        //filling an array with data
        SampleInput.enterIntArray(array, size, "Filling array elements: \n");
        //---------------------------------------------------
        arrOper.outputArray(array, "\n");
        //----------------------------------------------------
        //delete element
        arrOper.deleteRandomElement(array);
        //----------------------------------------------------
        arrOper.outputArray(array, "");
        //-----------------------------------------------------
        //random shuffling of the array
        arrOper.mixingArray(array);
        //-----------------------------------------------------
        arrOper.outputArray(array, "");
        //------------------------------------------------------
        //search for the missing elements
        var arrayFind = new ArrayFind(array.size());
        System.out.println("result: " + arrayFind.searchMissingElement(array));
    }
}