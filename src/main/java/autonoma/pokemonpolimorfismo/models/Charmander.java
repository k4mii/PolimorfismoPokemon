package autonoma.pokemonpolimorfismo.models;

/**
 * @author camila prada 
 * version 1.0.0
 * 3/29/25
 */
public class Charmander extends Pokemon implements PokemonFuego{
    
    public Charmander(int numPokedex, String nombre, float peso, String temporada){
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public String atacarPlacaje(){
        return "Soy Charmander y estoy atacando con PLACAJE";
    }

    @Override
    public String atacarArañazo() {
        return "Soy Charmander y estoy atacando con ARAÑAZO";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Charmander y estoy atacando con MORDISCO";
    }
//metodos de  interfaz de PokemonFuego
    @Override
    public String atacarPunioFuego() {
        return "Soy Charmander y estoy atacando con PUÑO DE FUEGO";
    }

    @Override
    public String atacarAscuas() {
        return "Soy Charmander y estoy atacando con ASCUAS";
    }

    @Override
    public String atacarLanzallamas() {
        return "Soy Charmander y estoy atacando con LANZALLAMAS";
    }
    


}
