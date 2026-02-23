import java.time.LocalDate;

public class Carrera extends EventoDeportivo{ //No pongo el implements porque lo hereda de EventoDeportivo, entonces sería rebundante
    //ATRIBUTOS
    private double distancia; //Distancia en kilómetros

    //CONSTRUCTOR
    public Carrera(String nombreEvento,LocalDate fechaEvento, String lugarEvento, double distancia){
        super(nombreEvento, fechaEvento, lugarEvento);
        this.distancia = distancia;
    }

    //MÉTODOS
    public double getDistancia() {  return this.distancia;   }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador(Participante ganador) {  return ganador;  }

}
