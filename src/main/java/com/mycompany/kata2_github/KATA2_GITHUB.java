package com.mycompany.kata2_github;

import java.util.Map;

public class KATA2_GITHUB {

    public static void main(String[] args) {
        Integer[] data = {4, 1, 2, 4, 7, 9, 3, 5, 7, 2, 0, 1, 3, 5, 3, 3, 5};
        Histogram generator = new Histogram(data);
        Map<Integer, Integer> histogram = generator.getHistogram();
            
        for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }

}
