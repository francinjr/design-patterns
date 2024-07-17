package behavioral.strategy;

import java.math.BigDecimal;

public class PagamentoBoleto implements PagamentoStrategy {
	public void processarPagamento(BigDecimal valor) {
		// Lógica de processamento de pagamento com boleto bancário
		System.out.println("Pagamento de R$" + valor + " processado com boleto bancário.");
	}
}
