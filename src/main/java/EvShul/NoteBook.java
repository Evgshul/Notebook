package EvShul;

import asg.cliche.Command;
import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook {
    private List<Record> records = new ArrayList<Record>(); // sohranjaem dannie v massiv

    @Command
    public void create(String firstName, String lastName, String adress, String email, String... phone) {// sozdali metod

        Record r = new Record(); //sozdali novuju zapisj Record i polozhili v peremenuju "r" sozdalosj ID
        r.setFirstname(firstName);// ustanovi imja
        r.setLastname(lastName);
        r.setAdress(adress);
        r.setEmail(email);
        //List<String> list = new ArrayList<String>();
        for (String s : phone) {
            r.setPhone(s);
        }
        //System.out.println(s);
        records.add(r);// dobavili records v spisok
    }

    @Command
    public List<Record> list() {
        return records;
    }
}
