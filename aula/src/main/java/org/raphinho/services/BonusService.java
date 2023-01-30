package org.raphinho.services;

import org.raphinho.modelos.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BonusService {

    public BigDecimal checaBonus(Funcionario funcionario) {
        BigDecimal bonus = funcionario.getSalario().multiply(new BigDecimal("0.10"));

        if (bonus.compareTo(new BigDecimal("1000")) > 0 || bonus.compareTo(new BigDecimal("1000")) == 0) {
            throw new IllegalArgumentException("Funcionário não pode receber bônus, pois o bônus é maior que R$1000.00");
        }

        return bonus.setScale(2, RoundingMode.HALF_UP);
    }
}
