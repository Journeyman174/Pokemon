import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Aplicatie {
    public static ArrayList<Pokemon> ListaTrainer1;
    public static ArrayList<Pokemon> ListaTrainer2;

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] Teste = {
                "test1.txt",
                "test2.txt",
                "test3.txt",
                "test4.txt",
                "test5.txt",
                "test6.txt",
                "test7.txt",
                "test8.txt",
                "test9.txt",
                "test10.txt"
        };

        for (int i = 0; i < 1; i++) {
            System.out.println("Afisare log la consola  sau fisier(scrie c daca doresti consola sau f daca doresti fisier) :");
            Scanner s = new Scanner(System.in);
            String iesire = s.next();
            if (Objects.equals(iesire, "c"))
                System.setOut(System.out);
            else if (Objects.equals(iesire, "f"))
                System.setOut(new PrintStream(new File("out\\out_" + i + ".txt")));

            ListaTrainer1 = new ArrayList<>();
            ListaTrainer2 = new ArrayList<>();

            Arena arena = ObiectTest.CitesteTest(Teste[i]);
            System.out.println("Incepe aventura Antrenor 1 =" + arena.getAntrenor1().getNume() + " contra Antrenor 2 =" + arena.getAntrenor2().getNume());

            Aventura aventura0 = new Aventura();
            aventura0.setPok1(arena.getAntrenor1().getPokemoni().get(0));
            aventura0.setPok2(arena.getAntrenor2().getPokemoni().get(0));
            aventura0.setNumeAventura("Aventura 1");
            aventura0.setAntrenor1(arena.getAntrenor1().getNume());
            aventura0.setAntrenor2(arena.getAntrenor2().getNume());

            Thread t0 = new FirExecutieBatalie(aventura0);

            Aventura aventura1 = new Aventura();
            aventura1.setPok1(arena.getAntrenor1().getPokemoni().get(1));
            aventura1.setPok2(arena.getAntrenor2().getPokemoni().get(1));
            aventura1.setNumeAventura("Aventura 2");
            aventura1.setAntrenor1(arena.getAntrenor1().getNume());
            aventura1.setAntrenor2(arena.getAntrenor2().getNume());

            Thread t1 = new FirExecutieBatalie(aventura1);


            Aventura aventura2 = new Aventura();
            aventura2.setPok1(arena.getAntrenor1().getPokemoni().get(2));
            aventura2.setPok2(arena.getAntrenor2().getPokemoni().get(2));
            aventura2.setNumeAventura("Aventura 3");
            aventura2.setAntrenor1(arena.getAntrenor1().getNume());
            aventura2.setAntrenor2(arena.getAntrenor2().getNume());

            Thread t2 = new FirExecutieBatalie(aventura2);


            ExecutorService executor = Executors.newFixedThreadPool(3);
            System.out.println("        " + "se lupta in Aventura  1:" + aventura0.getPok1().getNume() + " contra " + aventura0.getPok2().getNume());
            executor.execute(t0);
            System.out.println("        " + "se lupta in Aventura  2:" + aventura1.getPok1().getNume() + " contra " + aventura1.getPok2().getNume());
            executor.execute(t1);
            System.out.println("        " + "se lupta  in Aventura  3:" + aventura2.getPok1().getNume() + " contra " + aventura2.getPok2().getNume());
            executor.execute(t2);
            executor.shutdown();

            if (!executor.awaitTermination(20, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                if (!executor.awaitTermination(20, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");

            }


            ListaTrainer1.sort(Comparator.comparing(Pokemon::getTotal).reversed());
            for (Pokemon p : ListaTrainer1)
                System.out.println("Lista Trainer1 :" + p.getNume() + p.getHp() + " Total=" + p.getTotal());
            ListaTrainer2.sort(Comparator.comparing(Pokemon::getTotal).reversed());
            for (Pokemon p : ListaTrainer2)
                System.out.println("Lista Trainer2 :" + p.getNume() + p.getHp() + " Total=" + p.getTotal());

            Aventura aventura = new Aventura();
            aventura.setPok1(ListaTrainer1.get(0));
            aventura.setPok2(ListaTrainer2.get(0));
            aventura.setNumeAventura("Aventura FINALA");
            aventura.setAntrenor1(arena.getAntrenor1().getNume());
            aventura.setAntrenor2(arena.getAntrenor2().getNume());

            System.out.println("Incepe Sfarsitul Aventurii :" + arena.getAntrenor1().getNume() + " / " + ListaTrainer1.get(0).getNume() + " contra " +
                    arena.getAntrenor2().getNume() + " / " + ListaTrainer2.get(0).getNume());
            String rezultat = aventura.Batalie(aventura.getAntrenor1(), ListaTrainer1.get(0), aventura.getAntrenor2(), ListaTrainer2.get(0));
            System.out.println("Aventura FINALA s-a terminat :invingator >>>>>>>   " + rezultat);


        }
    }

    static class FirExecutieBatalie extends Thread {
        protected Aventura aventura;

        public FirExecutieBatalie(Aventura aventura) {
            this.aventura = aventura;
        }

        public void run() {

            String rezultat = aventura.Batalie(aventura.getAntrenor1(), aventura.getPok1(), aventura.getAntrenor2(), aventura.getPok2());
            System.out.println(aventura.getNumeAventura() + "  s-a terminat cu  rezultatul :" + rezultat);
        }
    }


}


