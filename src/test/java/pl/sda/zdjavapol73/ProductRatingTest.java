package pl.sda.zdjavapol73;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRatingTest {

    @Test
    public void should_initialize_product_rating_score() {  //shouldInitializeProductRatingScore
        ProductRating pr = new ProductRating();

        //Assertions.assertEquals(0, pr.getScore());    //JUnit 5, latwo pomylic kolejnosc argumentow
        Assertions.assertThat(pr.getScore()).isEqualTo(0);  //AssertJ - czytelniejszy
    }

    /*
    1. setScore(5) powoduje ustawienie ProductRating.score = 5
    2. setScore(1)	//wartosci graniczne
    3. setScore(10)	//wartosci graniczne
    4. setScore(11) -> 10 //wyjscie poza zakres - nieprawidlowe wartosci
    5. setScore(0) -> 1
    6. setScore(-10) -> 1
     */

}
