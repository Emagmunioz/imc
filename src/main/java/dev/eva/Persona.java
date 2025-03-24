package dev.eva;

public class Persona {
    private double peso;
    private double estatura;
    public Persona(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }
    public double getPeso() {
        return peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setPeso(double peso) {
        
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

}
