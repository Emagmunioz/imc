package dev.eva;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona persona = new Persona(70.5, 1.75);
        assertThat(persona.getPeso(), is(70.5));
        assertThat(persona.getEstatura (), is(1.75));    
    }
    @Test
    public void testSetters() {
        Persona persona = new Persona(70.5, 1.75);
        persona.setPeso(80.5);
        persona.setEstatura(1.80);
        assertThat(persona.getPeso(), is(80.5));
        assertThat(persona.getEstatura (), is(1.80));    
    }

}
