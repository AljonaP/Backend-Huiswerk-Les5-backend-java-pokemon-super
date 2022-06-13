import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final static String TYPE = "fire";


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    List<String> attacks = Arrays.asList("flameThrower", "pyroBall", "inferno", "fireLash");
    List<String> getAttacks() {
        return attacks;
    }


    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Flame Thrower");
        int temp = 0;
        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 30 HP");
            case "grass" :
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 40 HP");
            case "fire" :
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 10 HP");
            case "electric" :
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 20 HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Pyroball");
        int temp = 0;
        int damagePointsToWaterPokemon = 25;
        int damagePointsToGrassPokemon = 32;
        int damagePointsToFirePokemon = 12;
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

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Inferno");
        int temp = 0;
        int damagePointsToWaterPokemon = 15;
        int damagePointsToGrassPokemon = 18;
        int damagePointsToFirePokemon = 8;
        int damagePointsToElectricPokemon = 12;

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

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Firelash");
        int temp = 0;
        int damagePointsToWaterPokemon = 22;
        int damagePointsToGrassPokemon = 32;
        int damagePointsToFirePokemon = 12;
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


}
