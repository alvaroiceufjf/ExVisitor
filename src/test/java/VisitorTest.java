package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    void deveExibirRelatorioContaCorrente() {
        ContaCorrente cc = new ContaCorrente(1001, 1500.0);
        VisitorRelatorio visitor = new VisitorRelatorio();

        assertEquals("Conta Corrente: 1001 - Saldo: R$ 1500.0", visitor.exibir(cc));
    }

    @Test
    void deveExibirRelatorioCotaCapital() {
        CotaCapital cota = new CotaCapital(55, 5000.0);
        VisitorRelatorio visitor = new VisitorRelatorio();

        assertEquals("Cota Capital Associado: 55 - Valor: R$ 5000.0", visitor.exibir(cota));
    }
}