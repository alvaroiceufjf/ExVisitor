package org.example;

public class ContaCorrente implements Conta {

    private int numero;
    private double saldo;

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirContaCorrente(this);
    }
}
