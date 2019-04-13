package msoe.hindese.pokemongame.pokemon.Structure;

public class Attack {

    private int dmg;

    private Type type;

    public Attack (Type type, int dmg) {
        this.type = type;
        this.dmg = dmg;
    }

    public boolean attack(Pokemon toAttack) {
        return toAttack.takeAttack(
                (int) Math.round(dmg * type.multiplier(toAttack.getType())
                ));
    }

}
