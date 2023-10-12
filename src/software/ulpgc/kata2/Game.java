package software.ulpgc.kata2;

public class Game {
    private final int rank;
    private final String name;
    private final String platform;
    private final int year;
    private final String genre;
    private final String publisher;
    private final double NAsales;
    private final double EUsales;
    private final double JPsales;
    private final double Othersales;
    private final double Globalsales;

    public Game(int rank, String name, String platform, int year, String genre, String publisher, double nAsales, double eUsales, double jPsales, double othersales, double globalsales) {
        this.rank = rank;
        this.name = name;
        this.platform = platform;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
        NAsales = nAsales;
        EUsales = eUsales;
        JPsales = jPsales;
        Othersales = othersales;
        Globalsales = globalsales;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getNAsales() {
        return NAsales;
    }

    public double getEUsales() {
        return EUsales;
    }

    public double getJPsales() {
        return JPsales;
    }

    public double getOthersales() {
        return Othersales;
    }

    public double getGlobalsales() {
        return Globalsales;
    }

    @Override
    public String toString() {
        return "Game{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", NAsales=" + NAsales +
                ", EUsales=" + EUsales +
                ", JPsales=" + JPsales +
                ", Othersales=" + Othersales +
                ", Globalsales=" + Globalsales +
                '}';
    }
}
