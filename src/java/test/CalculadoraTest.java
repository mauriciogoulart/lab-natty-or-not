import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.mg.Calculadora;


public class CalculadoraTest {

    @Test
    public void testAdicionar() {
        assertEquals(15.0, Calculadora.adicionar(10.0, 5.0), "A adição de 10.0 e 5.0 deve ser 15.0");
        assertEquals(-5.0, Calculadora.adicionar(-10.0, 5.0), "A adição de -10.0 e 5.0 deve ser -5.0");
    }

    @Test
    public void testSubtrair() {
        assertEquals(5.0, Calculadora.subtrair(10.0, 5.0), "A subtração de 10.0 e 5.0 deve ser 5.0");
        assertEquals(-15.0, Calculadora.subtrair(-10.0, 5.0), "A subtração de -10.0 e 5.0 deve ser -15.0");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(50.0, Calculadora.multiplicar(10.0, 5.0), "A multiplicação de 10.0 e 5.0 deve ser 50.0");
        assertEquals(-50.0, Calculadora.multiplicar(-10.0, 5.0), "A multiplicação de -10.0 e 5.0 deve ser -50.0");
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, Calculadora.dividir(10.0, 5.0), "A divisão de 10.0 por 5.0 deve ser 2.0");
        assertEquals(-2.0, Calculadora.dividir(-10.0, 5.0), "A divisão de -10.0 por 5.0 deve ser -2.0");
    }

    @Test
    public void testDividirPorZero() {
        // Verifica se a exceção ArithmeticException é lançada quando a divisão por zero é tentada
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(10.0, 0);
        }, "Divisão por zero deve lançar uma exceção");
    }
}

