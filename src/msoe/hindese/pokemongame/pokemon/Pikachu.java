package msoe.hindese.pokemongame.pokemon;

import msoe.hindese.pokemongame.pokemon.Structure.Attack;
import msoe.hindese.pokemongame.pokemon.Structure.Pokemon;
import msoe.hindese.pokemongame.pokemon.Structure.Type;

public class Pikachu extends Pokemon {

    private Attack shock = new Attack(Type.ELECTRIC, 15);
    private Attack thunderBolt = new Attack(Type.ELECTRIC, 20);

    public Pikachu (int hp, Type type, String name) {
        super(hp, type, name);
    }

    @Override
    public void attackOne(Pokemon toAttack) {
        shock.attack(toAttack);
    }

    @Override
    public void attackTwo(Pokemon toAttack) {
        thunderBolt.attack(toAttack);
    }
}
