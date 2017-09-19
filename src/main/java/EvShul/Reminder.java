package EvShul;

public class Reminder extends Note {

    public String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {// kak object vivoditsja na ekran
        return "Reminder{" +
                "id=" + getId() +
                "text='" + getText() +
                "time='" + time + '\'' +
                '}';
    }
}
