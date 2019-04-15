/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.gui;

/**
 * This class controls the map in the gui
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Map {

    /**
     * Starting position x
     */
    public static final int START_X = 4;

    /**
     * Starting position y
     */
    public static final int START_Y = 4;

    private char[][] map;
    private int x = START_X;
    private int y = START_Y;
    private int width;
    private int height;
    private char charAt;

    /**
     * This method initializes the map and sets the character position to (0, 0)
     *
     * @param map 2D array of characters representing the map
     */
    public Map(char[][] map) {
        this.map = map;
        this.width = map.length;
        this.height = map[0].length;
        this.charAt = map[START_Y][START_X];
        map[START_Y][START_X] = '@';
    }

    /**
     * This method updates the map string
     *
     * @param movement W, A, S, or D
     * @return the updated map in string format
     */
    public String updateMap(char movement) {
        map[y][x] = charAt;
        updatePosition(movement);
        charAt = map[y][x];
        map[y][x] = '@';
        return mapToString();
    }

    /**
     * This method updates the character position
     *
     * @param movement W, A, S, or D
     */
    private void updatePosition(char movement) {
        switch (movement) {
            case 'w':
                if (y - 1 >= 0) {
                    y--;
                }
                break;
            case 's':
                if (y + 1 < this.height) {
                    y++;
                }
                break;
            case 'a':
                if (x - 1 >= 0) {
                    x--;
                }
                break;
            case 'd':
                if (x + 1 < this.width) {
                    x++;
                }
                break;
        }
    }

    /**
     * Converts the array of characters to a string
     *
     * @return a string representing the map
     */
    public String mapToString() {
        String mapString = "\n";
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                mapString += "        " +
                        Character.toString(this.map[y][x]);
            }
            mapString += "        \n\n";
        }
        return mapString +
                "\n        ~ - Water\n" +
                "        T - Trees\n        ^ - Grass\n";
    }
}
