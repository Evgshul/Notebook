package EvShul;

public class Reminder extends Note implements Expirable {

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
                "text='" + getText() + '\'' +
                "time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        String s = str.toLowerCase();
        if (super.contains(s)) {
            return true;
        } else if (time.toLowerCase().contains(s)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
