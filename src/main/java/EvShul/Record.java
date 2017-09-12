package EvShul;

public class Record {
    private static int counter = 0;// counter obschij dlja vseh
    private int id;
    private String firstname;
    private String lastname;
    private String phone;

    public Record() {
        counter++;
        id = counter;
    }// konstruktor

    public int getId() {
        return id;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {// dobavili cherez generate + toString
        return "Record{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
