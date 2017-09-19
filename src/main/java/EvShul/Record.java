package EvShul;

public class Record {
    private static int counter = 0;// counter obschij dlja vseh
    private int id;
    private String firstname;
    private String lastname;
    private String phone;
    private String adress;
    private String email;

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

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
