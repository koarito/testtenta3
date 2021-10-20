package se.amir;

import java.util.ArrayList;

public class StringFilter {
    public ArrayList<String> remoteShort(ArrayList<String> lista, int minLennght){
        ArrayList<String> betterList = new ArrayList<>();
        for(String i: lista){
            if(i.length() > minLennght)
            betterList.add(i);
        }
        return betterList;
    }
}
