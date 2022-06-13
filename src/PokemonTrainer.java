import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    FirePokemon charizard = new FirePokemon("charizard", 22, 100, "fireFood", "fireSound" );
    WaterPokemon blastoise = new WaterPokemon("blastoise", 33, 70, "waterFood", "waterSound");
    WaterPokemon gyarados = new WaterPokemon("gyarados", 51, 58,"waterFood", "waterSound");
    GrassPokemon venusaur = new GrassPokemon("venusaur", 23, 64,"grassFood", "grassSound");
    GrassPokemon ditto = new GrassPokemon("ditto", 49, 100, "grassFood", "grassSound");
    ElectricPokemon raichu = new ElectricPokemon("raichu", 102, 95, "electricFood", "electricSound");

    private String name;
    List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, gyarados, venusaur, ditto, raichu);

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
