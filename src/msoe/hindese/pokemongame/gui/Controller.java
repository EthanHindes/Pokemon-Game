/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.gui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class controls the gui application
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Controller implements Initializable {

    @FXML
    TextArea playerField;
    private Map map;

    /**
     * This method responds to the user moving across the map
     *
     * @param key that was pressed
     */
    @FXML
    private void changeMap(KeyEvent key) {
//        char move = ' ';
//        switch(key.getCode()) {
//            case W:
//            case UP:
//                move = 'W';
//                break;
//            case A:
//            case LEFT:
//                move = 'A';
//                break;
//            case S:
//            case DOWN:
//                move = 'S';
//                break;
//            case D:
//            case RIGHT:
//                move = 'D';
//                break;
//        }
//        if(move != ' ') {
//            playerField.setText(map.updateMap(move));
//        }
        playerField.setText(map.updateMap(key.getCharacter().charAt(0)));
    }

    /**
     * This method shuts down the application
     */
    @FXML
    private void close() {
        Platform.exit();
    }

    /**
     * This method loads the map and sets the gui
     *
     * @param url            NA
     * @param resourceBundle NA
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        char[][] charGrid = {
                {'T', 'T', 'T', '^', 'T', '~', '~', '~', 'T', 'T'},
                {'T', 'T', '^', '^', 'T', '~', '~', '~', 'T', 'T'},
                {'T', 'T', '^', 'T', 'T', '~', '~', '~', 'T', 'T'},
                {'T', '^', '^', 'T', 'T', 'T', 'T', 'T', 'T', 'T'},
                {'T', '^', 'T', 'T', '^', 'T', 'T', 'T', 'T', 'T'},
                {'^', '^', 'T', 'T', 'T', 'T', '^', 'T', 'T', 'T'},
                {'T', 'T', 'T', 'T', 'T', '^', '^', 'T', 'T', 'T'},
                {'~', '~', '~', '^', '^', '^', '^', 'T', 'T', 'T'},
                {'~', '~', '~', '^', '^', '^', '^', 'T', 'T', 'T'},
                {'~', '~', '~', '~', '^', '^', '^', 'T', 'T', 'T'},
        };
        map = new Map(charGrid);
        playerField.setText(map.mapToString());
//        try {
//            playerField.setText(Pokemon.artToMap(Charmander.ART,
//                 "                                                 "));
//        } catch (IOException IOEx) {
//            System.out.println("File not found");
//        }
    }
}