package com.codedifferently.labs.partA.ex01;

public class WatchMovie {
    public static String watchMovie() {
        String response ="";
        /* Your code goes here*/
        int moviePrice = 12;
        int movieRating = 5;
        if (moviePrice >= movieRating) {
            response += ("I'm interested in watching the movie");
        }else {
            response +=("I'm not interested in watching the movie");
        }





        return response;

    }
    public static void main(String args[]) {
        String movieOutput = watchMovie();
        System.out.println(movieOutput);


    }
}
