public abstract class ObiectDecorator extends Pokemon {
    protected Pokemon pokemonDecorat;

    public ObiectDecorator(Pokemon pokemonDecorat) {
        this.pokemonDecorat = pokemonDecorat;
    }

    public int getHp_ini() {
        return pokemonDecorat.getHp_ini();
    }

    public void setHp_ini(int hp_ini) {
        pokemonDecorat.setHp_ini(hp_ini);
    }

    public String getNume() {
        return pokemonDecorat.getNume();
    }

    public int getHp() {
        return pokemonDecorat.getHp();
    }

    public int getAttack() {
        return pokemonDecorat.getAttack();
    }

    public int getSpecial_attack() {
        return pokemonDecorat.getSpecial_attack();
    }

    public int getDefense() {
        return pokemonDecorat.getDefense();
    }

    public int getSpecial_defense() {
        return pokemonDecorat.getSpecial_defense();
    }

    public void setAttack(int attack) {
        pokemonDecorat.setAttack(attack);
    }

    public void setDefense(int defense) {
        pokemonDecorat.setDefense(defense);
    }

    public void setNume(String nume) {
        pokemonDecorat.setNume(nume);
    }

    public void setHp(int hp) {
        pokemonDecorat.setHp(hp);
    }

    public void setSpecial_attack(int special_attack) {
        pokemonDecorat.setSpecial_attack(special_attack);
    }

    public void setSpecial_defense(int special_defense) {
        pokemonDecorat.setSpecial_defense(special_defense);
    }

    public Abilitati getAbilitate1() {
        return pokemonDecorat.getAbilitate1();
    }

    public void setAbilitate1(Abilitati abilitate1) {
        pokemonDecorat.setAbilitate1(abilitate1);
    }

    public Abilitati getAbilitate2() {
        return pokemonDecorat.getAbilitate2();
    }

    public void setAbilitate2(Abilitati abilitate2) {
        pokemonDecorat.setAbilitate2(abilitate2);
    }

    public boolean traieste() {
        return pokemonDecorat.getHp() > 0;
    }

    public int getTotal() {
        return pokemonDecorat.getTotal();
    }

    public void setTotal(int total) {
        pokemonDecorat.setTotal(total);
    }

    public int getTip() {
        return pokemonDecorat.getTip();
    }

    public void setTip(int tip) {
        pokemonDecorat.setTip(tip);
    }

    public String getActiune() {
        return pokemonDecorat.getActiune();
    }

    public void setActiune(String actiune) {
        pokemonDecorat.setActiune(actiune);
    }

    public int getBeton() {
        return pokemonDecorat.getBeton();
    }

    public void setBeton(int beton) {
        pokemonDecorat.setBeton(beton);
    }

    public void setBlocat(int blocat) {
        pokemonDecorat.setBlocat(blocat);
    }

    public int getBlocat() {
        return pokemonDecorat.getBlocat();
    }

    public void plusUnu() {
        pokemonDecorat.setHp(getHp() + 1);
        pokemonDecorat.setAttack(getAttack() + 1);
        pokemonDecorat.setSpecial_attack(getSpecial_attack() + 1);
        pokemonDecorat.setDefense(getDefense() + 1);
        pokemonDecorat.setDefense(getDefense() + 1);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nume='" + pokemonDecorat.getNume() + '\'' +
                ", hp=" + pokemonDecorat.getHp() +
                ", attack=" + pokemonDecorat.getAttack() +
                ", special_attack=" + pokemonDecorat.getSpecial_attack() +
                ", defense=" + pokemonDecorat.getDefense() +
                ", special_defense=" + pokemonDecorat.getSpecial_defense() +
                ",abilitate 1 = " + pokemonDecorat.getAbilitate1() +
                ",abilitate 2 = " + pokemonDecorat.getAbilitate2() + " blocat =" + pokemonDecorat.getBlocat() + "tip =" + pokemonDecorat.getTip() +
                "CD1=" + pokemonDecorat.getCooldown1() + " CD2=" + pokemonDecorat.getCooldown2() +
                '}';
    }


}

class Scut extends ObiectDecorator {

    public Scut(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setDefense(pokemonDecorat.getDefense() + 2);
        pokemonDecorat.setSpecial_defense(pokemonDecorat.getSpecial_defense() + 2);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }

}

class Vesta extends ObiectDecorator {
    public Vesta(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setHp(pokemonDecorat.getHp() + 10);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

class Sabiuta extends ObiectDecorator {

    public Sabiuta(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setAttack(pokemonDecorat.getAttack() + 3);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

class Bagheta extends ObiectDecorator {

    public Bagheta(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setSpecial_attack(pokemonDecorat.getSpecial_attack() + 3);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

class Vitamine extends ObiectDecorator {

    public Vitamine(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setHp(pokemonDecorat.getHp() + 10);
        pokemonDecorat.setAttack(pokemonDecorat.getAttack() + 3);
        pokemonDecorat.setSpecial_attack(pokemonDecorat.getSpecial_attack() + 3);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

class Brad extends ObiectDecorator {
    public Brad(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setAttack(pokemonDecorat.getAttack() + 3);
        pokemonDecorat.setDefense(pokemonDecorat.getDefense() + 1);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

class Pelerina extends ObiectDecorator {
    public Pelerina(Pokemon pokemonDecorat) {
        super(pokemonDecorat);
    }

    private void decorare(Pokemon pokemonDecorat) {
        pokemonDecorat.setSpecial_defense(pokemonDecorat.getSpecial_defense() + 3);
    }

    public void echipeaza() {
        decorare(pokemonDecorat);
    }
}

