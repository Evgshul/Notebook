package EvShul;

import asg.cliche.Command;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Alarm extends Note implements Expirable {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm");

    private LocalTime time;

    public String getTimeAsString() {
        LocalTime t = getTime();
        return t.format(formatter);
    }
    public void setTimeAsString(String str) {
        LocalTime t = LocalTime.parse(str, formatter);
        setTime(t);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {
        String s = str.toLowerCase();
        if (getTimeAsString().toLowerCase().contains(s)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() + '\'' +
                "text='" + getText() + '\'' +
                "time='" + getTimeAsString() + '\'' +
                '}';
    }


    @Override
    public boolean isExpired() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(time)) {
            return true;
        } else {
            return false;
        }
    }
}

