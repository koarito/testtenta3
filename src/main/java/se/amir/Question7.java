package se.amir;

import java.util.ArrayList;
import java.util.Collections;

public class Question7 {
    public void run(){
       ArrayList <Integer> lista = new ArrayList<>(); 
        while(true){
            System.out.println("Mata in ett tal: ");
            lista.add(Integer.parseInt(System.console().readLine()));
            System.out.println("Vill du mata in fler?");
            String answer = System.console().readLine();
            if(!(answer.equalsIgnoreCase("J") || answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("ja") || answer.equalsIgnoreCase("Yes")))
            break;
        }
        for(int i = 0; i < lista.size(); i++){
            Collections.swap(lista, i, i+1);
            i++;
        }
        for(int i : lista)
        System.out.println(i);
    }
}
