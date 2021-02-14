package pl.sda.zdjavapol73;

public class Clock {

    private int hours, minutes;

    public Clock() {

    }

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    //Dodac do metody Clock metode toString ktora ladnie wyswietla czas, np. "13:55"

    //"hh:mm", np.: 01:30 itd.
    @Override
    public String toString() {
        return "Clock{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
