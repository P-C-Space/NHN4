package nhn20230905;

public class Movie {

    static int wscript = 6;
    static int wacting = 13;
    static int wdirection = 11;


    public static int movieRating (int s, int a, int d) {
        return wacting * s + wacting * a + wdirection * d;
    }
    // int script;
    // int acting;
    // int direction;

    // int rating(){
    //     return script + acting + direction;
    // }

}
