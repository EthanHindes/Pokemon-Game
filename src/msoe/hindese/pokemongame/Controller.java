/*
 * Course: CS2852 - 071
 * Spring 2018-2019
 * Lab TODO
 * Name: Ethan Hindes
 * Created: TODO
 */

package msoe.hindese.pokemongame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * TODO
 * @author Ethan Hindes
 * @version TODO
 */
public class Controller implements Initializable {

    Map map;

    @FXML
    TextArea playerField;

    /**
     * TODO
     * @param key that was pressed
     */
    @FXML
    private void changeMap(KeyEvent key) {
        playerField.setText(map.updateMap(key.getCharacter().toLowerCase().charAt(0)));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        char[][] charGrid = {
                {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
                {'1', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'2', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'3', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'4', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'5', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'6', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'7', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'8', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'9', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
        };
        map = new Map(charGrid);
        playerField.setText(map.mapToString());
    }
}