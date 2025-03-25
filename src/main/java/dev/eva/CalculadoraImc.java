package dev.eva;

public class CalculadoraImc {
public double calcular(double peso, double estatura) {
        return peso / (estatura * estatura);
    }
    
   
    public String clasificar(double imc) {
    if (imc < 16.0) {
        return "Delgadez severa";
    } else if (imc < 17.0) {
        return "Delgadez moderada";
    } else if (imc < 18.5) {
        return "Delgadez leve";
    } else if (imc < 25.0) {
        return "Normal";
    } else if (imc < 30.0) {
        return "Sobrepeso";
    } else if (imc < 35.0) {
        return "Obesidad leve";
    } else if (imc < 40.0) {
        return "Obesidad media";
    } else {
        return "Obesidad mórbida";
    }
}

}
