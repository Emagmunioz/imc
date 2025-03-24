package dev.eva;

public class CalculadoraImc {
    public static double calcularImc(double peso, double estatura) {
            return peso / Math.pow(estatura, 2);
    }
public static String obtenerResultadoImc(double imc) {
    if (imc < 16) return "Delgadez severa";
    else if (imc >= 16 && imc < 17) return "Delgadez moderada"; 
    else if (imc >= 17 && imc < 18.5) return "Delgadez aceptable";
    else if (imc >= 18.5 && imc < 25) return "Peso normal";
    else if (imc >= 25 && imc < 30) return "Sobrepeso";
    else if (imc >= 30 && imc < 35) return "Obesidad leve";
    else if (imc >= 35 && imc < 40) return "Obesidad media";
    else return "Obesidad morbida";
}    

}
