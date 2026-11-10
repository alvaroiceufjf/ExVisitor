package org.example;

public class CotaCapital implements Conta {

    private int codigoAssociado;
    private double valorTotal;

    public CotaCapital(int codigoAssociado, double valorTotal) {
        this.codigoAssociado = codigoAssociado;
        this.valorTotal = valorTotal;
    }

    public int getCodigoAssociado() {
        return codigoAssociado;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCotaCapital(this);
    }
}
