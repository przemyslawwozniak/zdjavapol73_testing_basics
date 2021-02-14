package pl.sda.zdjavapol73;

public class Clock {

    private int hours, minutes;

    public Clock() {

    }

    public Clock(int hours) {
        setHours(hours);
    }

    public Clock(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

/*    public void addMinutes(int minutes) {
        int summedMinutes = this.minutes + minutes;

        if(summedMinutes >= 60) {
            int hours = summedMinutes / 60;
            addHours(hours);

            int restMinutes = summedMinutes - hours * 60;

            if(this.minutes + restMinutes == 60) {
                this.minutes = 0;
            }
            else {
                this.minutes += restMinutes;
            }
        }
        else {
            this.minutes = summedMinutes;
        }
    }*/

    //23:55 + 00:10 -> 00:05
    //summedMinutes = 55+10=65
    //hoursFromMinutes = 1 -> 23 + 1 = 24 -> 24 % 24 = 0 (hours)
    //65 - 1 * 60 = 5 (minutes)
    public void addMinutes(int minutes) {
        if(minutes < 0) {
            throw new IllegalArgumentException();
        }

        int summedMinutes = this.minutes + minutes;
        if(summedMinutes > 59) {
            int hoursFromMinutes = summedMinutes/60;    //61/60 = 1; 30/60 = 0
            addHours(hoursFromMinutes);

            this.minutes = summedMinutes - hoursFromMinutes * 60;
        }
        else {
            this.minutes += minutes;
        }
    }

/*    public void addHours(int hours) {
        int summedHours = this.hours + hours;

        if(summedHours >= 24) {
            int days = summedHours / 24;
            int restHours = summedHours - days * 24;

            if(restHours == 0) {
                this.hours = 0;
            }
            else {
                this.hours += restHours;
            }
        }
        else {
            this.hours = summedHours;
        }
    }*/

    public void addHours(int hours) {
        int summedHours = this.hours + hours;
        if(summedHours > 23) {
            this.hours = summedHours % 24;
        }
        else {
            this.hours += hours;
        }
    }

    public void addClock(Clock other) {
        addMinutes(other.totalMinutes());
    }

    private int totalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours <= 23)
            this.hours = hours;
        else
            throw new IllegalArgumentException();
    }

    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            throw new IllegalArgumentException();
    }

    //Dodac do metody Clock metode toString ktora ladnie wyswietla czas, np. "13:55"

    //"hh:mm", np.: 01:30 itd.
    @Override
    public String toString() {
        return format(hours) + ":" + format(minutes);
    }

    private String format(int i) {
        if(i < 10)
            return "0" + i;
        else
            return Integer.toString(i);
    }
}
