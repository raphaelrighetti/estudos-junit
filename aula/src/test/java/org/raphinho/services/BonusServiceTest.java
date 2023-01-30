package org.raphinho.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.raphinho.modelos.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    public void bonusNaoDeveriaFuncionarEmFuncionarioComSalarioAcimaDe10000Reais() {
        Funcionario funcionario = new Funcionario("Raphael", LocalDate.now(), new BigDecimal("25000"));
        BonusService service = new BonusService();

        try {
            service.checaBonus(funcionario);
            Assertions.fail();
        } catch (Exception e) {
            Assertions.assertEquals(
                    "Funcionário não pode receber bônus, pois o bônus é maior que R$1000.00", e.getMessage()
            );
        }
    }

    @Test
    public void bonusDeveriaFuncionarEmFuncionarioComSalarioAbaixoDe10000Reais() {
        Funcionario funcionario = new Funcionario("Arthur", LocalDate.now(), new BigDecimal("2000"));
        BonusService service = new BonusService();
        Assertions.assertEquals(new BigDecimal("2000")
                .multiply(new BigDecimal("0.10")), service.checaBonus(funcionario));
    }
}
