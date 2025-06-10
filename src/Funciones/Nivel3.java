package Funciones;

public class Nivel3 {

    // 9. Sumar múltiples números (varargs)
    public int sumarNumeros(int... numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo ni vacío.");
        }
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }

    // 10. Promedio de un array
    public double promedio(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo ni vacío.");
        }
        double suma = 0.0;
        for (double n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }

    // 11. Buscar valor en array
    public boolean buscarEnArray(int[] numeros, int valorBuscado) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser nulo.");
        }
        for (int n : numeros) {
            if (n == valorBuscado) {
                return true;
            }
        }
        return false;
    }

    // 12. Contar ocurrencias
    public int contarOcurrencias(String[] arreglo, String clave) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El array de cadenas no puede ser nulo.");
        }
        if (clave == null) {
            throw new IllegalArgumentException("La clave a buscar no puede ser nula.");
        }
        int contador = 0;
        for (String s : arreglo) {
            if (clave.equals(s)) {
                contador++;
            }
        }
        return contador;
    }
}