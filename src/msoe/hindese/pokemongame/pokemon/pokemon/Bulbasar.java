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
 * This class implements a pokemon with Charmander's attacks
 *
 * @author Ethan Hindes
 * @version 04.15.2019
 */
public class Bulbasar extends Pokemon {

    /**
     * The damage ember does
     */
    public static final int VINE_WHIP_DAMAGE = 45;

    /**
     * The damage ember scratch
     */
    public static final int TACKLE_DAMAGE = 40;

    /**
     * This links the Charmander ASCI art to the pokemon
     */
    public static final File ART = new File(
            Path.of("src", "msoe", "hindese", "pokemongame",
                    "pokemon", "AsciArt", "Charmander.txt").toString());

    private Attack vineWhip = new Attack(ElementalType.GRASS, VINE_WHIP_DAMAGE);
    private Attack tackle = new Attack(ElementalType.NORMAL, TACKLE_DAMAGE);

    /**
     * This method creates a new Pikachu pokemon
     *
     * @param hp starting health points
     */
    public Bulbasar(int hp) {
        super(hp, ElementalType.WATER, "Bulbasar");
    }

    /**
     * This method is the first of two attacks available to a pokemon
     *
     * @param toAttack the pokemon who is taking the attack
     */
    @Override
    public void attackOne(Pokemon toAttack) {
        vineWhip.attack(toAttack);
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
