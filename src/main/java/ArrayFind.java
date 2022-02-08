import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayFind {
    private Map<Integer, Boolean> map;

    public ArrayFind(int size) {
        map = new HashMap<>();
        for (int i = 0; i < size; ++i) {
            map.put(i+1, false);
        }
    }

    //search for the missing elements
    public int searchMissingElement(ArrayList<Integer> array) {
        //filling in known cells
        for (int i: array) {
            if (map.containsKey(i)) {
                map.replace(i, true);
            }
        }
        //search for the missing
        int res = -1;
        Set<Map.Entry<Integer, Boolean>> entrySet = map.entrySet();

        var desiredObject = false; //что хотим найти
        for (Map.Entry<Integer, Boolean> pair : entrySet) {
            if (pair.getValue() == desiredObject) {
                res = pair.getKey(); // нашли наше значение и возвращаем  ключ
                break;
            }
        }
        return res;
    }
}
