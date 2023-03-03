class Neutrel1 extends Pokemon {
    public Neutrel1(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Neutrel2 extends Pokemon {

    public Neutrel2(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Pikachu extends Pokemon {

    public Pikachu(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Pikachu"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Pikachu"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Bulbasaur extends Pokemon {

    public Bulbasaur(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Bulbasaur"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Bulbasaur"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Charmander extends Pokemon {

    public Charmander(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Charmander"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Charmander"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Squirtle extends Pokemon {

    public Squirtle(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Squirtle"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Squirtle"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Snorlax extends Pokemon {

    public Snorlax(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Snorlax"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Snorlax"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }

}

class Vulpix extends Pokemon {

    public Vulpix(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Vulpix"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Vulpix"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Eevee extends Pokemon {

    public Eevee(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Eevee"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Eevee"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Jigglypuff extends Pokemon {

    public Jigglypuff(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Jigglypuff"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Jigglypuff"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Meowth extends Pokemon {

    public Meowth(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Meowth"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Meowth"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

class Psyduck extends Pokemon {

    public Psyduck(String nume, int hp, int attack, int special_attack, int defense, int special_defense, int tip) {
        this.setNume(nume);
        this.setHp(hp);
        this.setHp_ini(hp);
        this.setAttack(attack);
        this.setSpecial_attack(special_attack);
        this.setDefense(defense);
        this.setSpecial_defense(special_defense);
        this.setAbilitate1(AbilitatiFactory.instanta().creeazaAbilitati1("Psyduck"));
        this.setAbilitate2(AbilitatiFactory.instanta().creeazaAbilitati2("Psyduck"));
        this.setCooldown1(getAbilitate1().getCd());
        this.setCooldown2(getAbilitate2().getCd());
        this.setTip(tip);
    }

    public void echipeaza() {
    }
}

public class PokemonFactory {
    private static PokemonFactory fabricaPokemonUnica;

    private PokemonFactory() {
    }

    public static PokemonFactory instanta() {
        if (fabricaPokemonUnica == null) {
            fabricaPokemonUnica = new PokemonFactory();
        }
        return fabricaPokemonUnica;
    }


    public Pokemon creazaPokemon(String tip) {
        return switch (tip) {
            case "Neutrel1" -> new Neutrel1("Neutrel1", 10, 3, 0, 1, 1, 1);
            case "Neutrel2" -> new Neutrel2("Neutrel2", 20, 4, 0, 1, 1, 1);
            case "Pikachu" -> new Pikachu("Pikachu", 35, 0, 4, 2, 3, 2);
            case "Bulbasaur" -> new Bulbasaur("Bulbasaur", 42, 0, 5, 3, 1, 2);
            case "Charmander" -> new Charmander("Charmander", 50, 4, 0, 3, 2, 3);
            case "Squirtle" -> new Squirtle("Squirtle", 60, 0, 3, 5, 5, 2);
            case "Snorlax" -> new Snorlax("Snorlax", 62, 3, 0, 6, 4, 3);
            case "Vulpix" -> new Vulpix("Vulpix", 36, 5, 0, 2, 4, 3);
            case "Eevee" -> new Eevee("Eevee", 39, 0, 4, 3, 3, 2);
            case "Jigglypuff" -> new Jigglypuff("Jigglypuff", 34, 4, 0, 2, 3, 3);
            case "Meowth" -> new Meowth("Meowth", 41, 3, 0, 4, 2, 3);
            case "Psyduck" -> new Psyduck("Psyduck", 43, 3, 0, 3, 3, 3);
            default -> null;
        };
    }
}
