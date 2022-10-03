package app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

public class SubtracaoTest {
    Subtracao subtracao;

    @BeforeEach
    public void beforeEach(){
        subtracao = new Subtracao();
    }

    @Test
    public void testBase(){
        double result = subtracao.subtrair(12, 4);
        assertEquals(8,result);
    }


    @ Test
    public void subDedecimais(){
        double result = subtracao.subtrair(10, 3.5);
        assertEquals(5.5,result);
    }

    @Test
    public void  subComZero(){
        double resut = subtracao.subtrair(10, 0);
        assertEquals(10,resut);
    }

}
