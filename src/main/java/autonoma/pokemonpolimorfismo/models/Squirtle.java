package autonoma.pokemonpolimorfismo.models;

/**
 *
 * @author Kamii
 */
public class Squirtle extends Pokemon implements PokemonAgua{

    public Squirtle(int numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public String atacarPlacaje(){
        return " Soy Squirtle y estoy atacando con PLACAJE ";
    }
    
    @Override
    public String atacarArañazo() {
        return "Soy Squirtle y estoy atacando con ARAÑAZO";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Squirtle y estoy atacando con MORDISCO";
    }
//metodos de  interfaz de PokemonFuego

    @Override
    public String atacarHidrobomba() {
        return "Soy Squirtle y estoy atacando con HIDROBOMBA";
    }

    @Override
    public String atacarPistolaAgua() {
        return "Soy Squirtle y estoy atacando con PISTOLA DE AGUA";
    }

    @Override
    public String atacarBurbuja() {
        return "Soy Squirtle y estoy atacando con BURBUJA";
    }

    @Override
    public String atacarHidropulso() {
        return "Soy Squirtle y estoy atacando con HIDROPULSO";
    }
}
