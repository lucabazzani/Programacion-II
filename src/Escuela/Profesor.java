package Escuela;

public class Profesor extends Persona {

    private String departamento;
    private double salario;
    private int anosExperiencia;

    public Profesor(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion,
                    String telefono, String departamento, double salario, int anosExperiencia) {
        super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono);

        setDepartamento(departamento);
        setSalario(salario);
        setAnosExperiencia(anosExperiencia);
    }

    // a) Getter para Departamento
    public String getDepartamento() {
        return departamento;
    }

    // b) Getter para Salario
    public double getSalario() {
        return salario;
    }

    // c) Getter para AnosExperiencia
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    // d) Setter para Departamento
    public void setDepartamento(String departamento) {
        if (departamento == null || departamento.trim().isEmpty()) {
            throw new IllegalArgumentException("El departamento no puede ser nulo ni vacío.");
        }
        this.departamento = departamento;
    }

    // e) Setter para Salario
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    // f) Setter para AnosExperiencia
    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia < 0) {
            throw new IllegalArgumentException("La cantidad de años no puede ser negativa.");
        }
        this.anosExperiencia = anosExperiencia;
    }

    // Métodos adicionales: enseñar y @Override mostrarInformacion
    public void ensenar() {
        System.out.println("El profesor " + getNombre() + " " + getApellido() + " está enseñando en\nel departamento de " + getDepartamento());
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salario: $" + this.salario);
        System.out.println("Años de experiencia: " + this.anosExperiencia);
        System.out.println("===============================================");
    }
}