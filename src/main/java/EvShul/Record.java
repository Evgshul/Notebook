package EvShul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Record {
    private static int counter = 0;// counter obschij dlja vseh
    private int id;

    public Record() {
        counter++;
        id = counter;
    }// konstruktor

    public int getId() {
        return id;
    }

}
