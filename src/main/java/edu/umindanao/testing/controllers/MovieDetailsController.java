package edu.umindanao.testing.controllers;

import edu.umindanao.testing.models.Movie;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MovieDetailsController {
    @FXML
    private Label titleLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label genreLabel;

    public void setMovieDetails(Movie movie) {
        titleLabel.setText("Title: " + movie.getTitle());
        yearLabel.setText("Year: " + movie.getYear());
        genreLabel.setText("Genre: " + movie.getGenre());
    }
}
