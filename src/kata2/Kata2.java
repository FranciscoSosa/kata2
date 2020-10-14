package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 1, 4, 5, 3, 2, 2, 3, 6, 6, 6, 4};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
    
}
