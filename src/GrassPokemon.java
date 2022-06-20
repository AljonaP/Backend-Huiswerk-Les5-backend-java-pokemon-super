import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final static String TYPE = "grass";

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound, name, TYPE);
    }

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leaveBlade", "leechSeed");

    List<String> getAttacks() {
        return attacks;
    }


    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Leaf Storm");
        int temp = 0;
        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - 20;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 20 HP");
            case "grass" :
                temp = enemy.getHp() - 10;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 10 HP");
            case "fire" :
                temp = enemy.getHp() - 30;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 30 HP");
            case "electric" :
                temp = enemy.getHp() - 40;
                enemy.setHp(temp);
                System.out.println(enemy.getName() + " looses 40 HP");
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }
//
//    - Het type fire🔥 doet de meeste schade aan grass-pokémons🌿, daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.
//            - Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥, dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.
//            - Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿, dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.
//            - Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡, dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.



    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Solar Beam");
        int temp = 0;
        int damagePointsToWaterPokemon = 14;
        int damagePointsToGrassPokemon = 11;
        int damagePointsToFirePokemon = 20;
        int damagePointsToElectricPokemon = 25;

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

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Leave Blade");
        int temp = 0;
        int damagePointsToWaterPokemon = 12;
        int damagePointsToGrassPokemon = 10;
        int damagePointsToFirePokemon = 17;
        int damagePointsToElectricPokemon = 23;

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

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "attacks" + enemy.getName() + " with Leech Seed");
        int temp = 0;
        int temp2 = 0;

        int damagePointsToWaterPokemon = 18;
        int damagePointsToGrassPokemon = 14;
        int damagePointsToFirePokemon = 25;
        int damagePointsToElectricPokemon = 35;

        switch(enemy.getType()){
            case "water":
                temp = enemy.getHp() - damagePointsToWaterPokemon;
                enemy.setHp(temp);
                temp2 = name.getHp() + damagePointsToWaterPokemon;
                System.out.println(enemy.getName() + " looses " + damagePointsToWaterPokemon + " HP");
                System.out.println(name.getName() + " gets all lost " + damagePointsToWaterPokemon + " HP's from " + enemy.getName());
            case "grass" :
                temp = enemy.getHp() - damagePointsToGrassPokemon;
                enemy.setHp(temp);

                temp2 = name.getHp() + damagePointsToGrassPokemon;
                System.out.println(enemy.getName() + " looses " + damagePointsToGrassPokemon + " HP");
                System.out.println(name.getName() + " gets all lost " + damagePointsToGrassPokemon + " HP's from " + enemy.getName());
            case "fire" :
                temp = enemy.getHp() - damagePointsToFirePokemon;
                enemy.setHp(temp);
                temp2 = name.getHp() + damagePointsToFirePokemon;
                System.out.println(enemy.getName() + " looses " + damagePointsToFirePokemon + " HP");
                System.out.println(name.getName() + " gets all lost " + damagePointsToFirePokemon + " HP's from " + enemy.getName());
            case "electric" :
                temp = enemy.getHp() - damagePointsToElectricPokemon;
                enemy.setHp(temp);
                temp2 = name.getHp() + damagePointsToElectricPokemon;
                System.out.println(enemy.getName() + " looses " + damagePointsToElectricPokemon + " HP");
                System.out.println(name.getName() + " gets all lost " + damagePointsToElectricPokemon + " HP's from " + enemy.getName());
        }
        System.out.println("New HP of " + enemy.getName() + " is " + enemy.getHp());
    }

}
