package mastering.repetition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      
        HashSet<String> set = new HashSet<> ();
        List<String> list2 = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        List listx =new ArrayList();
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();


        int calc1 =  calculateScore("Tomek", 500);
	int calc2 =  calculateScore(2000);
	calculateScore();

        System.out.println("new score: " +calc1);
        System.out.println("new score: " +calc2);

        double com1 = calcFeetAndInchesToCentimeters(6,0);
       // System.out.println(com1);

        double com2 = calcFeetAndInchesToCentimeters(157);
       // System.out.println(com2);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored "
                + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score){
        System.out.println("Player "   + " scored "
                + score + " points");
        return score * 1000;
    }
    public static int calculateScore( ){
        System.out.println("No Players "  );
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double ineches){

        if(feet >=0 && ineches >=0 && ineches <= 12){
          double inchToCm = ineches * 2.54;
          double feetToCm = feet * 30.48;
            System.out.println(inchToCm + " " + feetToCm);
           return inchToCm + feetToCm;
        }
        else{
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double ineches){

        if( ineches >= 0){
           double feetInIneches = (int)ineches /12;
           double remaining = (int) ineches%12;
            System.out.println(ineches + " inches is equal to " + feetInIneches + " feet and " + remaining);
           return calcFeetAndInchesToCentimeters(feetInIneches,remaining);
        }
        else{
            return -1;
        }

    }

}

