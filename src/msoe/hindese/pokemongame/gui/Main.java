/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This class launches the application
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method sets the frame work of the application
     *
     * @param primaryStage stage for application
     * @throws IOException thrown if there was an error in loading the fxml code
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("gui/FXML.fxml"));
        primaryStage.setTitle("Ethan Hindes Pokemon");
        final int width = 700;
        final int height = 725;
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.show();
    }
}