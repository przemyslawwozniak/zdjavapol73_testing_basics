package pl.sda.zdjavapol73;

public class ProductRatingWithExceptions {

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score < 1 || score > 10) {
            throw new IllegalArgumentException(score + " is not within range: <1, 10>");
        }

        this.score = score;
    }
}
