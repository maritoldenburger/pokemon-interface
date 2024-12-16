import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";
    List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);

    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 22 hp");
                enemy.setHp(enemy.getHp() - 22);
            case "fire":
                System.out.println(enemy.getName() + " loses 8 hp");
                enemy.setHp(enemy.getHp() - 8);
            case "grass":
                System.out.println(enemy.getName() + " loses 51 hp");
                enemy.setHp(enemy.getHp() - 51);
            case "water":
                System.out.println(enemy.getName() + " loses 38 hp");
                enemy.setHp(enemy.getHp() - 38);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with PyroBall!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 26 hp");
                enemy.setHp(enemy.getHp() - 26);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "grass":
                System.out.println(enemy.getName() + " loses 46 hp");
                enemy.setHp(enemy.getHp() - 46);
            case "water":
                System.out.println(enemy.getName() + " loses 32 hp");
                enemy.setHp(enemy.getHp() - 32);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FireLash!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 24 hp");
                enemy.setHp(enemy.getHp() - 24);
            case "fire":
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() - 11);
            case "grass":
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            case "water":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with FlameThrower!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            case "fire":
                System.out.println(enemy.getName() + " loses 6 hp");
                enemy.setHp(enemy.getHp() - 6);
            case "grass":
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            case "water":
                System.out.println(enemy.getName() + " loses 33 hp");
                enemy.setHp(enemy.getHp() - 33);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
