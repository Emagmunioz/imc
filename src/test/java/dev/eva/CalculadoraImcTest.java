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

}
