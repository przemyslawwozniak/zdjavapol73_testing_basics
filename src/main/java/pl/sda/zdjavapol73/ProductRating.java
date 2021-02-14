package pl.sda.zdjavapol73;

public class ProductRating {

    private int score;
    //int packagePrivateField; //widoczne tylko dla klas w danym pakiecie
    //public int publicField;
    //protected int protectedField;   //dziedziczone

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
