import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";
    List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeafStorm!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 38 hp");
                enemy.setHp(enemy.getHp() - 38);
            case "grass":
                System.out.println(enemy.getName() + " loses 9 hp");
                enemy.setHp(enemy.getHp() - 9);
            case "water":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with SolarBeam!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 43 hp");
                enemy.setHp(enemy.getHp() - 43);
            case "fire":
                System.out.println(enemy.getName() + " loses 32 hp");
                enemy.setHp(enemy.getHp() - 32);
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "water":
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with SolarBeam!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 45 hp");
                System.out.println(name.getName() + " gains 45 hp");
                enemy.setHp(enemy.getHp() - 45);
                name.setHp(name.getHp() + 45);
            case "fire":
                System.out.println(enemy.getName() + " loses 35 hp");
                System.out.println(name.getName() + " gains 35 hp");
                enemy.setHp(enemy.getHp() - 35);
                name.setHp(name.getHp() + 35);
            case "grass":
                System.out.println(enemy.getName() + " loses 8 hp");
                System.out.println(name.getName() + " gains 8 hp");
                enemy.setHp(enemy.getHp() - 8);
                name.setHp(name.getHp() + 8);
            case "water":
                System.out.println(enemy.getName() + " loses 24 hp");
                System.out.println(name.getName() + " gains 24 hp");
                enemy.setHp(enemy.getHp() - 24);
                name.setHp(name.getHp() + 24);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with LeavesBlade!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 47 hp");
                enemy.setHp(enemy.getHp() - 47);
            case "fire":
                System.out.println(enemy.getName() + " loses 33 hp");
                enemy.setHp(enemy.getHp() - 33);
            case "grass":
                System.out.println(enemy.getName() + " loses 12 hp");
                enemy.setHp(enemy.getHp() - 12);
            case "water":
                System.out.println(enemy.getName() + " loses 28 hp");
                enemy.setHp(enemy.getHp() - 28);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }

    public List<String> getAttacks() {
        return attacks;
    }
}
