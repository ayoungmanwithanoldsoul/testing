package edu.umindanao.testing.controllers;

import edu.umindanao.testing.interactors.MovieInteractor;
import edu.umindanao.testing.models.Movie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class MovieController implements Initializable {
    @FXML
    private ListView<Movie> movieListView;

    private MovieInteractor movieInteractor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize and set up the interactor
        movieInteractor = new MovieInteractor(this);
        // Load movies into the view
        movieInteractor.loadMovies();
    }

    // Update the movie list in the view
    public void updateMovieList(List<Movie> movies) {
        movieListView.getItems().setAll(movies);
    }

    // Handle movie click event
    @FXML
    private void handleMovieClick(MouseEvent event) {
        Movie selectedMovie = movieListView.getSelectionModel().getSelectedItem();
        if (selectedMovie != null) {
            showMovieDetails(selectedMovie);
        }
    }

    // Show movie details in a new window
    private void showMovieDetails(Movie movie) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("movie_details.fxml"));
            VBox movieDetailsView = loader.load();

            MovieDetailsController detailsController = loader.getController();
            detailsController.setMovieDetails(movie);

            Stage detailsStage = new Stage();
            detailsStage.setScene(new   Scene(movieDetailsView));
            detailsStage.setTitle("Movie Details");
            detailsStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
