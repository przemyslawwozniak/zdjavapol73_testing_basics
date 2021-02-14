package pl.sda.zdjavapol73;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class ClockTest {

    private Clock clock = new Clock();

    //Clock() -> 00:00
    @Test
    void creates_and_inits_default_clock_to_00_00() {
        //given


        //when


        //then
        Assertions.assertThat(clock).isNotNull();
        Assertions.assertThat(clock.getHours()).isEqualTo(0);
        Assertions.assertThat(clock.getMinutes()).isEqualTo(0);
        Assertions.assertThat(clock.toString()).isEqualTo("00:00");

    }
    //Clock(int h, int m) -> h:m
    @Test
    void creates_and_inits_clock_to_given_params() {
        //given
        clock = new Clock(10, 50);

        //when


        //then
        Assertions.assertThat(clock).isNotNull();
        Assertions.assertThat(clock.getHours()).isEqualTo(10);
        Assertions.assertThat(clock.getMinutes()).isEqualTo(50);
        Assertions.assertThat(clock.toString()).isEqualTo("10:50");
    }
    //Clock(int h) -> h:00
    @Test
    void creates_and_inits_clock_with_hour() {

    }

    //Clock(24, 00) -> nieprawidlowe, h_max = 23 -> IllegalArgumentException(hour...)
    @Test
    void could_not_create_and_init_clock_hour_above_upper_limit_23() {
        //given


        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> {
            clock = new Clock(24);
        });

    }

    //Clock(-1, 00) -> jw
    @Test
    void could_not_create_and_init_clock_negative_hour() {

    }
    //Clock(20, 90) -> jw
    @Test
    void could_not_create_and_init_clock_mins_above_upper_limit_59() {

    }
    //Clock(12, -1) -> jw
    @Test
    void could_not_create_and_init_clock_negative_mins() {

    }

    //3. dodawanie minut
    //12:00 + 120min -> 14:00
    @Test
    void should_add_120_mins_to_clock_12_00_modifies_clock_to_14_00() {
        //given
        clock = new Clock(12, 0);

        //when
        clock.addMinutes(120);

        //then
        Assertions.assertThat(clock).isNotNull();
        Assertions.assertThat(clock.getHours()).isEqualTo(14);
        Assertions.assertThat(clock.getMinutes()).isEqualTo(0);
        Assertions.assertThat(clock.toString()).isEqualTo("14:00");
    }
    //09:55 + 5min -> 10:00
    @Test
    void should_add_5_mins_to_clock_09_55_modifies_clock_to_10_00() {

    }
    //23:00 + 60min -> 00:00
    @Test
    void should_add_60_mins_to_clock_23_00_modifies_clock_to_00_00() {

    }
    //6:00 + 4*60min -> 10:00
    @Test
    void should_add_240_mins_to_clock_6_00_modifies_clock_to_10_00() {

    }
    //12:00 + 13*60min + 15min -> 01:15
    @Test
    void should_add_795_mins_to_clock_12_00_modifies_clock_to_01_15() {

    }
    //12:00 + (-60min) -> IllegalArgumentException
    //wymaga modyfikacji metody addMinutes
    @Test
    void throws_on_adding_minus_60_mins_to_clock_12_00() {

    }

    //4. dodawanie innego obiektu zegara do 'tego' zegara

    @Test
    void throws_NullPointerException_on_adding_null_clock() {
        
    }

    //23:55 + 00:10 -> 00:05
    @Test
    void should_add_clock_00_10_to_clock_23_55_modifies_clock_to_00_05() {
        //given
        clock = new Clock(23, 55);
        Clock anotherClock = new Clock(0, 10);
        //when
        clock.addClock(anotherClock);

        //then
        Assertions.assertThat(clock).isNotNull();
        Assertions.assertThat(clock.getHours()).isEqualTo(0);
        Assertions.assertThat(clock.getMinutes()).isEqualTo(5);
        Assertions.assertThat(clock.toString()).isEqualTo("00:05");
    }
    //2:00 + 12:00 -> 00:00
    @Test
    void should_add_clock_12_00_to_clock_02_00_modifies_clock_to_00_00() {

    }
    //2:00 + 3:15 -> 15:15
    @Test
    void should_add_clock_03_15_to_clock_02_00_modifies_clock_to_15_15() {

    }
    //0:00 + 00:00 -> 00:00 (kolejny dzien)
    @Test
    void should_add_clock_00_00_to_clock_00_00_modifies_clock_to_00_00_next_day() {

    }
    //23:59 + 23:59 -> 23:58 (tuz przed kolejnym dniem)
    @Test
    void should_add_clock_23_59_to_clock_23_59_modifies_clock_to_23_58() {

    }
    //11:05 + 1:55 = 13:00
    @Test
    void should_add_clock_01_55_to_clock_11_05_modifies_clock_to_13_00() {

    }

    //5. dodawanie godzin do biezacego czasu -> wykorzystac dodawanie minut (metode), zapewniajaca odpowiednia konwersje, np. addHours(1) = addMinutes(60)
    //15:00 + 15h -> 06:00
    @Test
    void should_add_15_hours_to_clock_15_00_modifies_clock_to_06_00() {

    }
    //12:00 + 12h -> 00:00
    @Test
    void should_add_12_hours_to_clock_12_00_modifies_clock_to_00_00() {

    }
    //6:00 + 4h -> 10:00
    @Test
    void should_add_4_hours_to_clock_06_00_modifies_clock_to_10_00() {

    }
    //9:30 + (-1h) -> IllegalArgumentException
    //modyfikacja addHours
    @Test
    void throws_on_adding_minus_1_hour_to_clock_09_30() {

    }

    //6. dodawanie godzin i minut -> j/w, np. addHoursAndMinutes(1, 55) -> addMinutes(115)
    //11:05 + 1h 55min -> 13:00
    //nowa metoda addHoursAndMinutes(int hours, int minutes) ---> hint: popatrz na addClock
    @Test
    void should_add_1_hour_and_55_mins_to_clock_11_05_modifies_clock_to_13_00() {

    }
    //11:00 + 1h 120min -> 14:00
    @Test
    void should_add_1_hour_and_120_mins_to_clock_11_00_modifies_clock_to_14_00() {

    }
    //10:00 + (-1h 30min) -> IllegalArgumentException
    @Test
    void throws_on_adding_minus_1_hour_and_30_mins_to_clock_10_00() {

    }
    //10:00 + (1h -30min) -> IllegalArgumentException
    @Test
    void throws_on_adding_1_hour_and_minus_30_mins_to_clock_10_00() {

    }
    //10:00 + (-1h -30min) -> IllegalArgumentException
    @Test
    void throws_on_adding_minus_1_hour_and_minus_30_mins_to_clock_10_00() {

    }

}
