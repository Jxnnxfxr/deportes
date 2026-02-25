import java.time.LocalDate;

public class AppSistemaGestionDeportiva {
    public static void main(String[] args) {
        /*
            Primero crearemos las instancias:
                -Participantes
                -Evento deportivo
                -Torneo de futbol
                -Equipo
        */

        Participante p1 = new Participante("Jenny", "Brito", 22); //Según los parámetros corresponde a un participante normal
        Participante p2 = new Participante("Juan", "Rojas", 22);
        Participante p3 = new Participante("Vale", "Blanco", 18);

        //EventoDeportivo evento = new EventoDeportivo("Torneo de fútbol", LocalDate.of(2026, 6, 12), "Sevilla");
        TorneoDeFutbol torneoDeFutbol = new TorneoDeFutbol("BET vs ATM", LocalDate.of(2026, 6, 12), "Sevilla");
        Equipo equipo1 = new Equipo("Las Águilas");

        equipo1.addJugador(p1);
    }
}
