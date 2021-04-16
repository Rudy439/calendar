package sk.kosickaakademia.rudolfmato.challenge.pack;

import java.util.Date;

public class Challenge {
    private Object id;
    private String name;
    private int priority;
    private boolean done;
    private Date date;
    private double price;

    public void setId(Object id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
