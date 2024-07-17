package behavioral.strategy.main;

import java.math.BigDecimal;

import behavioral.strategy.PagamentoBoleto;
import behavioral.strategy.PagamentoCartaoCredito;
import behavioral.strategy.PagamentoStrategy;
import behavioral.strategy.ProcessadorPagamento;

public class Main {
    public static void main(String[] args) {
        // Criando um contexto com a estratégia de pagamento com cartão de crédito
        PagamentoStrategy pagamentoCartaoCredito = new PagamentoCartaoCredito();
        ProcessadorPagamento processador = new ProcessadorPagamento(pagamentoCartaoCredito);

        BigDecimal valorCompra = new BigDecimal("100.00");
        // Processando um pagamento com cartão de crédito
        processador.processarPagamento(valorCompra);

        // Mudando para a estratégia de pagamento com boleto bancário
        PagamentoStrategy pagamentoBoleto = new PagamentoBoleto();
        // Setando a estrategia no processador, para pagamento fazer pagamento com boleto
        processador.setEstrategia(pagamentoBoleto);

        // Processando um pagamento com boleto bancário
        BigDecimal valor = new BigDecimal("50.00");
        processador.processarPagamento(valor);
    }
}
