package behavioral.state;

//Interface que define os comportamentos comuns para todos os estados do pedido
interface OrderState {
    void confirm(Order order);
    void ship(Order order);
}
