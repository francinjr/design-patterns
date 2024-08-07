package creational.abstractfactory;

import java.math.BigDecimal;

public class NFESaoPaulo implements NFE {

	@Override
	public double calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.18");

		imposto = imposto.multiply(produto.getValorUnitario());
		return imposto.doubleValue();
	}

}
