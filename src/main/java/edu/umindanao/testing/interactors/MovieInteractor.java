package edu.umindanao.testing.interactors;

import edu.umindanao.testing.controllers.MovieController;
import edu.umindanao.testing.database.MovieDatabase;
import edu.umindanao.testing.models.Movie;

import java.util.List;

public class MovieInteractor {
    private MovieController movieController;

    public MovieInteractor(MovieController movieController) {
        this.movieController = movieController;
    }

    public void loadMovies() {
        // Logic to load movies from the model and update the view
        List<Movie> movies = MovieDatabase.getAllMovies();
        movieController.updateMovieList(movies);
    }
}
