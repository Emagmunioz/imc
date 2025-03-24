package dev.eva;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class CalculadoraImcTest {
    @Test
    public void testCalcularImc() {
        double imc = CalculadoraImc.calcularImc(70.5, 1.75);
        assertThat(imc, closeTo(22.86, 0.01));

    }
    @Test
    public void testObtenerResultadoImc() {
        String resultado = CalculadoraImc.obtenerResultadoImc(22.86);
        assertThat(resultado, is("Peso normal"));
    }
}
