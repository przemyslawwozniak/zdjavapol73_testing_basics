package pl.sda.zdjavapol73;

import org.junit.jupiter.api.Test;


public class ClockTest {

    //Clock() -> 00:00
    @Test
    void creates_and_inits_default_clock_to_00_00() {

    }
    //Clock(int h, int m) -> h:m
    @Test
    void creates_and_inits_clock_to_given_params() {

    }
    //Clock(int h) -> h:00
    @Test
    void creates_and_inits_clock_with_hour() {

    }

    //Clock(24, 00) -> nieprawidlowe, h_max = 23 -> IllegalArgumentException(hour...)
    @Test
    void could_not_create_and_init_clock_hour_above_upper_limit_23() {

    }

    //Clock(-1, 00) -> jw
    //Clock(20, 90) -> jw
    //Clock(12, -1) -> jw

    //3. dodawanie minut
    //12:00 + 120min -> 14:00
    //09:55 + 5min -> 10:00
    //23:00 + 60min -> 00:00
    //6:00 + 4*60min -> 10:00
    //12:00 + 13*60min + 15min -> 01:15
    //12:00 + (-60min) -> IllegalArgumentException

    //4. dodawanie innego obiektu zegara do 'tego' zegara
    //23:55 + 00:10 -> 00:05
    //2:00 + 12:00 -> 00:00
    //2:00 + 3:15 -> 15:15
    //0:00 + 00:00 -> 00:00 (kolejny dzien)
    //23:59 + 23:59 -> 23:58 (tuz przed kolejnym dniem)
    //11:05 + 1:55 = 13:00

    //5. dodawanie godzin do biezacego czasu -> wykorzystac dodawanie minut (metode), zapewniajaca odpowiednia konwersje, np. addHours(1) = addMinutes(60)
    //15:00 + 15h -> 06:00
    //12:00 + 12h -> 00:00
    //6:00 + 4h -> 10:00
    //9:30 + (-1h) -> IllegalArgumentException

    //6. dodawanie godzin i minut -> j/w, np. addHoursAndMinutes(1, 55) -> addMinutes(115)
    //11:05 + 1h 55min -> 13:00
    //11:00 + 1h 120min -> 14:00
    //10:00 + (-1h 30min) -> IllegalArgumentException
    //10:00 + (1h -30min) -> IllegalArgumentException
    //10:00 + (-1h -30min) -> IllegalArgumentException

}
