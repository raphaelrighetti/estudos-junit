package org.raphinho.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.raphinho.modelos.Desempenho;
import org.raphinho.modelos.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializa() {
        service = new ReajusteService();
        funcionario = new Funcionario("Raphael", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    public void funcionarioComDesempenhoADesejarDeveriaReceberReajusteDe3Porcento() {
        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    public void funcionarioComDesempenhoBomDeveriaReceberReajusteDe15Porcento() {
        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    public void funcionarioComDesempenhoOtimoDeveriaReceberReajusteDe20Porcento() {
        service.concedeReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
