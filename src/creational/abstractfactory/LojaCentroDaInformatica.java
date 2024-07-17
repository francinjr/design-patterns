package creational.abstractfactory;

public class LojaCentroDaInformatica implements VendaFactory {

	@Override
	public NFE criarNFE() {
		NFE notaFiscal = new NFESaoPaulo();
		return notaFiscal;
	}

	@Override
	public Boleto criarBoleto() {
		Boleto boleto = new BoletoBancoBrasil();
		return boleto;
	}

}
