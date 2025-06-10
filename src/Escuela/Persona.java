public class Persona {

    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;
    private String direccion;
    private String telefono;

    // Constructor principal
    // El constructor recibe los seis parámetros para inicializar cada atributo.
    public Persona(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setNumeroIdentificacion(numeroIdentificacion);
        setEdad(edad);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    // Getters y setters con validaciones

    // a) Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // b) Setter para nombre con validación: no puede ser nulo ni vacío
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            // Si el argumento es inválido, lanzamos una excepción para detener la ejecución
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
        }
        this.nombre = nombre;
    }

    // c) Getter para apellido
    public String getApellido() {
        return apellido;
    }

    // d) Setter para apellido con validación: no puede ser nulo ni vacío
    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo ni vacío.");
        }
        this.apellido = apellido;
    }

    // e) Getter para número de identificación
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    // f) Setter para número de identificación: mínimo validamos que no sea nulo
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        if (numeroIdentificacion == null || numeroIdentificacion.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de identificación no puede ser nulo ni vacío.");
        }
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // g) Getter para edad
    public int getEdad() {
        return edad;
    }

    // h) Setter para edad con validación: no puede ser negativa
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser un valor negativo.");
        }
        this.edad = edad;
    }

    // i) Getter para dirección
    public String getDireccion() {
        return direccion;
    }

    // j) Setter para dirección: validación básica (no nulo)
    public void setDireccion(String direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula.");
        }
        this.direccion = direccion;
    }

    // k) Getter para teléfono
    public String getTelefono() {
        return telefono;
    }

    // l) Setter para teléfono: validación básica (no nulo)
    public void setTelefono(String telefono) {
        if (telefono == null) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo.");
        }
        this.telefono = telefono;
    }

    // 4. Metodo mostrar Información. Imprime en consola todos los datos de la persona en un formato legible
    public void mostrarInformacion() {
        // Para cada campo, imprimimos su etiqueta y su valor
        System.out.println("============= Datos de la Persona =============");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Número de Identificación: " + this.numeroIdentificacion);
        System.out.println("Edad: " + this.edad);
        System.out.println("Dirección: " + this.direccion);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("===============================================");
    }

    // 5. Metodo para saludar. Imprime un saludo genérico usando el nombre y apellido de la persona.
    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + " " + this.apellido + ".");
    }
}