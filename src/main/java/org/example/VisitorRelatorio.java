package org.example;


public class VisitorRelatorio implements Visitor {

    public String exibir(Conta conta) {
        return conta.aceitar(this);
    }

    @Override
    public String exibirContaCorrente(ContaCorrente cc) {
        return "Conta Corrente: " + cc.getNumero() + " - Saldo: R$ " + cc.getSaldo();
    }

    @Override
    public String exibirCotaCapital(CotaCapital cota) {
        return "Cota Capital Associado: " + cota.getCodigoAssociado() + " - Valor: R$ " + cota.getValorTotal();
    }
}
