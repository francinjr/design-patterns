package behavioral.strategy;

import java.math.BigDecimal;

//Contexto de processamento de pagamento
public class ProcessadorPagamento {
	private PagamentoStrategy estrategia;

	public ProcessadorPagamento(PagamentoStrategy estrategia) {
		this.estrategia = estrategia;
	}

	public void setEstrategia(PagamentoStrategy estrategia) {
		this.estrategia = estrategia;
	}

	public void processarPagamento(BigDecimal valor) {
		estrategia.processarPagamento(valor);
	}
}
