public class Abilitati {
    private int dmg;
    private String stun;
    private String dodge;
    private int cd;

    public Abilitati() {
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getStun() {
        return stun;
    }

    public void setStun(String stun) {
        this.stun = stun;
    }

    public String getDodge() {
        return dodge;
    }

    public void setDodge(String dodge) {
        this.dodge = dodge;
    }

    public int getCd() {
        return cd;
    }

    public void setCd(int cd) {
        this.cd = cd;
    }

    public String toString() {
        return "Abilitate{" +
                "dmg= " + dmg +
                ", stun=" + stun +
                ", dodge=" + dodge +
                ", cd=" + cd +
                '}';
    }
}
