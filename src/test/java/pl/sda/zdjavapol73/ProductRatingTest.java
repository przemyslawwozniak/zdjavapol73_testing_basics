package pl.sda.zdjavapol73;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRatingTest {

    @Test
    public void should_initialize_product_rating_score() {  //shouldInitializeProductRatingScore
        ProductRating pr = new ProductRating();

        Assertions.assertTrue(pr.getScore() == 0);
    }

}
