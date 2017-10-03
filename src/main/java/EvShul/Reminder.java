package EvShul;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Note implements Expirable {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

    public LocalDateTime time;

    public String getTimeAsString() {
        LocalDateTime dt = getTime();
        return dt.format(formatter);
    }
    public void setTimeAsString(String str) {
        LocalDateTime dt = LocalDateTime.parse(str, formatter);
        setTime(dt);
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + getId() + '\'' +
                "text='" + getText() + '\'' +
                "time=" + getTimeAsString() + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        String s = str.toLowerCase();
        if (super.contains(s)) {
            return true;
        } else if (getTimeAsString().toLowerCase().contains(s)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExpired() {
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(time)) {
            return true;
        } else {
            return false;
        }
    }
}

