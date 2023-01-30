package org.raphinho;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora {

    public BigDecimal soma(BigDecimal n1, BigDecimal n2) {
        return n1.add(n2).setScale(2, RoundingMode.HALF_UP);
    }
}
