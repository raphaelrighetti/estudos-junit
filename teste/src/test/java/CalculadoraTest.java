import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.raphinho.Calculadora;

import java.math.BigDecimal;

public class CalculadoraTest {

    @Test
    public void checaValorNegativo() {
        BigDecimal valor = new Calculadora().soma(new BigDecimal("1.00"), new BigDecimal("-2.00"));

        Assertions.assertEquals(new BigDecimal("-1.00"), valor);
    }
}
