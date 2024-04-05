package br.com.conta.conta.model;

import java.time.LocalDateTime;

public abstract  class Conta {

    private int numero;

    private String agencia;

    private double saldo;

    private LocalDateTime primeiroDeposito;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDateTime getPrimeiroDeposito() {
        return primeiroDeposito;
    }

    public void setPrimeiroDeposito(LocalDateTime primeiroDeposito) {
        this.primeiroDeposito = primeiroDeposito;
    }

    public Conta(int numero, String agencia, double saldo, LocalDateTime primeiroDeposito){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.primeiroDeposito = primeiroDeposito;
    }

    public abstract boolean deposito(double valor);

    public abstract boolean saque(double valor);

    public double consultaSaldo(){
        return this.saldo;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", primeiroDeposito=" + primeiroDeposito +
                '}';
    }
}
