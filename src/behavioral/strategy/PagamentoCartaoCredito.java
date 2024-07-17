package behavioral.strategy;

import java.math.BigDecimal;

public class PagamentoCartaoCredito implements PagamentoStrategy {
	public void processarPagamento(BigDecimal valor) {
		// Lógica de processamento de pagamento com cartão de crédito
		System.out.println("Pagamento de R$" + valor + " processado com cartão de crédito.");
	}
}
