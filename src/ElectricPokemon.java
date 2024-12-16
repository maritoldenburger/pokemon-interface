import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";
    List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with ThunderPunch!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            case "fire":
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with ElectroBall!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 7 hp");
                enemy.setHp(enemy.getHp() - 7);
            case "fire":
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            case "grass":
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            case "water":
                System.out.println(enemy.getName() + " loses 48 hp");
                enemy.setHp(enemy.getHp() - 48);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " gains 15 hp");
                System.out.println(name.getName() + " gains 15 hp");
                enemy.setHp(enemy.getHp() + 15);
                name.setHp(name.getHp() + 15);
            case "fire":
                System.out.println(enemy.getName() + " loses 19 hp");
                enemy.setHp(enemy.getHp() - 19);
            case "grass":
                System.out.println(enemy.getName() + " loses 27 hp");
                enemy.setHp(enemy.getHp() - 27);
            case "water":
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with VoltTackle!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 11 hp");
                enemy.setHp(enemy.getHp() - 11);
            case "fire":
                System.out.println(enemy.getName() + " loses 21 hp");
                enemy.setHp(enemy.getHp() - 21);
            case "grass":
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            case "water":
                System.out.println(enemy.getName() + " loses 42 hp");
                enemy.setHp(enemy.getHp() - 42);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
