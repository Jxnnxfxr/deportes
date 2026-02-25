public class Participante {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private double tiempo; //El tiempo registrado en segundos.

    //CONSTRUCTORES
    //Participantes por defecto
    public Participante(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Participante de carreras porque registra el tiempo en segundos.
    public Participante(String nombre, String apellido, int edad, double tiempo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;
    }
    //GETTERS AND SETTERS
    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {    return this.apellido;   }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {  return this.edad;   }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTiempo() {  return this.tiempo;   }
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    //MÉTODOS DE LA CLASE
    @Override
    public String toString() {
        return 
            "Nombre y apellido: " + getNombre() + " " + getApelido() + "\n" +
            "Edad: " + getEdad()
        ;
    }    
}
