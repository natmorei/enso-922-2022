package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class MultiplicacaoTest {
    
    Multiplicacao mult;

    @BeforeEach
    public void beforeEach() {
        mult = new Multiplicacao();
    }

    @Test
    public void testCasoBase() {
        double resultado = mult.calcularMult(3, 3);
        assertEquals(9, resultado);
    }


    @Test
    public void testMultiplicacaoPorZero() {
        double resultado = mult.calcularMult(5, 0);
        assertEquals(0, resultado);
    }

    @Test
    public void testMultplicacaoNegativa() {
        double resultado = mult.calcularMult(10, -5);
        assertEquals(-50, resultado);
    }

    @Test
    public void testMultiplicacaoDecimal() {
        double resultado = mult.calcularMult(20, 0.5f);
        assertEquals(10, resultado);
    }
}
