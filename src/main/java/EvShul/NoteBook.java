package EvShul;

import asg.cliche.Command;
import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;


import java.util.*;
import java.util.stream.Collectors;

public class NoteBook {
    private NavigableMap<Integer, Record> records = new TreeMap<>(); // sohranjaem dannie v massiv

    @Command
    public void createPerson(String firstName, String lastName, String adress, String email, String text, String... phones) {// sozdali metod

        Person r = new Person(); //sozdali novuju zapisj Record i polozhili v peremenuju "r" sozdalosj ID
        r.setFirstname(firstName);// ustanovili imja
        r.setLastname(lastName);
        r.setAdress(adress);
        r.setEmail(email);
        r.setText(text);
        r.addPhones(phones);

        records.put(r.getId(), r);// dobavili records v spisok
    }

    @Command
    public void createNote(String text) {
        Note n = new Note();
        n.setText(text);
        records.put(n.getId(), n);
    }

    @Command
    public void createAlarm(String time, String text) {

        Alarm a = new Alarm();
        a.setText(text);
        a.setTimeAsString(time);
        records.put(a.getId(), a);
    }

    @Command
    public void createReminder(String text, String time) {
        Reminder r = new Reminder();
        r.setText(text);
        r.setTimeAsString(time);
        records.put(r.getId(), r);
    }

    @Command
    public void remove(int id) {
        records.remove(id);
    }

    //@Command
    //public void remove(int id) {/// udalenie po ID
    //  for (int i = 0; i < records.size(); i++) {
    //      Record r = records.get(i);
    //    if (r.getId() == id) {
    //      records.remove(i);
    //    break;
    //  }
    //}
    //}

    @Command
    public Collection<Record> list() {
        return records.values();
    }

    @Command
    public List<Record> find(String str) { /// komanda kot vozvraschaet spisok recordov
        return records.values().stream()
                .filter(r -> r.contains(str))
                .collect(Collectors.toList());
    }

    @Command
    public Collection<Record> range(int start, int end) {
        return records.subMap(start, true, end, true)
                .values();
    }

    @Command
    public List<Record> listExpired() {
        List<Record> result = new ArrayList<>();
        for (Record r : records.values()) {
            if (r instanceof Expirable) {
                Expirable e = (Expirable) r;
                if (e.isExpired()) {
                    result.add(r);
                }
            }
        }
        return result;
    }

}
