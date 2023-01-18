package org.example;

import java.math.BigDecimal;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
