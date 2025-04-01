package autonoma.pokemonpolimorfismo.models;

/**
 * @author camila prada 
 * version 1.0.0
 * 3/29/25
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta{

    public Bulbasaur(int numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    //metodos abstractos de  Clase Pokemon
    @Override
    public String atacarPlacaje(){
        return "Soy Bulbasaur y estoy atacando con PLACAJE";
    }
    
    @Override
    public String atacarArañazo() {
        return "Soy Bulbasaur y estoy atacando con ARAÑAZO";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Bulbasaur y estoy atacando con MORDISCO";
    }
//metodos abstractos de  interfaz de PokemonFuego

    @Override
    public String atacarParalizar() {
        return "Soy Bulbasaur y estoy atacando con PARALIZAR";
    }

    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasaur y estoy atacando con DRENAJE";
    }
    @Override
    public String atacarHojaAfilada() {
       return "Soy Bulbasaur y estoy atacando con HOJA AFILADA";
    }

    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasaur y estoy atacando con LATIGO CEPA";
    }
}
