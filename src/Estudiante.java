public class Estudiante extends Persona {

    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion,
                      String telefono, String matricula, String carrera, double promedio) {
        super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono);

        // nuevos atributos de la clase Estudiante
        setMatricula(matricula);
        setCarrera(carrera);
        setPromedio(promedio);
    }

    // a) Getter para matrícula
    public String getMatricula() {
        return matricula;
    }

    // b) Setter para matricula con validación: no puede ser nulo o vacío
    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("La matrícula no puede ser nulo ni vacío.");
        }
        this.matricula = matricula.trim();
    }

    // c) Getter para carrera
    public String getCarrera() {
        return carrera;
    }

    // d) Setter para carrera con validación: no puede ser nulo o vacío
    public void setCarrera(String carrera) {
        if (carrera == null || carrera.trim().isEmpty()) {
            throw new IllegalArgumentException("La carrera no puede ser nula ni vacía.");
        }
        this.carrera = carrera.trim();
    }

    // e) Getter para promedio
    public double getPromedio() {
        return promedio;
    }

    // f) Setter para promedio con validación: debe ser >= 0
    public void setPromedio(double promedio) {
        if (promedio < 0) {
            throw new IllegalArgumentException("El promedio no puede ser negativo.");
        }
        this.promedio = promedio;
    }

    // Metodos adicionales: Estudiar y @Override para mostrarInformación
    public void estudiar() {
        System.out.println("El estudiante " + getNombre() + " " + getApellido() + "está estudiando " + getCarrera() + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Promedio: " + this.promedio);
        System.out.println("------------------------------");
    }
}