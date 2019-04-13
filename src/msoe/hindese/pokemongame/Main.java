/*
 * Course: CS2852 - 071
 * Spring 2018-2019
 * Lab 3 - Dot To Dot
 * Name: Ethan Hindes
 * Created: 03.05.2019
 */

package msoe.hindese.pokemongame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * This class launches the application
 * @author Ethan Hindes
 * @version TODO
 */
public class Main extends Application {

    /**
     * This method sets the frame work of the application
     * @param primaryStage stage for application
     * @throws IOException thrown if there was an error in loading the fxml code
     */
    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        primaryStage.setTitle("Ethan Hindes pokemon"); // FIXME
        final int width = 600;
        final int height = 625;
        primaryStage.setScene(new Scene(root, width, height));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}