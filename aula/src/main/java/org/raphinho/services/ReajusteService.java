package org.raphinho.services;

import org.raphinho.modelos.Desempenho;
import org.raphinho.modelos.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {

    public void concedeReajuste(Funcionario funcionario, Desempenho desempenho) {
        BigDecimal valorReajuste = funcionario.getSalario().multiply(desempenho.getPorcentagemDesempenho());
        funcionario.aplicaReajuste(valorReajuste);
    }
}
