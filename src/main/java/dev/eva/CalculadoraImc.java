package dev.eva;

public class CalculadoraImc {
    public static double calcularImc(double peso, double estatura) {
            return peso / Math.pow(estatura, 2);
    }

}
