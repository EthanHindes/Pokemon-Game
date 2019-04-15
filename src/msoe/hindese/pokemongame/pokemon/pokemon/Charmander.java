/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.13.2019
 */

package msoe.hindese.pokemongame.pokemon.pokemon;

import msoe.hindese.pokemongame.pokemon.structure.Attack;
import msoe.hindese.pokemongame.pokemon.structure.ElementalType;
import msoe.hindese.pokemongame.pokemon.structure.Pokemon;

import java.io.File;
import java.nio.file.Path;

/**
 * This class implements a pokemon with Charmander's attacks
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Charmander extends Pokemon {

    /**
     * The damage ember does
     */
    public static final int EMBER_DAMAGE = 40;

    /**
     * The damage ember scratch
     */
    public static final int SLASH_DAMAGE = 40;

    /**
     * This links the Charmander ASCI art to the pokemon
     */
    public static final File ART = new File(
            Path.of("src", "msoe", "hindese", "pokemongame",
                    "pokemon", "AsciArt", "Charmander.txt").toString());

    private Attack slash = new Attack(ElementalType.NORMAL, SLASH_DAMAGE);
    private Attack ember = new Attack(ElementalType.FIRE, EMBER_DAMAGE);

    /**
     * This method creates a new Pikachu pokemon
     *
     * @param hp starting health points
     */
    public Charmander(int hp) {
        super(hp, ElementalType.FIRE, "Charmander");
    }

    /**
     * This method is the first of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackOne(Pokemon toAttack) {
        System.out.println("Charmander used Slash!\n    Dealt " + SLASH_DAMAGE + " damage!");
        slash.attack(toAttack);
    }

    /**
     * This method is the second of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackTwo(Pokemon toAttack) {
        System.out.println("Charmander used Ember!\n    Dealt " + EMBER_DAMAGE + " damage!");
        ember.attack(toAttack);
    }
}
