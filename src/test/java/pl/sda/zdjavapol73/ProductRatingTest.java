package pl.sda.zdjavapol73;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRatingTest {

    @Test
    void should_initialize_product_rating_score() {  //shouldInitializeProductRatingScore
        ProductRating pr = new ProductRating();

        //Assertions.assertEquals(0, pr.getScore());    //JUnit 5, latwo pomylic kolejnosc argumentow
        Assertions.assertThat(pr.getScore()).isEqualTo(0);  //AssertJ - czytelniejszy
    }

    /*
    2. setScore(1)	//wartosci graniczne
    3. setScore(10)	//wartosci graniczne
    4. setScore(11) -> 10 //wyjscie poza zakres - nieprawidlowe wartosci
    5. setScore(0) -> 1
    6. setScore(-10) -> 1
     */

    @Test
    void should_set_score_to_5_when_given_5() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(5);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(5);
    }

    @Test
    void should_set_score_to_1_when_given_1() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(1);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(1);
    }

    @Test
    void should_set_score_to_10_when_given_10() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(10);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(10);
    }

    @Test
    void should_set_score_to_10_when_given_11() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(11);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(10);
    }

    @Test
    void should_set_score_to_1_when_given_0() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(0);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(1);
    }

    @Test
    void should_set_score_to_1_when_given_minus10() {
        //given
        ProductRating pr = new ProductRating();

        //when
        pr.setScore(-10);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(1);
    }

}
