package se.amir;

public class Question5 {
    public void run(){
        Competition Gothia = new Competition("GothiaCup", "2021-11-27", "Göteborg");
        Gothia.addParticipants(new Participant("Amir", "Real Madrid CF"));
        Gothia.addParticipants(new Participant("Martino", "FC Barcelona"));
        Gothia.addParticipants(new Participant("De Jong", "FC Barcelona"));
        Gothia.addParticipants(new Participant("Mo Salah", "Liverpool FC"));

        System.out.printf("%s %s %s\n",Gothia.getName(), Gothia.getDate(), Gothia.getLocation());
        System.out.println("**************************************");

        for(Participant x : Gothia.getParticipants()){
           System.out.printf("%s %s\n", x.getName(), x.getClub());
           System.out.println("--------------------------------------"); 
        }

    }
}
