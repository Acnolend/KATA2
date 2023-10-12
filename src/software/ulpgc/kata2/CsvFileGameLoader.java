package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileGameLoader implements GameLoader{

    private final File file;

    public CsvFileGameLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Game> load() {
        try{
            return load(new FileReader(file));
        } catch(IOException e){
            return Collections.emptyList();
        }
    }

    public List<Game> load(FileReader file) {
        return load(new BufferedReader(file));
    }

    public List<Game> load(BufferedReader reader){
        return reader.lines().skip(1).map(this::toGame).collect(Collectors.toList());
    }

    private Game toGame(String line){
        return toGame(line.split(","));
    }

    private Game toGame(String[] fields){
        return new Game(
                StringtoInt(fields[0]),
                fields[1],
                fields[2],
                StringtoInt(fields[3]),
                fields[4],
                fields[5],
                StringtoDouble(fields[6]),
                StringtoDouble(fields[7]),
                StringtoDouble(fields[8]),
                StringtoDouble(fields[9]),
                StringtoDouble(fields[10])
        );
    }

    private int StringtoInt(String s){
        try {
            return Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return 0;
        }
    }

    private double StringtoDouble(String s){
        try {
            return Double.parseDouble(s);
        } catch(NumberFormatException e) {
            return 0;
        }
    }
}
