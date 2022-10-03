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
        assertEquals(8,result);
    }


    @ Test
    public void subDedecimais(){
        double result = soma.Soma(10, 3.5);
        assertEquals(5.5,result);
    }

    @Test
    public void  subComZero(){
        double resut = soma.Soma(10, 0);
        assertEquals(10,resut);
    }

}
