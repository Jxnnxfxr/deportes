import java.io.EOFException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{
    //ATRIBUTOS
    private ArrayList<Equipo> equipos = new ArrayList<>();
    
    //CONSTRUCTORES
    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
    }

    //MÉTODOS
    // TODO: NO ESTÁ TERMINADO
    public void addEquipo (Equipo equipo) {
        equipos.add(equipo);
        System.out.println("|Se ha añadido correctamente un nuevo equipo.");
    }
    //TODO: No está listo
    public void eliminarEquipo(Equipo equipo) throws Exception{
        try {
            equipos.remove(equipo);
        } catch (Exception e) {
            
            throw new Exception("No existe ese equipo.");
        }
    }
    //TODO: No está terminado esto
    @Override
    public Participante obtenerGanador(Participante ganador){
        return ganador;
    }

}
