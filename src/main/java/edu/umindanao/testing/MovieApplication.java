package edu.umindanao.testing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("movies_view.fxml"));
            primaryStage.setScene(new Scene(loader.load()));
            primaryStage.setTitle("Movies Application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
