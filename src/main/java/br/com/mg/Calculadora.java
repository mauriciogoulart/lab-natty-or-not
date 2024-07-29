package br.com.mg;

public class Calculadora {
	// Método estático para adicionar dois números
    public static double adicionar(double a, double b) {
        return a + b;
    }

    // Método estático para subtrair dois números
    public static double subtrair(double a, double b) {
        return a - b;
    }

    // Método estático para multiplicar dois números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método estático para dividir dois números
    // Lança uma exceção se o divisor for zero
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
