package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void beforeEach(){
        soma = new Soma();
    }

    @Test
    public void testBase(){
        double result = soma.Soma(12, 4);
        assertEquals(16,result);
    }


    @ Test
    public void somaDedecimais(){
        double result = soma.Soma(10, 3.5);
        assertEquals(13.5,result);
    }

    @Test
    public void  somaComZero(){
        double resut = soma.Soma(10, 0);
        assertEquals(10,resut);
    }

}
