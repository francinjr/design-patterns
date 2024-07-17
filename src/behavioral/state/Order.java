package behavioral.state;
//Classe de pedido que mantém o estado atual
public class Order {
	private OrderState state;

	public Order() {
		state = new PendingState(); // Estado inicial
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public void confirm() {
		state.confirm(this);
	}

	public void ship() {
		state.ship(this);
	}
}
