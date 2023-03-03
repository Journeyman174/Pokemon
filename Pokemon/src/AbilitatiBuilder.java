public class AbilitatiBuilder {
    private Abilitati abilitati;

    public AbilitatiBuilder() {
        this.abilitati = new Abilitati();
    }

    public AbilitatiBuilder withDmg(int dmg) {

        abilitati.setDmg(dmg);
        return this;
    }

    public AbilitatiBuilder withStun(String stun) {

        abilitati.setStun(stun);
        return this;
    }

    public AbilitatiBuilder withDodge(String dodge) {

        abilitati.setDodge(dodge);
        return this;
    }

    public AbilitatiBuilder withCd(int cd) {

        abilitati.setCd(cd);
        return this;
    }

    public Abilitati buildAbilitati() {
        return this.abilitati;

    }
}
