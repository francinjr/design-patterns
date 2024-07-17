package behavioral.strategy;

import java.math.BigDecimal;

//Interface para as estratégias de pagamento
public interface PagamentoStrategy {
	void processarPagamento(BigDecimal valor);
}
