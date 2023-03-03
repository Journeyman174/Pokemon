public abstract class Pokemon {
    private String nume;
    private int hp;
    private int attack;
    private int special_attack;
    private int defense;
    private int special_defense;
    private int blocat = 0;
    private int beton = 0;
    private Abilitati abilitate1;
    private Abilitati abilitate2;
    private String actiune;
    private int total;
    private int cooldown1 = 0;
    private int cooldown2 = 0;
    private int tip;    //tip=1 pt Neutrel, tip=2 pt NormalAtac=N/A, tip=3 pt Special_Atack=N/A
    private int hp_ini;

    public int getHp_ini() {
        return hp_ini;
    }

    public void setHp_ini(int hp_ini) {
        this.hp_ini = hp_ini;
    }

    public abstract void echipeaza();

    public int getTotal() {
        return total;
    }

    public int getCooldown1() {
        return cooldown1;
    }

    public void setCooldown1(int cd) {
        this.cooldown1 = cd;
    }

    public int getCooldown2() {
        return cooldown2;
    }

    public void setCooldown2(int cd) {
        this.cooldown2 = cd;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getActiune() {
        return actiune;
    }

    public void setActiune(String actiune) {
        this.actiune = actiune;
    }

    public int getBeton() {
        return beton;
    }

    public void setBeton(int beton) {
        this.beton = beton;
    }

    public void setBlocat(int blocat) {
        this.blocat = blocat;
    }

    public int getBlocat() {
        return blocat;
    }


    public String getNume() {
        return nume;
    }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpecial_attack() {
        return special_attack;
    }

    public void setSpecial_attack(int special_attack) {
        this.special_attack = special_attack;
    }


    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecial_defense() {
        return special_defense;
    }

    public void setSpecial_defense(int special_defense) {
        this.special_defense = special_defense;
    }

    public Abilitati getAbilitate1() {
        return abilitate1;
    }

    public void setAbilitate1(Abilitati abilitate1) {
        this.abilitate1 = abilitate1;
    }

    public Abilitati getAbilitate2() {
        return abilitate2;
    }

    public void setAbilitate2(Abilitati abilitate2) {
        this.abilitate2 = abilitate2;
    }

    public void plusUnu() {
        this.hp++;
        this.attack++;
        this.special_attack++;
        this.defense++;
        this.special_defense++;

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nume='" + nume + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", special_attack=" + special_attack +
                ", defense=" + defense +
                ", special_defense=" + special_defense +
                ",abilitate 1 = " + abilitate1 +
                ",abilitate 2 = " + abilitate2 + " blocat =" + blocat + "CD1=" + cooldown1 + " CD2=" + cooldown2 +
                '}';
    }

    public boolean traieste() {
        return this.hp > 0;
    }
}