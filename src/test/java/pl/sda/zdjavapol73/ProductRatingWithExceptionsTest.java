package pl.sda.zdjavapol73;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRatingWithExceptionsTest {

    //JUnit przy uruchomieniu KAZDEJ metody testowej tworzy nowa instancje klasy testowej
    private ProductRatingWithExceptions pr = new ProductRatingWithExceptions();

    @Test
    void should_initialize_product_rating_score() {  //shouldInitializeProductRatingScore
        //Assertions.assertEquals(0, pr.getScore());    //JUnit 5, latwo pomylic kolejnosc argumentow
        Assertions.assertThat(pr.getScore()).isEqualTo(0);  //AssertJ - czytelniejszy
    }

    @Test
    void should_set_score_to_5_when_given_5() {
        //given

        //when
        pr.setScore(5);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(5);
    }

    @Test
    void should_set_score_to_1_when_given_1() {
        //given

        //when
        pr.setScore(1);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(1);
    }

    @Test
    void should_set_score_to_10_when_given_10() {
        //given

        //when
        pr.setScore(10);

        //then
        Assertions.assertThat(pr.getScore()).isEqualTo(10);
    }

    @Test
    void should_throw_when_given_11() {
        //given

        //when
        //then
        //JUnit assertion for exceptions
        assertThrows(IllegalArgumentException.class, () -> {
            pr.setScore(11);
        });
    }

    @Test
    void should_throw_when_given_0() {
        //given

        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> {
            pr.setScore(0);
        });
    }

    @Test
    void should_throw_when_given_minus10() {
        //given

        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> {
            pr.setScore(-10);
        });
    }

}
