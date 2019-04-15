/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.pokemon.structure;

/**
 * This class is an attack a pokemon can execute
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public class Attack {

    private int dmg;

    private ElementalType type;

    /**
     * This method creates a new attack
     *
     * @param type the elemental type of the attack
     * @param dmg  the damage the attack does
     */
    public Attack(ElementalType type, int dmg) {
        this.type = type;
        this.dmg = dmg;
    }

    /**
     * This method executes the attack on a target pokemon
     *
     * @param toAttack pokemon to take the damage from the attack
     * @return if the pokemon attacked died
     */
    public boolean attack(Pokemon toAttack) {
        return toAttack.takeAttack(
                (int) Math.round(dmg * type.multiplier(toAttack.getType())
                ));
    }

}
