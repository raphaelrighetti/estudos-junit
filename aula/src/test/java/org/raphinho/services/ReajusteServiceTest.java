package org.raphinho.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.raphinho.modelos.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void funcionarioComDesempenhoADesejarDeveriaReceberReajusteDe3Porcento() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Raphael", LocalDate.now(), new BigDecimal("1000"));

        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    public void funcionarioComDesempenhoBomDeveriaReceberReajusteDe15Porcento() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Raphael", LocalDate.now(), new BigDecimal("1000"));

        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    public void funcionarioComDesempenhoOtimoDeveriaReceberReajusteDe20Porcento() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Raphael", LocalDate.now(), new BigDecimal("1000"));

        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
