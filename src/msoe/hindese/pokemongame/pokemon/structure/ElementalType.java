package msoe.hindese.pokemongame.pokemon.Structure;

public enum Type {

    WATER (TypeString.WATER, TypeString.FIRE, TypeString.PLANT),
    FIRE (TypeString.FIRE, TypeString.PLANT, TypeString.WATER),
    ELECTRIC (TypeString.ELECTRIC, TypeString.WATER, TypeString.GROUND),
    GROUND (TypeString.GROUND, TypeString.ELECTRIC, TypeString.WATER),
    PLANT (TypeString.PLANT, TypeString.WATER, TypeString.FIRE);

    private TypeString weakness;
    private TypeString strength;
    private TypeString type;

    Type (TypeString type, TypeString strength, TypeString weakness) {
        this.strength = strength;
        this.weakness = weakness;
        this.type = type;
    }

    public double multiplier(Type toAttack) {
        if(this.strength.type.equalsIgnoreCase(toAttack.type.type)) {
            return 1.5;
        } else if (this.weakness.type.equalsIgnoreCase(toAttack.type.type)) {
            return 0.5;
        } else {
            return 1;
        }
    }

}
