package EvShul;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class Alarm extends Note implements Expirable {

    private String time;


    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean contains(String str) {

        String s = str.toLowerCase();
        if (time.toLowerCase().contains(s)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "id=" + getId() + '\'' +
                "text='" + getText() + '\'' +
                "time='" + time + '\'' +
                '}';
    }
}

