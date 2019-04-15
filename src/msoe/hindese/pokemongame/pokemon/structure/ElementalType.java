/*
 * Course: Side Project
 * Spring 2018-2019
 * Project - Pokemon Game
 * Name: Ethan Hindes
 * Created: 04.12.2019
 */

package msoe.hindese.pokemongame.pokemon.structure;

/**
 * This class represents the different elemental types in the game
 *
 * @author Ethan Hindes
 * @version 04.13.2019
 */
public enum ElementalType {

    /**
     * Water elemental type. Strong against fire, weak against plants
     */
    WATER(TypeString.WATER, TypeString.FIRE, TypeString.GRASS),

    /**
     * Fire elemental type. Strong against plants, weak against water
     */
    FIRE(TypeString.FIRE, TypeString.GRASS, TypeString.WATER),

    /**
     * Electric elemental type. Strong against water, weak against ground
     */
    ELECTRIC(TypeString.ELECTRIC, TypeString.WATER, TypeString.GROUND),

    /**
     * Ground elemental type. Strong against electric, weak against water
     */
    GROUND(TypeString.GROUND, TypeString.ELECTRIC, TypeString.WATER),

    /**
     * Plant elemental type. Strong against water, weak against fire
     */
    GRASS(TypeString.GRASS, TypeString.WATER, TypeString.FIRE),

    /**
     * Normal elemental type. No strength or weakness.
     */
    NORMAL(TypeString.NORMAL, null, null);

    /**
     * This multiplier is used for attacks against a pokemon of inferior elemental type
     */
    public static final double STRENGTH_MULTIPLIER = 1.5;

    /**
     * This multiplier is used for attacks against a pokemon of inferior elemental type
     */
    public static final double WEAKNESS_MULTIPLIER = 0.5;

    private TypeString weakness;
    private TypeString strength;
    private TypeString type;

    /**
     * This method creates a new elemental type
     *
     * @param type     type of this elemental type
     * @param strength elemental this type is strong against
     * @param weakness elemental this type is weak against
     */
    ElementalType(TypeString type, TypeString strength, TypeString weakness) {
        this.strength = strength;
        this.weakness = weakness;
        this.type = type;
    }

    /**
     * This method calculates the multiplier for a specific attack
     *
     * @param toAttack type attacking against
     * @return multiplier to multiply the damage by
     */
    public double multiplier(ElementalType toAttack) {
        if (strength == null || weakness == null) {
            return 1;
        } else if (this.strength.type.equalsIgnoreCase(toAttack.type.type)) {
            return STRENGTH_MULTIPLIER;
        } else if (this.weakness.type.equalsIgnoreCase(toAttack.type.type)) {
            return WEAKNESS_MULTIPLIER;
        } else {
            return 1;
        }
    }

}
