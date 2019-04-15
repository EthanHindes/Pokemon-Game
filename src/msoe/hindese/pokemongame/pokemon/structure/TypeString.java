/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.pokemon.structure;

/**
 * This class simply ensures no typos in the elemental types
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public enum TypeString {

    /**
     * Water type
     */
    WATER("Water"),

    /**
     * Fire type
     */
    FIRE("Fire"),

    /**
     * Electric type
     */
    ELECTRIC("Electric"),

    /**
     * Ground type
     */
    GROUND("Ground"),

    /**
     * Plant type
     */
    GRASS("Grass"),

    /**
     * Normal type
     */
    NORMAL("Normal");

    String type;

    /**
     * This method assigns a string to the type
     *
     * @param type string representing the type
     */
    TypeString(String type) {
        this.type = type;
    }

}
