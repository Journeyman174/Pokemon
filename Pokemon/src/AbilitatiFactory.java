public class AbilitatiFactory {

    private static AbilitatiFactory AbilitatiFactoryUnica;

    private AbilitatiFactory() {
    }

    public static AbilitatiFactory instanta() {
        if (AbilitatiFactoryUnica == null) {
            AbilitatiFactoryUnica = new AbilitatiFactory();
        }
        return AbilitatiFactoryUnica;
    }

    public Abilitati creeazaAbilitati1(String pok) {
        return switch (pok) {
            case "Pikachu" -> new AbilitatiBuilder().withDmg(6).withStun("No").withDodge("No").withCd(4).buildAbilitati();
            case "Bulbasaur" -> new AbilitatiBuilder().withDmg(6).withStun("No").withDodge("No").withCd(4).buildAbilitati();
            case "Charmander" -> new AbilitatiBuilder().withDmg(4).withStun("Yes").withDodge("No").withCd(4).buildAbilitati();
            case "Squirtle" -> new AbilitatiBuilder().withDmg(4).withStun("No").withDodge("No").withCd(3).buildAbilitati();
            case "Snorlax" -> new AbilitatiBuilder().withDmg(4).withStun("Yes").withDodge("No").withCd(5).buildAbilitati();
            case "Vulpix" -> new AbilitatiBuilder().withDmg(8).withStun("Yes").withDodge("No").withCd(6).buildAbilitati();
            case "Eevee" -> new AbilitatiBuilder().withDmg(5).withStun("No").withDodge("No").withCd(3).buildAbilitati();
            case "Jigglypuff" -> new AbilitatiBuilder().withDmg(4).withStun("Yes").withDodge("No").withCd(4).buildAbilitati();
            case "Meowth" -> new AbilitatiBuilder().withDmg(5).withStun("No").withDodge("Yes").withCd(4).buildAbilitati();
            case "Psyduck" -> new AbilitatiBuilder().withDmg(2).withStun("No").withDodge("No").withCd(4).buildAbilitati();
            case "Neutrel1" -> new AbilitatiBuilder().withDmg(0).withStun("No").withDodge("No").withCd(0).buildAbilitati();
            case "Neutrel2" -> new AbilitatiBuilder().withDmg(0).withStun("No").withDodge("No").withCd(0).buildAbilitati();
            default -> new AbilitatiBuilder().withDmg(0).withStun("No").withDodge("No").withCd(0).buildAbilitati();
        };
    }

    public Abilitati creeazaAbilitati2(String pok) {
        return switch (pok) {
            case "Pikachu" -> new AbilitatiBuilder().withDmg(4).withStun("Yes").withDodge("Yes").withCd(5).buildAbilitati();
            case "Bulbasaur" -> new AbilitatiBuilder().withDmg(5).withStun("No").withDodge("No").withCd(3).buildAbilitati();
            case "Charmander" -> new AbilitatiBuilder().withDmg(7).withStun("No").withDodge("No").withCd(6).buildAbilitati();
            case "Squirtle" -> new AbilitatiBuilder().withDmg(2).withStun("Yes").withDodge("No").withCd(2).buildAbilitati();
            case "Snorlax" -> new AbilitatiBuilder().withDmg(0).withStun("No").withDodge("Yes").withCd(5).buildAbilitati();
            case "Vulpix" -> new AbilitatiBuilder().withDmg(2).withStun("No").withDodge("Yes").withCd(7).buildAbilitati();
            case "Eevee" -> new AbilitatiBuilder().withDmg(3).withStun("Yes").withDodge("No").withCd(4).buildAbilitati();
            case "Jigglypuff" -> new AbilitatiBuilder().withDmg(3).withStun("Yes").withDodge("No").withCd(4).buildAbilitati();
            case "Meowth" -> new AbilitatiBuilder().withDmg(1).withStun("No").withDodge("Yes").withCd(3).buildAbilitati();
            case "Psyduck" -> new AbilitatiBuilder().withDmg(2).withStun("Yes").withDodge("No").withCd(5).buildAbilitati();
            default -> new AbilitatiBuilder().withDmg(0).withStun("-").withDodge("-").withCd(0).buildAbilitati();
        };
    }

}
