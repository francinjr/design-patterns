package behavioral.state;

//Implementação do estado "pendente"
public class PendingState implements OrderState {
	@Override
	public void confirm(Order order) {
		System.out.println("Pedido confirmado.");
		order.setState(new ConfirmedState());
	}

	@Override
	public void ship(Order order) {
		System.out.println("Não é possível enviar um pedido pendente.");
	}
}
