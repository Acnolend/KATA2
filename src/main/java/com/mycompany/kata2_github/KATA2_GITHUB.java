package com.mycompany.kata2_github;

import java.util.Map;

public class KATA2_GITHUB {

    public static void main(String[] args) {
            String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
            Histogram generator = new Histogram(data);
            Map<String, Integer> histogram = generator.getHistogram();

            for(Map.Entry<String, Integer> entry : histogram.entrySet()) {
                System.out.println(entry.getKey() + " ===> " + entry.getValue());
            }
        }

}
