public class Arena {

    private Antrenor antrenor1;
    private Antrenor antrenor2;


    public Antrenor getAntrenor1() {
        return antrenor1;
    }

    public void setAntrenor1(Antrenor antrenor1) {
        this.antrenor1 = antrenor1;
    }

    public Antrenor getAntrenor2() {
        return antrenor2;
    }

    public void setAntrenor2(Antrenor antrenor2) {
        this.antrenor2 = antrenor2;
    }

    public Arena(Antrenor antrenor1, Antrenor antrenor2) {
        this.antrenor1 = antrenor1;
        this.antrenor2 = antrenor2;
    }

    @Override
    public String toString() {
        return " antrenor1=" + antrenor1 +
                ", antrenor2=" + antrenor2 +
                '}';
    }


}
