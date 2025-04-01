package autonoma.pokemonpolimorfismo.main;

import autonoma.pokemonpolimorfismo.models.Bulbasaur;
import autonoma.pokemonpolimorfismo.models.Charmander;
import autonoma.pokemonpolimorfismo.models.Pikachu;
import autonoma.pokemonpolimorfismo.models.Pokemon;
import autonoma.pokemonpolimorfismo.models.PokemonAgua;
import autonoma.pokemonpolimorfismo.models.PokemonElectrico;
//import autonoma.pokemonpolimorfismo.models.PokemonFuego;
import autonoma.pokemonpolimorfismo.models.Squirtle;



/**
 * @author camila prada 
 * version 1.0.0
 * 3/29/25
 */
public class PokemonPolimorfismo  {
    public static void main(String args[]){
        Charmander charmander = new Charmander(4, "Charmander", (float) 2.8, "Primera temporada");
        Pokemon pokemonC = new Charmander(2, "Charmander", (float) 4.2, "Segunda temporada");
        Pokemon pokemon = new Bulbasaur(8, "Bulbasaur", (float) 8, "Primera temporada");
        PokemonAgua pokemonA = new Squirtle(14, "Squirtle", (float) 1.2, "Primera temporada");
        PokemonElectrico pokemonE = new Pikachu(3, "Pikachu", (float) 5.6, "segunda temporada");
        
        System.out.println(charmander.toString());
        System.out.println(charmander.atacarLanzallamas()+ "\n");
        
        System.out.println(pokemonC.toString());
        System.out.println(pokemonC.atacarArañazo()+ "\n");
        
        System.out.println(pokemon.toString());
        System.out.println(pokemon.atacarMordisco()+ "\n");
        
        System.out.println(pokemonA.toString()); 
        System.out.println(pokemonA.atacarHidrobomba()+ "\n");
        
        System.out.println(pokemonE.toString());
        System.out.println(pokemonE.atacarImpactrueno()+ "\n");

        
        
        
        
        
    }
}
