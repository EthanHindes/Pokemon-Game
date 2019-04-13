package msoe.hindese.pokemongame.pokemon.Structure;

public abstract class Pokemon {
    private int hp;
    private Type type;
    private String name;
    private boolean isDead;

    public Pokemon(int hp, Type type, String name) {
        this.hp = hp;
        this.name = name;
        this.type = type;
        this.isDead = false;
    }

    public abstract void attackOne(Pokemon toAttack);

    public abstract void attackTwo(Pokemon toAttack);

    public boolean takeAttack(int dmg) {
        hp -= dmg;
        return hp <= 0;
    }

    public Type getType() {
        return type;
    }
}
