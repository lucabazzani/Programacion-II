public class MainApp {
    public static void main(String[] args) {
        Persona persona1 = new Persona(
                "Luca",
                "Bazzani",
                "44607411",
                22,
                "Los Cóndores",
                "3541-575723");

        // Metodo saludar y mostrarInformacion heredados de clase Persona
        System.out.println("=== Objeto Persona ===");
        persona1.saludar();
        persona1.mostrarInformacion();
    }
}