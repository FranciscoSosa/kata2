package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 1, 4, 5, 3, 2, 2, 3, 6, 6, 6, 4};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}
