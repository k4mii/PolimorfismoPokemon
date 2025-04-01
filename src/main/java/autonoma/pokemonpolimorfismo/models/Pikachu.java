package autonoma.pokemonpolimorfismo.models;

/**
 * @author camila prada 
 * version 1.0.0
 * 3/29/25
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    public Pikachu(int numPokedex, String nombre, float peso, String temporada) {
        super(numPokedex, nombre, peso, temporada);
    }
    
    @Override
    public String atacarPlacaje(){
        return " Soy Pikachu y estoy atacando con PLACAJE ";
    }
    
    @Override
    public String atacarArañazo() {
        return "Soy Pikachu y estoy atacando con ARAÑAZO";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Pikachu y estoy atacando con MORDISCO";
    }
//metodos de  interfaz de PokemonElectrico
    @Override
    public String atacarImpactrueno() {
        return "Soy Pikachu y estoy atacando con IMPACTO DE TRUENO";
    }

    @Override
    public String atacarPunioTrueno() {
        return "Soy Pikachu y estoy atacando con PUÑO DE TRUENO";
    }

    @Override
    public String atacarRayo() {
        return "Soy Pikachu y estoy atacando con RAYO";
    }

    @Override
    public String atacarRayoCarga() {
        return "Soy Pikachu y estoy atacando con RAYO DE CARGA";
    }
}
