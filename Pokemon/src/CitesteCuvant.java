public class CitesteCuvant implements Citeste {
    String[] cuvinte;


    public CitesteCuvant(String text) {
        this.cuvinte = text.split(" ");
    }

    @Override
    public String[] parcurge() {
        return this.cuvinte;
    }
}
