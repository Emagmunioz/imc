package dev.eva;

public class CalculadoraImc {
    public static double calcularImc(Persona persona) {
        return persona.getPeso() / Math.pow(persona.getEstatura(), 2);
    }

}

