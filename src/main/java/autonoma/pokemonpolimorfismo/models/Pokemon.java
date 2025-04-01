package autonoma.pokemonpolimorfismo.models;

/**
 * @author camila prada 
 * version 1.0.0
 * 3/29/25
 */
public  abstract class Pokemon {
    private int numPokedex;
    private String nombre;
    private float peso;
    private String temporada;
//Metodo constructor
    public Pokemon(int numPokedex, String nombre, float peso, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.temporada = temporada;
    }
    
    public int getNumPokedex (){
        return numPokedex;
    }
    public void setNumPokedex (int numPokedex){
        this.numPokedex = numPokedex; 
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public String getTemporada(){
        return temporada;
    }
    public void setTemporada(String temporada){
        this.temporada = temporada;
    }
    
    //Metodos abstactos
    
    public abstract String atacarPlacaje();
    public abstract String atacarArañazo();
    public abstract String atacarMordisco();
    
    
   @Override
    public String toString() {
        return "Soy " + nombre + ", numero en la Pokedex: " + numPokedex + 
               ", peso: " + peso + " kg, temporada: " + temporada;
    }
}
