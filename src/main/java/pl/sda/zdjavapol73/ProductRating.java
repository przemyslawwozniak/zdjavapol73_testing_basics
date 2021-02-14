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
            if(score < 1) {
                this.score = 1;
            }
            else if(score > 10) {
                this.score = 10;
            }
            else {
                this.score = score;
            }
        }

}
