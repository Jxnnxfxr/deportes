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
        System.out.println("|Se ha modificado correctamente el nombre del equipo.");
    }

    public int getPuntos() {  return this.puntos;   }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
        System.out.println("|Se han modificado correctamente los puntos del equipo.");
    }

    //MÉTODOS DE LA CLASE
    public void addJugador(Participante participante) {
        jugadores.add(participante);
        System.out.println("|Se ha añadido correctamente un nuevo participante.");
    }

    public void eliminarJugador(Participante participante) throws Exception {
        try {
            jugadores.remove(participante);    
        } catch (Exception e) {
            //TODO: No está terminado
            throw new Exception("Jugador no encontrado");
        }
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
