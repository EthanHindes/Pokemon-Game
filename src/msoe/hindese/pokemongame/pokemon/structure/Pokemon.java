/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.pokemon.structure;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class contains all basic functionality for a pokemon
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public abstract class Pokemon {
    private int hp;
    private ElementalType type;
    private String name;
    private boolean isDead;

    /**
     * This method creates a new pokemon
     *
     * @param hp   staring health points
     * @param type elemental type
     * @param name of pokemon
     */
    public Pokemon(int hp, ElementalType type, String name) {
        this.hp = hp;
        this.name = name;
        this.type = type;
        this.isDead = false;
    }

    /**
     * This method converts the asci art to a string that can be displayed in the gui
     *
     * @param art    the asci art file
     * @param offset to indent the pokemon by
     * @return the file read in as a string
     * @throws IOException thrown in the art file could not be located
     */
    public static String artToMap(File art, String offset) throws IOException {
        Scanner in = new Scanner(art);
        String pokemon = "";
        while (in.hasNextLine()) {
            pokemon += offset + in.nextLine() + "\n";
        }
        return pokemon;
    }

    /**
     * This method is the first of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    public abstract void attackOne(Pokemon toAttack);

    /**
     * This method is the second of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    public abstract void attackTwo(Pokemon toAttack);

    /**
     * This method deducts the hit points from the pokemon
     *
     * @param dmg hit points to deduct
     * @return if the pokemon died
     */
    public boolean takeAttack(int dmg) {
        hp -= dmg;
        return hp <= 0;
    }

    public ElementalType getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }
}
