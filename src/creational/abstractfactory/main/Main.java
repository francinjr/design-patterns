package creational.abstractfactory.main;

import java.math.BigDecimal;

import creational.abstractfactory.LojaCentroDaInformatica;
import creational.abstractfactory.Produto;
import creational.abstractfactory.Venda;
import creational.abstractfactory.VendaFactory;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto();

		produto.setNome("Galaxy Samsung");
		produto.setQuantidade(1);
		produto.setValorUnitario(new BigDecimal(1200));

		VendaFactory factory = new LojaCentroDaInformatica();

		Venda venda = new Venda(factory);
		venda.realizarVenda(produto);
	}
}
