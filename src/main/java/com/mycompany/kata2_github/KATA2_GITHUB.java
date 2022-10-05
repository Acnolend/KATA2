package com.mycompany.kata2_github;

import java.util.HashMap;
import java.util.Map;

public class KATA2_GITHUB {

    public static void main(String[] args) {
        int[] data = {4, 1, 2, 4, 7, 9, 3, 5, 7, 2, 0, 1, 3, 5, 3, 3, 5};
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }
            else {
                histogram.put(data[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }

}
