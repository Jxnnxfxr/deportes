import java.time.LocalDate;
import java.util.ArrayList;

public class EventoDeportivo implements Ganador{
    //Atributos
    private String nombre; //Nombre del evento deportivo
    private LocalDate fecha;
    private String lugar;
    private ArrayList<Participante> participantes = new ArrayList<>();

    //Constructores;
    public EventoDeportivo(String nombre, LocalDate fecha, String lugar){
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    

    //GETTERS AND SETTERS
    public String getNombre() {  return this.nombre;  }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("|Se ha modificado correctamente el nombre del evento deportivo.");
    }

    public LocalDate getFecha() {   return this.fecha;  }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
        System.out.println("|Se ha modificado correctamente la fecha del evento deportivo.");
    }

    public String getLugar() {  return this.lugar;  }
    public void setLugar(String lugar) {
        this.lugar = lugar;
        System.out.println("|Se ha modificado correctamente el lugar del evento deportivo.");
    }

    //Métodos de la clase
    public void inscribirParticipante(Participante participante) {  
        this.participantes.add(participante);
        System.out.println("|Se ha inscrito correctamente un nuevo participante");
    }

    @Override
    public Participante obtenerGanador(Participante ganador) {
        return ganador;
    }
}
