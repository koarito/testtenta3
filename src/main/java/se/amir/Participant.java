package se.amir;

public class Participant {
    private String name;
    private String club;

    public Participant(String name, String club) {
        super();
        this.name = name;
        this.club = club;
    }
    public String getClub() {return club;}
    public String getName() {return name;}
}
