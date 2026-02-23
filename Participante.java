public class Participante {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;

    //CONSTRUCTOR
    public Participante(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    //MÉTODOS DE LA CLASE
    @Override
    public String toString() {
        return 
            "Nombre y apellido: " + getNombre() + " " + getApelido() +
            "Edad: " + getEdad()
        ;
    }    
}
