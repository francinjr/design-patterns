package behavioral.state.main;

import behavioral.state.Order;

//Exemplo de uso do padrão State para um pedido online
public class Main {
	public static void main(String[] args) {
		// Instanciando um pedido
		Order order = new Order();

		// Simulando o fluxo do pedido
		order.confirm();
		order.ship();
		order.confirm(); // Tentativa de confirmar um pedido já enviado
		order.ship(); // Tentativa de enviar um pedido já enviado
	}
}
