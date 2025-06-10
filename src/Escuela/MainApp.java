package Escuela;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Persona persona1 = new Persona(
                "Luca",
                "Bazzani",
                "44607411",
                22,
                "Los Cóndores",
                "3541-575723");

        Estudiante estudiante1 = new Estudiante(
                "Santino",
                "Gorgonzola",
                "46665444",
                18,
                "Av. Cárcano",
                "3541649874",
                "654512",
                "Técnico Sup. En Desarrollo De Software",
                10);

        Profesor profesor1 = new Profesor(
                "Agustina",
                "Aperlo",
                "20456895",
                40,
                "Gobernador Ferreyra",
                "3541484456",
                "Programación II",
                1500000,
                10);

        EmpleadoAdministrativo empleado1 = new EmpleadoAdministrativo(
                "Gabriel",
                "Morón",
                "18456123",
                66,
                "Olsacher 99",
                "3541123322",
                "Vicedirección",
                "Mañana",
                865000);

        // Métodos de clase Persona: mostrarInformación y saludar
        System.out.println("================== Persona 1 ==================");
        persona1.saludar();
        persona1.mostrarInformacion();
        System.out.println();

        // Polimorfismo
        List<Persona> listaDePersonas = new ArrayList<>();
        listaDePersonas.add(estudiante1);
        listaDePersonas.add(profesor1);
        listaDePersonas.add(empleado1);

        for (Persona p : listaDePersonas) {
            if (p == estudiante1) {
                System.out.println("================= Estudiante 1 =================");
                estudiante1.saludar();
                System.out.println("================================================");
                estudiante1.estudiar();
            }
            else if (p == profesor1) {
                System.out.println("================= Profesor 1 ==================");
                profesor1.saludar();
                System.out.println("===============================================");
                profesor1.ensenar();
            }
            else if (p == empleado1) {
                System.out.println("================= Empleado 1 ==================");
                empleado1.saludar();
                System.out.println("===============================================");
                empleado1.administrar();
            }
            p.mostrarInformacion();
            System.out.println();
        }
    }
}