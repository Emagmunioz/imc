package dev.eva;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculadoraImcTest {
    @Test
    public void testCalcularImc() {
        CalculadoraImc calculadora = new CalculadoraImc();
        double imc = calculadora.calcular(70, 1.75);
        assertThat(imc, closeTo(22.857, 0.001));
    }
    @Test
    public void testClasificarImc() {
        // Rangos actualizados según OMS extendida
        assertThat(calculadora.clasificar(15.0), is("Delgadez severa"));
        assertThat(calculadora.clasificar(16.5), is("Delgadez moderada"));
        assertThat(calculadora.clasificar(17.5), is("Delgadez leve"));
        assertThat(calculadora.clasificar(20.0), is("Normal"));
        assertThat(calculadora.clasificar(27.0), is("Sobrepeso"));
        assertThat(calculadora.clasificar(32.0), is("Obesidad leve"));
        assertThat(calculadora.clasificar(37.0), is("Obesidad media"));
        assertThat(calculadora.clasificar(45.0), is("Obesidad mórbida"));
    }
    
}


