package org.raphinho.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private LocalDate dataDeAdmissao;
    private BigDecimal salario;

    public Funcionario(String nome, LocalDate dataDeAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataDeAdmissao = dataDeAdmissao;
        this.salario = salario;
        formataSalario();
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void aplicaReajuste(BigDecimal valorReajuste) {
        salario = salario.add(valorReajuste);
        formataSalario();

    }

    private void formataSalario() {
        salario = salario.setScale(2, RoundingMode.HALF_UP);
    }
}
