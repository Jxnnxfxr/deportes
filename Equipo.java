import java.util.ArrayList;

public class Equipo {
    //ATRIBUTOS
    private String nombre;
    private ArrayList<Participante> jugadores = new ArrayList<>();
    private int puntos;

    //CONSTRUCTOR
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0; //Inicializamos los puntos en 0
    }

    //GETTERS AND SETTERS
    
    public String getNombre() {  return this.nombre;   }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {  return this.puntos;   }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    //MÉTODOS DE LA CLASE
    public void addJugador(Participante participante) {
        jugadores.add(participante);
    }

    public void eliminarJugador(Participante participante) {
        jugadores.remove(participante);
    }

    @Override
    public String toString() {
        return
            "Equipo " + getNombre() + "\n" +
            "Puntos: " + getNombre() + "\n" +
            "Jugadores: " + jugadores.toString()
        ;
    }

}
