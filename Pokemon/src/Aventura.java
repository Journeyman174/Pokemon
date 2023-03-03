import java.util.Random;

public class Aventura {
    private String numeAventura;
    private Pokemon pok1;
    private Pokemon pok2;
    private String antrenor1;
    private String antrenor2;

    public String getAntrenor1() {
        return antrenor1;
    }

    public void setAntrenor1(String antrenor1) {
        this.antrenor1 = antrenor1;
    }

    public String getAntrenor2() {
        return antrenor2;
    }

    public void setAntrenor2(String antrenor2) {
        this.antrenor2 = antrenor2;
    }


    public String getNumeAventura() {
        return numeAventura;
    }

    public void setNumeAventura(String numeAventura) {
        this.numeAventura = numeAventura;
    }

    Random random = new Random();

    public Pokemon getPok1() {
        return pok1;
    }

    public void setPok1(Pokemon pok1) {
        this.pok1 = pok1;
    }

    public Pokemon getPok2() {
        return pok2;
    }

    public void setPok2(Pokemon pok2) {
        this.pok2 = pok2;
    }

    public synchronized String Batalie(String antrenor1, Pokemon pok1, String antrenor2, Pokemon pok2) {
        PokemonFactory pokemonfactory = PokemonFactory.instanta();
        Pokemon neutrel1 = pokemonfactory.creazaPokemon("Neutrel1");
        Pokemon neutrel2 = pokemonfactory.creazaPokemon("Neutrel2");

        while (pok1.traieste() && pok2.traieste()) {
            if (random.nextInt(2) == 1) {

                String linie = getNumeAventura() + " : - se lupta " + antrenor1 + " / " + pok1.getNume() + " contra Neutrel1";
                System.out.println(linie);
                Lupta lupta1 = new Lupta(antrenor1, pok1, "", neutrel1);
                lupta1.setAntrenor1(antrenor1);
                lupta1.setAntrenor2("");
                lupta1.atac(pok1, neutrel1);

                linie = "                " + getNumeAventura() + " : -se lupta " + antrenor2 + " / " + pok2.getNume() + " contra Neutrel2";
                System.out.println(linie);
                Lupta lupta2 = new Lupta(antrenor2, pok2, "", neutrel2);
                lupta2.setAntrenor1(antrenor2);
                lupta2.setAntrenor2("");
                lupta2.atac(pok2, neutrel2);

            } else {
                String linie = "                " + getNumeAventura() + " : - se lupta " + antrenor1 + " / " + pok1.getNume() + " contra Neutrel2";
                System.out.println(linie);
                Lupta lupta1 = new Lupta(antrenor1, pok1, "", neutrel2);
                lupta1.setAntrenor1(antrenor1);
                lupta1.setAntrenor2("");
                lupta1.atac(pok1, neutrel2);

                linie = "                " + getNumeAventura() + " : - se lupta " + antrenor2 + " / " + pok2.getNume() + " contra Neutrel1";
                System.out.println(linie);
                Lupta lupta2 = new Lupta(antrenor2, pok2, "", neutrel1);
                lupta2.setAntrenor1(antrenor2);
                lupta2.setAntrenor2("");
                lupta2.atac(pok2, neutrel1);
            }
            String linie = "                " + getNumeAventura() + " : - se lupta " + antrenor1 + " / " + pok1.getNume() + " contra " + antrenor2 + " / " + pok2.getNume();
            System.out.println(linie);

            Lupta lupta3 = new Lupta(antrenor1, pok1, antrenor2, pok2);
            lupta3.setAntrenor1(antrenor1);
            lupta3.setAntrenor2(antrenor2);

            lupta3.atac(pok1, pok2);
        }

        if (!pok1.traieste()) {
            pok2.setHp(pok2.getHp_ini());
            pok1.setHp(pok1.getHp_ini());
            pok2.plusUnu();
            pok2.setTotal(pok2.getHp() + pok2.getAttack() + pok2.getSpecial_attack() + pok2.getDefense() + pok2.getSpecial_defense());
            Aplicatie.ListaTrainer2.add(pok2);
            return antrenor1 + " / " + pok2.getNume();
        } else if (!pok2.traieste()) {
            pok2.setHp(pok2.getHp_ini());
            pok1.setHp(pok1.getHp_ini());
            pok1.plusUnu();
            pok1.setTotal(pok1.getHp() + pok1.getAttack() + pok1.getSpecial_attack() + pok1.getDefense() + pok1.getSpecial_defense());
            Aplicatie.ListaTrainer1.add(pok1);
            return antrenor1 + " / " + pok1.getNume();
        } else
            return "Draw";


    }

}
