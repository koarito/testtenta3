package se.amir;

import java.util.ArrayList;

public class question2 {
    public void run(){
     float betyg = 0;
     ArrayList<Integer> points = new ArrayList<>();
     for(int i = 0; i < 5;i++){
        System.out.printf("Ange poäng från domare nr %d\n", i+1);
        points.add(Integer.parseInt(System.console().readLine()));
     }
     int smallest = 10, largest = 0;
     for(int i : points){
      if (i < smallest)
      smallest = i;
      if(i > largest)
      largest = i;
     }
     points.remove(points.indexOf(smallest));
     points.remove(points.indexOf(largest)); 
     for(int i : points)
     betyg += (i);
     System.out.printf("Resultat: %.3f", betyg/3);
    }
}