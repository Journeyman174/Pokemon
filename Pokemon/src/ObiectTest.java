import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ObiectTest {

    public static Arena CitesteTest(String testFile) {

        PokemonFactory pokemonfactory = PokemonFactory.instanta();
        AbilitatiFactory abilitatiFactory = AbilitatiFactory.instanta();

        Antrenor antrenor1;
        Antrenor antrenor2;
        Arena arena = null;
        try (BufferedReader br = new BufferedReader(new FileReader("txt\\" + testFile))) {
            String line1, line2;

            line1 = br.readLine();
            String[] aux;
            CitesteCuvant cuv;
            cuv = new CitesteCuvant(line1);
            aux = cuv.parcurge();
            String numeAntrenor1 = aux[0];
            int varstaAntrenor1 = Integer.parseInt(aux[1]);
            String numePok1 = aux[2];
            Pokemon pok1 = pokemonfactory.creazaPokemon(numePok1);
            Abilitati ab1 = abilitatiFactory.creeazaAbilitati1(numePok1);
            pok1.setAbilitate1(ab1);
            Abilitati ab2 = abilitatiFactory.creeazaAbilitati2(numePok1);
            pok1.setAbilitate2(ab2);
            ArrayList<Pokemon> ListaPokemoni1 = new ArrayList<>();

            if (Integer.parseInt(aux[3]) == 1) {
                pok1 = new Scut(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[4]) == 1) {
                pok1 = new Vesta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[5]) == 1) {
                pok1 = new Sabiuta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[6]) == 1) {
                pok1 = new Bagheta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[7]) == 1) {
                pok1 = new Vitamine(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[8]) == 1) {
                pok1 = new Brad(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[9]) == 1) {
                pok1 = new Pelerina(pok1);
                pok1.echipeaza();
            }
            ListaPokemoni1.add(pok1);
            String numePok2 = aux[10];

            Pokemon pok2 = pokemonfactory.creazaPokemon(numePok2);
            ab1 = abilitatiFactory.creeazaAbilitati1(numePok2);
            pok2.setAbilitate1(ab1);
            ab2 = abilitatiFactory.creeazaAbilitati2(numePok2);
            pok2.setAbilitate2(ab2);

            if (Integer.parseInt(aux[11]) == 1) {
                pok2 = new Scut(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[12]) == 1) {
                pok2 = new Vesta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[13]) == 1) {
                pok2 = new Sabiuta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[14]) == 1) {
                pok2 = new Bagheta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[15]) == 1) {
                pok2 = new Vitamine(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[16]) == 1) {
                pok2 = new Brad(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[17]) == 1) {
                pok2 = new Pelerina(pok2);
                pok2.echipeaza();
            }
            ListaPokemoni1.add(pok2);
            String numePok3 = aux[18];
            Pokemon pok3 = pokemonfactory.creazaPokemon(numePok3);
            ab1 = abilitatiFactory.creeazaAbilitati1(numePok3);
            pok3.setAbilitate1(ab1);
            ab2 = abilitatiFactory.creeazaAbilitati2(numePok3);
            pok3.setAbilitate2(ab2);

            if (Integer.parseInt(aux[19]) == 1) {
                pok3 = new Scut(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[20]) == 1) {
                pok3 = new Vesta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[21]) == 1) {
                pok3 = new Sabiuta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[22]) == 1) {
                pok3 = new Bagheta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[23]) == 1) {
                pok3 = new Vitamine(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[24]) == 1) {
                pok3 = new Brad(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[25]) == 1) {
                pok3 = new Pelerina(pok3);
                pok3.echipeaza();
            }
            ListaPokemoni1.add(pok3);
            antrenor1 = new Antrenor(numeAntrenor1, varstaAntrenor1, ListaPokemoni1);

            line2 = br.readLine();

            cuv = new CitesteCuvant(line2);
            aux = cuv.parcurge();
            String numeAntrenor2 = aux[0];
            int varstaAntrenor2 = Integer.parseInt(aux[1]);
            numePok1 = aux[2];
            pok1 = pokemonfactory.creazaPokemon(numePok1);

            ab1 = abilitatiFactory.creeazaAbilitati1(numePok1);
            pok1.setAbilitate1(ab1);
            ab2 = abilitatiFactory.creeazaAbilitati2(numePok1);
            pok1.setAbilitate2(ab2);

            ArrayList<Pokemon> ListaPokemoni2 = new ArrayList<>();

            if (Integer.parseInt(aux[3]) == 1) {
                pok1 = new Scut(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[4]) == 1) {
                pok1 = new Vesta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[5]) == 1) {
                pok1 = new Sabiuta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[6]) == 1) {
                pok1 = new Bagheta(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[7]) == 1) {
                pok1 = new Vitamine(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[8]) == 1) {
                pok1 = new Brad(pok1);
                pok1.echipeaza();
            }
            if (Integer.parseInt(aux[9]) == 1) {
                pok1 = new Pelerina(pok1);
                pok1.echipeaza();
            }
            ListaPokemoni2.add(pok1);

            numePok2 = aux[10];
            pok2 = pokemonfactory.creazaPokemon(numePok2);

            ab1 = abilitatiFactory.creeazaAbilitati1(numePok2);
            pok2.setAbilitate1(ab1);
            ab2 = abilitatiFactory.creeazaAbilitati2(numePok2);
            pok2.setAbilitate2(ab2);

            if (Integer.parseInt(aux[11]) == 1) {
                pok2 = new Scut(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[12]) == 1) {
                pok2 = new Vesta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[13]) == 1) {
                pok2 = new Sabiuta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[14]) == 1) {
                pok2 = new Bagheta(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[15]) == 1) {
                pok2 = new Vitamine(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[16]) == 1) {
                pok2 = new Brad(pok2);
                pok2.echipeaza();
            }
            if (Integer.parseInt(aux[17]) == 1) {
                pok2 = new Pelerina(pok2);
                pok2.echipeaza();
            }

            ListaPokemoni2.add(pok2);

            numePok3 = aux[18];
            pok3 = pokemonfactory.creazaPokemon(numePok3);

            ab1 = abilitatiFactory.creeazaAbilitati1(numePok3);
            pok3.setAbilitate1(ab1);
            ab2 = abilitatiFactory.creeazaAbilitati2(numePok3);
            pok3.setAbilitate2(ab2);

            if (Integer.parseInt(aux[19]) == 1) {
                pok3 = new Scut(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[20]) == 1) {
                pok3 = new Vesta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[21]) == 1) {
                pok3 = new Sabiuta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[22]) == 1) {
                pok3 = new Bagheta(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[23]) == 1) {
                pok3 = new Vitamine(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[24]) == 1) {
                pok3 = new Brad(pok3);
                pok3.echipeaza();
            }
            if (Integer.parseInt(aux[25]) == 1) {
                pok3 = new Pelerina(pok3);
                pok3.echipeaza();
            }

            ListaPokemoni2.add(pok3);

            antrenor2 = new Antrenor(numeAntrenor2, varstaAntrenor2, ListaPokemoni2);

            arena = new Arena(antrenor1, antrenor2);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.print(e.getMessage());
        }
        return arena;

    }
}



