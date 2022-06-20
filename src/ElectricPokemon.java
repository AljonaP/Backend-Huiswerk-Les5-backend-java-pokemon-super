import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final static String TYPE = "electric";

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    List<String> getAttacks() {
        return attacks;
    }


    public void thunderPunch(Pokemon name, Pokemon enemy){
            System.out.println(name.getName() + "attacks" + enemy.getName() + " with Thunder Punch");
            int temp = 0;
            switch(enemy.getType()){
                case "water":
                    temp = enemy.getHp() - 40;
                    enemy.setHp(temp);
                    System.out.println(enemy.getName() + " looses 40 HP");
                case "grass" :
                    temp = enemy.getHp() - 30;
                    enemy.setHp(temp);
                    System.out.println(enemy.getName() + " looses 30 HP");
                case "fire" :
                    temp = enemy.getHp() - 20;
                    enemy.setHp(temp);
                    System.out.println(enemy.getName() + " looses 20 HP");
                case "electric" :
                    temp = enemy.getHp() - 10;
                    enemy.setHp(temp);
                    System.out.println(enemy.getName() + " looses 10 HP");
            }
            System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
        }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Electro Ball");
        int temp = 0;
        int damagePointsToWaterPokemon = 35;
        int damagePointsToGrassPokemon = 28;
        int damagePointsToFirePokemon = 20;
        int damagePointsToElectricPokemon = 15;

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

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Thunder");
        int temp = 0;
        int damagePointsToWaterPokemon = 35;
        int damagePointsToGrassPokemon = 28;
        int damagePointsToFirePokemon = 15;
        int damagePointsToElectricPokemon = 10;
        int boostHPtoElectricPokemon = 5;

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
                temp = (enemy.getHp() - damagePointsToElectricPokemon) + boostHPtoElectricPokemon;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses " + damagePointsToElectricPokemon + " HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Volt Tackle");
        int temp = 0;
        int damagePointsToWaterPokemon = 28;
        int damagePointsToGrassPokemon = 25;
        int damagePointsToFirePokemon = 16;
        int damagePointsToElectricPokemon = 7;

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

}
