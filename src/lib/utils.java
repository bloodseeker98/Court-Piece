package lib;

public class utils {
    public static final double[] SHUFFLERS = new double[]{1.2, 3.1, 5, 2.2, 9.93};
    public static final String[] CARDS = new String[]{
        "AS", "1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "JS", "QS", "KS", 
        "AC", "1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "JC", "QC", "KC", 
        "AH", "1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "JH", "QH", "KH", 
        "AD", "1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "JD", "QD", "KD"};
    public static final int MAX_SCORE = 11;
    public static final char SPADES = 'S';
    public static final char CLUBS = 'C';
    public static final char HEARTS = 'H';
    public static final char DIAMONDS = 'D';
    public static final int SUIT_INDEX = 1;
    public static final int FACE_INDEX = 0;
}