import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final static String TYPE = "water";

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE); //i.p.v. this.level e.z.v.
    }
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with surf");
        int temp = 0;
        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 10 HP");
            case "grass" :
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 20 HP");
            case "fire" :
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 40 HP");
            case "electric" :
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 30 HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Hydro Pump");
        int temp = 0;
        int damagePointsToWaterPokemon = 10;
        int damagePointsToGrassPokemon = 16;
        int damagePointsToFirePokemon = 25;
        int damagePointsToElectricPokemon = 20;

        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - damagePointsToWaterPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToWaterPokemon + " HP");
            case "grass" :
                temp = enemy.getHp() - damagePointsToGrassPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToGrassPokemon + " HP");
            case "fire" :
                temp = enemy.getHp() - damagePointsToFirePokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToFirePokemon + " HP");
            case "electric" :
                temp = enemy.getHp() - damagePointsToElectricPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToElectricPokemon + " HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Hydro Canon");
        int temp = 0;
        int damagePointsToWaterPokemon = 9;
        int damagePointsToGrassPokemon = 14;
        int damagePointsToFirePokemon = 25;
        int damagePointsToElectricPokemon = 20;

        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - damagePointsToWaterPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToWaterPokemon + " HP");
            case "grass" :
                temp = enemy.getHp() - damagePointsToGrassPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToGrassPokemon + " HP");
            case "fire" :
                temp = enemy.getHp() - damagePointsToFirePokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToFirePokemon + " HP");
            case "electric" :
                temp = enemy.getHp() - damagePointsToElectricPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToElectricPokemon + " HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Dancing in the Rain");
        int temp = 0;
        int damagePointsToWaterPokemon = 7;
        int damagePointsToGrassPokemon = 12;
        int damagePointsToFirePokemon = 26;
        int damagePointsToElectricPokemon = 18;
        int boostHPtoGrassPokemon = 5;

        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - damagePointsToWaterPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToWaterPokemon + " HP");
            case "grass" :
                temp = (enemy.getHp() - damagePointsToGrassPokemon) + boostHPtoGrassPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToGrassPokemon + " HP" + " and gets boost HP " + boostHPtoGrassPokemon);
            case "fire" :
                temp = enemy.getHp() - damagePointsToFirePokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToFirePokemon + " HP");
            case "electric" :
                temp = enemy.getHp() - damagePointsToElectricPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToElectricPokemon + " HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
        System.out.println("Has no effect on " + enemy.getName());
    }



}
