package app;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisaoTest{
    Divisao divisao = new Divisao();

    @Test
    public void testCaseDivisao1(){
        double resultado = divisao.dividir(9, 3);
        assertEquals(3, resultado);
    }

    /**
     * 
     */
    @Test
    public void testCaseDivisao2(){
        double resultado = divisao.dividir(3, 3);
        assertEquals(1, resultado);
    }
}