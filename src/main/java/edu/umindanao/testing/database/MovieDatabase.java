package edu.umindanao.testing.database;

import edu.umindanao.testing.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private static List<Movie> movies = new ArrayList<>();

    static {
        movies.add(new Movie("Inception", 2010, "Sci-Fi"));
        movies.add(new Movie("The Shawshank Redemption", 1994, "Drama"));
        movies.add(new Movie("The Dark Knight", 2008, "Action"));
        // Add more movies as needed
    }

    public static List<Movie> getAllMovies() {
        return new ArrayList<>(movies);
    }
}
