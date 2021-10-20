package se.amir;

public class Question6 {
    public void run(){
        System.out.println("Mata in en text");
        String text = System.console().readLine();
        int counter = 0;
        for(int i = 0; i < text.length();i++){
            if(Character.isDigit(text.charAt(i)))
            counter++;
        }   
        System.out.printf("%d siffor matades in\n", counter);
    }
}
