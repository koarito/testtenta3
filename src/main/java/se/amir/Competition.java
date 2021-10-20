package se.amir;

import java.util.ArrayList;

public class Competition {
    private String name;
    private String date;
    private String location;
    private ArrayList<Participant> participants  = new ArrayList<>();

    public Competition(String name, String date, String location) {
        super();
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void addParticipants(Participant deltagare){
        participants.add(deltagare);
    }
    public ArrayList<Participant> getParticipants() {return participants;}
    public String getDate() {return date;}
    public String getLocation() {return location;}
    public String getName() {return name;}
}
