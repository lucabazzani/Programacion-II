package Escuela;

public class EmpleadoAdministrativo extends Persona{

    private String cargo;
    private String horarioTrabajo;
    private double salario;

    public EmpleadoAdministrativo(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion,
                                  String telefono, String cargo, String horarioTrabajo, double salario) {
        super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono);

        setCargo(cargo);
        setHorarioTrabajo(horarioTrabajo);
        setSalario(salario);
    }
    // a) Getter para Cargo
    public String getCargo() {
        return cargo;
    }

    // b) Setter para Cargo
    public void setCargo(String cargo) {
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new IllegalArgumentException("El cargo no puede ser nulo ni vacío.");
        }
        this.cargo = cargo;
    }

    // c) Getter para horarioTrabajo
    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    // d) Setter para horarioTrabajo
    public void setHorarioTrabajo(String horarioTrabajo) {
        if (horarioTrabajo == null || horarioTrabajo.trim().isEmpty()) {
            throw new IllegalArgumentException("El horario de trabajo no puede ser nulo ni vacío.");
        }
        this.horarioTrabajo = horarioTrabajo;
    }

    // e) Getter para salario
    public double getSalario() {
        return salario;
    }

    // d) Setter para salario
    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }

    // Métodos adicionales: Administrar y @Override mostrarInformación
    public void administrar() {
        System.out.println("El empleado " + getNombre() + " " + getApellido() + " está realizando\ntareas administrativas.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Cargo: " + this.cargo);
        System.out.println("Horario de trabajo: " + this.horarioTrabajo);
        System.out.println("Salario: $" + this.salario);
        System.out.println("===============================================");
    }
}