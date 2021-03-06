package EvShul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Note {

    private String firstname;
    private String lastname;
    private String adress;
    private String email;
    private List<String> phones = new ArrayList<>();// dobavili spisok

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) {
        Collections.addAll(this.phones, phones);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", text='" + getText() + '\'' +/// poprobovatj text na note pomenjatj
                ", phones='" + phones + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {

        String str1 = str.toLowerCase();
        if (super.contains(str1)) {
            return true;
        } else if (firstname.toLowerCase().contains(str1)) {
            return true;
        } else if (lastname.toLowerCase().contains(str1)) {
            return true;
        } else if (adress.toLowerCase().contains(str1)) {
            return true;
        } else if (email.toLowerCase().contains(str1)) {
            return true;
        } else {
            for (String p : phones) {
                if (p.contains(str1)) {
                    return true;
                }
            }
        }
        return false;


    }

}
