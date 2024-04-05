package br.com.conta.conta.model;

import java.time.LocalDateTime;

public class ContaInvestimento extends Conta{
    public ContaInvestimento(int numero, String agencia, double depositoInicial) {
        super(numero, agencia, depositoInicial, LocalDateTime.now());
        if (depositoInicial < 1000) {
            throw new RuntimeException("O valor do deposito inicial deve ser maior que 1000");
        }
    }

    @Override
    public boolean deposito(double valor) {

        return false;
    }

    @Override
    public boolean saque(double valor) {
        return false;
    }
}
