import java.util.ArrayList;

public class SubiectLupta {

    private static ArrayList<String> stare = new ArrayList<>();
    public static Observator observator;

    public ArrayList<String> Stare() {
        return stare;
    }


    public static void seteazaStare(ArrayList stare) {
        SubiectLupta.stare = stare;
        notificaObservator();
    }

    public void ataseazaObservator(Observator observator) {
        this.observator = observator;
    }

    public static void notificaObservator() {
        observator.actualizeaza();
    }
}

class Observator {
    static SubiectLupta subiect;

    public Observator(SubiectLupta subiect) {
        this.subiect = subiect;
        this.subiect.ataseazaObservator(this);
    }

    public static void actualizeaza() {
        for (String s : subiect.Stare()) {
            System.out.println(s);
        }
    }
}
