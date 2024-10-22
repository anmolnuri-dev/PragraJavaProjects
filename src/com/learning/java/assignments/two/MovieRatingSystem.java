package com.learning.java.assignments.two;

import java.util.Scanner;

public class MovieRatingSystem {

    String [] movies;
    double [] ratings;

    public MovieRatingSystem(String[] movies, double[] ratings) {
        if(movies.length != ratings.length) {
            System.out.println("Error: The number of movies must match the number of ratings.");
        }
        else {
            this.movies = movies;
            this.ratings = ratings;
        }
    }

    // Method to find and display the movie with the highest rating
    public void displayHighestRatedMovie() {
        if (movies.length == 0 || ratings.length == 0) {
            System.out.println("Error: No movies or ratings available.");
        }

        int highestRatingIndex = 0;
        for(int i=0; i<ratings.length;i++) {
            if(ratings[i] > ratings[highestRatingIndex]) {
                highestRatingIndex = i;
            }
        }
        System.out.println("The movie with the highest rating is: " + movies[highestRatingIndex]);
        System.out.println("Rating: " + ratings[highestRatingIndex] + " out of 5");
    }

    public static void main(String[] args) {
        // Example movie data
        String[] movies = {
                "Inception",
                "The Dark Knight",
                "Interstellar",
                "The Matrix",
                "Avengers: Endgame"
        };
        double[] ratings = {5.0, 4.5, 5, 3.5, 4.5};

        // Create an instance of MovieRatingSystem
        MovieRatingSystem movieRatingSystem = new MovieRatingSystem(movies, ratings);

        // Call method to display the highest-rated movie
        movieRatingSystem.displayHighestRatedMovie();
    }
}
