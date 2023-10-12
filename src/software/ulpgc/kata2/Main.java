package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        GameLoader loader = new CsvFileGameLoader(new File("vgsales.csv"));
        List<Game> games = loader.load();
        Map<Integer,Integer> barchart = new YearGameProcessor().processor(games);
        for (int key: barchart.keySet()){
            System.out.println(key + " = " + barchart.get(key));
        }
    }
}
