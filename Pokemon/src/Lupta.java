import java.util.ArrayList;
import java.util.Random;

public class Lupta {
    //String[] actiune = {"attack", "special_attack", "abilitate1", "abilitate2"};
    String[] actiuni1 = {"special_attack", "abilitate1", "abilitate2"};
    String[] actiuni1_1 = {"special_attack", "abilitate1"};
    String[] actiuni1_2 = {"special_attack", "abilitate2"};
    String[] actiuni2 = {"attack", "abilitate1", "abilitate2"};
    String[] actiuni2_1 = {"attack", "abilitate1"};
    String[] actiuni2_2 = {"attack", "abilitate2"};

    private static Random random = new Random();
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private String actiune1;
    private String actiune2;
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

    private ArrayList<String> stare = new ArrayList<>();

    public Lupta(String antrenor1, Pokemon pokemon1, String antrenor2, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.actiune1 = actiune1;
        this.actiune2 = actiune2;
        this.antrenor1 = antrenor1;
        this.antrenor2 = antrenor2;
    }

    public void atac(Pokemon pok1, Pokemon pok2) {
        SubiectLupta subiect = new SubiectLupta();
        Observator observator = new Observator(subiect);
        int i = 0;
        while (pok1.traieste() && pok2.traieste()) {
//elimin din lista actiunile cu N/A pentru
            String act1 = "";
            String act2 = "";

            if ((pok1.getTip() == 2) && (pok1.getCooldown1() == 0) && (pok1.getCooldown2() == 0))
                act1 = actiuni1[random.nextInt(2)];
            if ((pok1.getTip() == 2) && (pok1.getCooldown1() != 0) && (pok1.getCooldown2() == 0))
                act1 = actiuni1_2[random.nextInt(2)];
            if ((pok1.getTip() == 2) && (pok1.getCooldown1() == 0) && (pok1.getCooldown2() != 0))
                act1 = actiuni1_1[random.nextInt(2)];
            if ((pok1.getTip() == 2) && (pok1.getCooldown1() != 0) && (pok1.getCooldown2() != 0)) act1 = actiuni1_1[0];

            if ((pok1.getTip() == 3) && (pok1.getCooldown1() == 0) && (pok1.getCooldown2() == 0))
                act1 = actiuni2[random.nextInt(2)];
            if ((pok1.getTip() == 3) && (pok1.getCooldown1() != 0) && (pok1.getCooldown2() == 0))
                act1 = actiuni2_2[random.nextInt(2)];
            if ((pok1.getTip() == 3) && (pok1.getCooldown1() == 0) && (pok1.getCooldown2() != 0))
                act1 = actiuni2_1[random.nextInt(2)];
            if ((pok1.getTip() == 3) && (pok1.getCooldown1() != 0) && (pok1.getCooldown2() != 0)) act1 = actiuni2_1[0];

            if ((pok2.getTip() == 2) && (pok2.getCooldown1() == 0) && (pok2.getCooldown2() == 0))
                act2 = actiuni1[random.nextInt(2)];
            if ((pok2.getTip() == 2) && (pok2.getCooldown1() != 0) && (pok2.getCooldown2() == 0))
                act2 = actiuni1_2[random.nextInt(2)];
            if ((pok2.getTip() == 2) && (pok2.getCooldown1() == 0) && (pok2.getCooldown2() != 0))
                act2 = actiuni1_1[random.nextInt(2)];
            if ((pok2.getTip() == 2) && (pok2.getCooldown1() != 0) && (pok2.getCooldown2() != 0)) act2 = actiuni1_1[0];

            if ((pok2.getTip() == 3) && (pok2.getCooldown1() == 0) && (pok2.getCooldown2() == 0))
                act2 = actiuni2[random.nextInt(2)];
            if ((pok2.getTip() == 3) && (pok2.getCooldown1() != 0) && (pok2.getCooldown2() == 0))
                act2 = actiuni2_2[random.nextInt(2)];
            if ((pok2.getTip() == 3) && (pok2.getCooldown1() == 0) && (pok2.getCooldown2() != 0))
                act2 = actiuni2_1[random.nextInt(2)];
            if ((pok2.getTip() == 3) && (pok2.getCooldown1() != 0) && (pok2.getCooldown2() != 0)) act2 = actiuni2_1[0];

            if (pok2.getTip() == 1) act2 = actiuni2[0];

            pok1.setActiune(act1);
            pok2.setActiune(act2);

            switch (act1) {
                case "attack" -> {
                    if (pok1.getCooldown1() != 0) pok1.setCooldown1(pok1.getCooldown1() - 1);
                    if (pok1.getCooldown2() != 0) pok1.setCooldown2(pok1.getCooldown2() - 1);
                    if (pok1.getBlocat() != 1) {
                        if (pok2.getBeton() != 1) {
                            pok2.setHp(pok2.getHp() - (pok1.getAttack() - pok2.getDefense()));
                        } else
                            pok1.setBeton(0);
                    } else
                        pok1.setBlocat(0);

                }
                case "special_attack" -> {
                    if (pok1.getCooldown1() != 0) pok1.setCooldown1(pok1.getCooldown1() - 1);
                    if (pok1.getCooldown2() != 0) pok1.setCooldown2(pok1.getCooldown2() - 1);
                    if (pok1.getBlocat() != 1) {
                        pok2.setHp(pok2.getHp() - (pok1.getSpecial_attack() - pok2.getSpecial_defense()));
                    } else
                        pok1.setBlocat(0);
                }
                case "abilitate1" -> {
                    if (pok1.getCooldown2() != 0) pok1.setCooldown2(pok1.getCooldown2() - 1);
                    if (pok2.getBeton() != 1)
                        pok2.setHp(pok2.getHp() - pok1.getAbilitate1().getDmg());
                    else
                        pok2.setBeton(0);
                    if (pok1.getAbilitate1().getStun().equals("Yes")) pok2.setBlocat(1);

                    if (pok1.getAbilitate1().getDodge().equals("Yes"))
                        pok1.setBeton(1);
                    //setez cooldown pentru ca a executate abilitate1
                    pok1.setCooldown1(pok1.getAbilitate1().getCd());

                }
                case "abilitate2" -> {
                    if (pok1.getCooldown1() != 0) pok1.setCooldown1(pok1.getCooldown1() - 1);
                    if (pok2.getBeton() != 1)
                        pok2.setHp(pok2.getHp() - pok1.getAbilitate2().getDmg());
                    else
                        pok2.setBeton(0);
                    if (pok1.getAbilitate2().getStun().equals("Yes"))
                        pok2.setBlocat(1);
                    if (pok1.getAbilitate2().getDodge().equals("Yes"))
                        pok1.setBeton(1);
                    //setez cooldown pentru ca a executate abilitate2
                    pok1.setCooldown2(pok1.getAbilitate2().getCd());


                }
            }

            switch (act2) {
                case "attack" -> {
                    if (pok2.getCooldown1() != 0) pok2.setCooldown1(pok2.getCooldown1() - 1);
                    if (pok2.getCooldown2() != 0) pok2.setCooldown2(pok2.getCooldown2() - 1);
                    if (pok2.getBlocat() != 1) {
                        if (pok2.getBeton() != 1) {
                            pok1.setHp(pok1.getHp() - (pok2.getAttack() - pok1.getDefense()));
                        } else
                            pok2.setBeton(0);
                    } else
                        pok2.setBlocat(0);
                }
                case "special_attack" -> {
                    if (pok2.getCooldown1() != 0) pok2.setCooldown1(pok2.getCooldown1() - 1);
                    if (pok2.getCooldown2() != 0) pok2.setCooldown2(pok2.getCooldown2() - 1);
                    if (pok2.getBlocat() != 1)
                        pok1.setHp(pok1.getHp() - (pok2.getSpecial_attack() - pok1.getSpecial_defense()));
                    else
                        pok2.setBlocat(0);
                }
                case "abilitate1" -> {
                    if (pok2.getCooldown2() != 0) pok2.setCooldown2(pok2.getCooldown2() - 1);
                    if (pok1.getBeton() != 1)
                        pok1.setHp(pok1.getHp() - pok2.getAbilitate1().getDmg());
                    else
                        pok1.setBeton(0);
                    if (pok2.getAbilitate1().getStun().equals("Yes"))
                        pok1.setBlocat(1);
                    if (pok2.getAbilitate1().getDodge().equals("Yes"))
                        pok2.setBeton(1);

                    pok2.setCooldown1(pok2.getAbilitate1().getCd());

                }
                case "abilitate2" -> {
                    if (pok2.getCooldown1() != 0) pok2.setCooldown1(pok2.getCooldown1() - 1);
                    if (pok1.getBeton() != 1)
                        pok1.setHp(pok1.getHp() - pok2.getAbilitate2().getDmg());
                    else
                        pok1.setBeton(0);
                    if (pok2.getAbilitate2().getStun().equals("Yes"))
                        pok1.setBlocat(1);
                    if (pok2.getAbilitate2().getDodge().equals("Yes"))
                        pok2.setBeton(1);
                    pok2.setCooldown2(pok2.getAbilitate2().getCd());

                }
            }
            String l1 = "";
            String l2 = "";
            if ((pok1.getCooldown1() != 0) || (pok1.getCooldown2() != 0))
                l1 = " Abilitate1 cooldown= " + pok1.getCooldown1() + ", Abilitate2 cooldown= " + pok1.getCooldown2();
            if ((pok2.getCooldown1() != 0) || (pok2.getCooldown2() != 0))
                l2 = " Abilitate1 cooldown= " + pok2.getCooldown1() + ", Abilitate2 cooldown= " + pok2.getCooldown2();
            String linie = "                        " + "Pokemon 1 :" + pok1.getNume() + " " + pok1.getActiune() + "  /Pokemon 2 : " + pok2.getNume() + " " + pok2.getActiune() +
                    "--> Rezultat\n" +
                    "                         a) " + pok1.getNume() + " are HP= " + pok1.getHp() + l1 + "\n                         b) " + pok2.getNume() + " are HP= " + pok2.getHp() + l2 + "\n";

            stare.add(i, linie);
            i++;
        }
        if (pok1.traieste()) {
            pok1.plusUnu();
            pok1.setCooldown1(0);
            pok1.setCooldown2(0);
            pok1.setBlocat(0);
            pok2.setBeton(0);

            String linie = "                        " + " Cistiga lupta Antrenor: " + getAntrenor1() + " / " + pok1.getNume();
            stare.add(i, linie);
            SubiectLupta.seteazaStare(stare);

        } else {
            String linie = "                        " + " Cistiga lupta Antrenor: " + getAntrenor2() + " / " + pok2.getNume();
            i = 0;
            stare.add(i, linie);
            SubiectLupta.seteazaStare(stare);
            pok2.plusUnu();
            pok2.setCooldown1(0);
            pok2.setCooldown2(0);
            pok2.setBlocat(0);
            pok2.setBeton(0);
        }

    }
}
