package EvShul;

import asg.cliche.Command;
import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Record> records = new ArrayList<Record>(); // sohranjaem dannie v massiv

    @Command
    public void create ( String firstName,String lastName, String phone ){// sozdali metod
        Record r = new Record(); //sozdali novuju zapisj Record i polozhili v peremenuju "r" sozdalosj ID
        r.setFirstname(firstName);// ustanovi imja
        r.setLastname(lastName);
        r.setPhone(phone);
        records.add(r);// dobavili records v spisok
    }
    @Command
    public List<Record> list() {
        return records;
    }
}