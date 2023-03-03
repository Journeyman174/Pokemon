import java.util.ArrayList;

public class Antrenor {
    private String nume;
    private int varsta;
    private ArrayList<Pokemon> pokemoni;
    private String castigator;

    @Override
    public String toString() {
        return "Antrenor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", pokemoni=" + pokemoni +
                ", castigator='" + castigator + '\'' +
                '}';
    }

    public Antrenor(String nume, int varsta, ArrayList<Pokemon> pokemoni) {
        this.nume = nume;
        this.varsta = varsta;
        this.pokemoni = pokemoni;
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<Pokemon> getPokemoni() {
        return pokemoni;
    }

}