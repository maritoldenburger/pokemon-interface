import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";
    List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);

    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HydroPump!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 38 hp");
                enemy.setHp(enemy.getHp() - 38);
            case "fire":
                System.out.println(enemy.getName() + " loses 49 hp");
                enemy.setHp(enemy.getHp() - 49);
            case "grass":
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            case "water":
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() - 7);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with HydroCanon!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            case "fire":
                System.out.println(enemy.getName() + " loses 51 hp");
                enemy.setHp(enemy.getHp() - 51);
            case "grass":
                System.out.println(enemy.getName() + " loses 23 hp");
                enemy.setHp(enemy.getHp() - 23);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with RainDance!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println("has no effect on " + enemy.getName());
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " gains 20 hp");
                enemy.setHp(enemy.getHp() + 20);
            case "water":
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() - 6);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
