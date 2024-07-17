package behavioral.state;

//Implementação do estado "enviado"
public class ShippedState implements OrderState {
	@Override
	public void confirm(Order order) {
		System.out.println("Não é possível confirmar um pedido enviado.");
	}

	@Override
	public void ship(Order order) {
		System.out.println("O pedido já foi enviado.");
	}
}
