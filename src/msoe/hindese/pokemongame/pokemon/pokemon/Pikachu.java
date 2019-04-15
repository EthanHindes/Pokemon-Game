/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.pokemon.pokemon;

import msoe.hindese.pokemongame.pokemon.structure.Attack;
import msoe.hindese.pokemongame.pokemon.structure.ElementalType;
import msoe.hindese.pokemongame.pokemon.structure.Pokemon;

import java.io.File;
import java.nio.file.Path;

/**
 * This class implements a pokemon with Pikachu's attacks
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Pikachu extends Pokemon {

    /**
     * This constant is the damage done by the shock attack
     */
    public static final int SHOCK_DAMAGE = 15;

    /**
     * This constant is the damage done by the Thunderbolt attack
     */
    public static final int THUNDERBOLT_DAMAGE = 20;
    private static final File ART = new File(Path.of("src", "msoe",
            "hindese", "pokemongame", "pokemon", "AsciArt", "Pikachu.txt").toString());
    private Attack shock = new Attack(ElementalType.ELECTRIC, SHOCK_DAMAGE);
    private Attack thunderbolt = new Attack(ElementalType.ELECTRIC, THUNDERBOLT_DAMAGE);

    /**
     * This method creates a new Pikachu pokemon
     *
     * @param hp starting health points
     */
    public Pikachu(int hp) {
        super(hp, ElementalType.ELECTRIC, "Pikachu");
    }

    /**
     * This method is the first of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackOne(Pokemon toAttack) {
        System.out.println("Pikachu used Shock!\n    Dealt " + SHOCK_DAMAGE + " damage!");
        shock.attack(toAttack);
    }

    /**
     * This method is the second of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackTwo(Pokemon toAttack) {
        System.out.println("Pikachu used Thunderbolt!" +
                "\n    Dealt " + THUNDERBOLT_DAMAGE + " damage!");
        thunderbolt.attack(toAttack);
    }
}
