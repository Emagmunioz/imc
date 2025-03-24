package dev.eva;
import dev.eva.CalculadoraImc;
import java.util.Scanner;


public final class App {
    private App() {
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de IMC");
        System.out.println("------------------");
       
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        
        Persona persona = new Persona(peso, estatura);
        double imc = CalculadoraImc.calcularImc(persona);
        String resultado = CalculadoraImc.obtenerResultadoImc(imc);
        
     
        System.out.printf("\nResultados:%n");
        System.out.printf("IMC: %.2f%n", imc);
        System.out.printf("Clasificación: %s%n", resultado);
        
        scanner.close();
    }
}