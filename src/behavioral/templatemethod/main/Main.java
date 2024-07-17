package behavioral.templatemethod.main;

import behavioral.templatemethod.CasaAlvenaria;
import behavioral.templatemethod.CasaMadeira;
import behavioral.templatemethod.ConstrucaoCasa;

public class Main {
	public static void main(String[] args) {
		ConstrucaoCasa casaMadeira = new CasaMadeira();
		System.out.println("Construindo casa de madeira: ");
		casaMadeira.construirCasa();

		System.out.println();

		ConstrucaoCasa casaAlvenaria = new CasaAlvenaria();
		System.out.println("Construindo casa de alvenaria: ");
		casaAlvenaria.construirCasa();
	}
}
