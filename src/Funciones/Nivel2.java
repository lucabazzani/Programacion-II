package Funciones;

public class Nivel2 {

    // 6. Número par o impar
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // 7. Calcular el cuadrado de un número
    public int cuadrado(int numero) {
        return numero * numero;
    }

    // 8. Factorial recursivo
    public int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}