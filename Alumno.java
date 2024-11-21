public class Alumno {

    private String nombre, apellido;
    private int curso, edad;
    private float altura;

    public Alumno(String Nombre) {
        this.nombre = Nombre;
    }

    public Alumno(String Nom, String Apellido) {
        this.nombre = Nom;
        this.apellido = Apellido;
    }

    public Alumno(String Nom, String Apellido, int Edad) {
        this.nombre = Nom;
        this.apellido = Apellido;
        this.edad = Edad;
    }

    public void pintarNombreApellidos() {
        System.out.println(this.nombre + " " + this.apellido);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void cumpleanos () {
        if (this.edad>0) {
            edad++;
        } else {
            System.out.println("Este alumno no tiene la edad definida");
        }
    }
}
