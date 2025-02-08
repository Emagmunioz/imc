package dev.eva;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese su estatura en metros: ");
            double estatura = scanner.nextDouble();

            Persona persona = new Persona(peso, estatura);
            double imc = CalculadoraImc.calcularImc(persona);
            String resultado = CalculadoraImc.obtenerResultadoIMC(imc);

            System.out.printf("Su IMC es: %.2f%n", imc);
            System.out.println("Resultado: " + resultado);
        }
    }
}

