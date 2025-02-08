package dev.eva;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculadoraImcTest {
    @Test
    public void testCalcularIMC() {
        Persona persona = new Persona(70, 1.75);
        double imc = CalculadoraImc.calcularImc(persona);
        assertThat(imc, closeTo(22.86, 0.01));
    }

    @Test
    public void testObtenerResultadoIMC() {
        String resultado = CalculadoraImc.obtenerResultadoIMC(22.86);
        assertThat(resultado, is("Peso normal"));
    }
}

