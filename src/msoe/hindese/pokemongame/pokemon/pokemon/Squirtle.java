/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.14.2019
 */

package msoe.hindese.pokemongame.pokemon.pokemon;

import msoe.hindese.pokemongame.pokemon.structure.Attack;
import msoe.hindese.pokemongame.pokemon.structure.ElementalType;
import msoe.hindese.pokemongame.pokemon.structure.Pokemon;

import java.io.File;
import java.nio.file.Path;

/**
 * This class implements a pokemon with Squirtle's attacks
 *
 * @author Ethan Hindes
 * @version 04.14.2019
 */
public class Squirtle extends Pokemon {

    /**
     * This file contains the ascii art for Squirtle
     */
    public static final File ART = new File(
            Path.of("src", "msoe", "hindese", "pokemongame",
                    "pokemon", "AsciArt", "Squirtle.txt").toString());

    /**
     * Tackle's damage
     */
    public static final int TACKLE_DAMAGE = 40;

    /**
     * Water Gun's damage
     */
    public static final int WATER_GUN_DAMAGE = 40;

    private final Attack waterGun = new Attack(ElementalType.WATER, WATER_GUN_DAMAGE);
    private final Attack tackle = new Attack(ElementalType.NORMAL, TACKLE_DAMAGE);


    /**
     * This method creates a new Squirtle
     *
     * @param hp starting health
     */
    public Squirtle(int hp) {
        super(hp, ElementalType.WATER, "Squirtle");
    }

    /**
     * This method is the first of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackOne(Pokemon toAttack) {
        waterGun.attack(toAttack);
    }

    /**
     * This method is the second of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackTwo(Pokemon toAttack) {
        tackle.attack(toAttack);
    }
}
