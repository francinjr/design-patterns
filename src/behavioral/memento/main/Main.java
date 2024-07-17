package behavioral.memento.main;

import behavioral.memento.Originador;
import behavioral.memento.Zelador;

public class Main {
	public static void main(String[] args) {
		Originador originador = new Originador();
		Zelador zelador = new Zelador();

		originador.setEstado("Estado 1");

		originador.setEstado("Estado 2");
		zelador.setMemento(originador.salvarEstado());

		originador.setEstado("Estado 3");
		zelador.setMemento(originador.salvarEstado());

		originador.setEstado("Estado 4");

		System.out.println("Estado atual: " + originador.getEstado());

		originador.restaurarEstado(zelador.getMemento());

		System.out.println("Estado restaurado: " + originador.getEstado());
	}
}
