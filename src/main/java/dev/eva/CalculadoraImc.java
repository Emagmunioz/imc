package dev.eva;

public class CalculadoraImc {
    public double calcular(double peso, double estatura) {
        return peso / (estatura * estatura);
    }

}
