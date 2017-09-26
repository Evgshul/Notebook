package EvShul;

import asg.cliche.Command;
import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook {
    private List<Record> records = new ArrayList<Record>(); // sohranjaem dannie v massiv

    @Command
    public void createPerson(String firstName, String lastName, String adress, String email, String text, String... phones) {// sozdali metod

        Person r = new Person(); //sozdali novuju zapisj Record i polozhili v peremenuju "r" sozdalosj ID
        r.setFirstname(firstName);// ustanovili imja
        r.setLastname(lastName);
        r.setAdress(adress);
        r.setEmail(email);
        r.setText(text);
        r.addPhones(phones);

        records.add(r);// dobavili records v spisok
    }

    @Command
    public void createNote(String text) {
        Note n = new Note();
        n.setText(text);
        records.add(n);
    }

    @Command
    public void createAlarm(String time, String text) {

        Alarm a = new Alarm();
        a.setTime(time);
        a.setText(text);
        records.add(a);
    }

    @Command
    public void createReminder(String time, String text) {
        Reminder t = new Reminder();
        t.setTime(time);
        t.setText(text);
        records.add(t);
    }
    @Command
    public void remove(int id) {/// udalenie po ID
        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (r.getId() == id) {
                records.remove(i);
                break;
            }
        }
    }
    @Command
    public List<Record> list() {
        return records;
    }

    @Command
    public List<Record> find(String str) { /// komanda kot vozvraschaet spisok recordov
        List<Record> result = new ArrayList<>(); /// sozdajot pustoj spisok
        for (Record r : records) {
            if (r.contains(str))
            {
                result.add(r); /// dobavljaem v spisok poisk
            }
        }
        return result;
    }
}
