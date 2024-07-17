package creational.abstractfactory;

public class Venda {
	private NFE notaFiscal;
	private Boleto boleto;

	public Venda(VendaFactory factory) {
		this.notaFiscal = factory.criarNFE();
		this.boleto = factory.criarBoleto();
	}

	public void realizarVenda(Produto produto) {
		double imposto = notaFiscal.calcularImposto(produto);
		boleto.emitir(produto, imposto);
	}
}
