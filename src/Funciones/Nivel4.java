package Funciones;

public class Nivel4 {

    // 13. Imprimir array de forma formateada
    public void imprimirArray(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        // Construimos la representación entre corchetes y separados por comas
        StringBuilder array = new StringBuilder();
        array.append("[");
        for (int i = 0; i < numeros.length; i++) {
            array.append(numeros[i]);
            if (i < numeros.length - 1) {
                array.append(", ");
            }
        }
        array.append("]");
        System.out.println(array);
    }

    // 14. Invertir array
    public int[] invertirArray(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        int longitud = numeros.length;
        int[] invertido = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            invertido[i] = numeros[longitud - 1 - i];
        }
        return invertido;
    }

    // 15. Estudiante con mejor nota
    public String mejorEstudiante(String[] nombres, double[] notas) {
        if (nombres == null || notas == null) {
            throw new IllegalArgumentException("Los arrays no pueden ser nulos.");
        }
        if (nombres.length != notas.length) {
            throw new IllegalArgumentException("Los arrays de nombres y notas deben tener la misma longitud.");
        }
        if (nombres.length == 0) {
            throw new IllegalArgumentException("Los arrays no pueden estar vacíos.");
        }
        // Buscamos el índice de la nota máxima
        int idxMejorNota = 0;
        double mejorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mejorNota) {
                mejorNota = notas[i];
                idxMejorNota = i;
            }
        }
        return nombres[idxMejorNota];
    }
}