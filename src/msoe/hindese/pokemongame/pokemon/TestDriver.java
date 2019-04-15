/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.13.2019
 */

package msoe.hindese.pokemongame.pokemon;

import msoe.hindese.pokemongame.pokemon.pokemon.Charmander;
import msoe.hindese.pokemongame.pokemon.pokemon.Squirtle;
import msoe.hindese.pokemongame.pokemon.structure.Pokemon;

/**
 * This class is used to test the structure of pokemon objects
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class TestDriver {

    public static void main(String[] args) {

        final int oneHealth = 40;
        final int twoHealth = 20;

        Pokemon one = new Squirtle(oneHealth);
        Pokemon two = new Charmander(twoHealth);

        System.out.println(two.getHp());

        one.attackOne(two);

        System.out.println(two.getHp());
    }

}
