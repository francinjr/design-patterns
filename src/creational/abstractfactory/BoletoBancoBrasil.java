package creational.abstractfactory;

public class BoletoBancoBrasil implements Boleto {

	@Override
	public void emitir(Produto produto, double imposto) {
		System.out.println("Banco do Brasil");
		System.out.println("----------------------");
		System.out.println("Descrição: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor: " + produto.getValorUnitario());
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor total: " + produto.getValorTotal(imposto));
	}

}
