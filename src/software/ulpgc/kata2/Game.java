package software.ulpgc.kata2;

public class Game {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private double NAsales;
    private double EUsales;
    private double JPsales;
    private double Othersales;
    private double Globalsales;

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

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNAsales(double NAsales) {
        this.NAsales = NAsales;
    }

    public void setEUsales(double EUsales) {
        this.EUsales = EUsales;
    }

    public void setJPsales(double JPsales) {
        this.JPsales = JPsales;
    }

    public void setOthersales(double othersales) {
        Othersales = othersales;
    }

    public void setGlobalsales(double globalsales) {
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
