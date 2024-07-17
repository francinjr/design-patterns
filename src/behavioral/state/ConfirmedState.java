package behavioral.state;

//Implementação do estado "confirmado"
public class ConfirmedState implements OrderState {
 @Override
 public void confirm(Order order) {
     System.out.println("O pedido já foi confirmado.");
 }

 @Override
 public void ship(Order order) {
     System.out.println("Pedido enviado.");
     order.setState(new ShippedState());
 }
}
