package com.nhnacademy.app;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        //MovieParser movieParser = new ApacheCommonsCsvMovieParser();
        MovieParser movieParser = new BasicMovieParser();
        try{
            List<Movie> movieList = movieParser.parse("./movies.csv");
            for(Movie movie : movieList){
                System.out.println("ID : " + movie.getMovieId() + " title : " + movie.getTitle() + " genres : " + movie.getGenres());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
