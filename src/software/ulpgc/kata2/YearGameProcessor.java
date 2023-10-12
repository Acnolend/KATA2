package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearGameProcessor implements GameProcessor {
    @Override
    public Map<Integer, Integer> processor(List<Game> games) {
        Map<Integer,Integer> result = new HashMap<>();
        for(Game game: games){
            int year = game.getYear();
            result.put(year, result.getOrDefault(year,0) + 1);
        }
        return result;
    }
}
