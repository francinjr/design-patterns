package creational.factorymethod;

public abstract class Logistics {
	abstract Transport createTransport();

	public void planDelivery() {
		Transport t = createTransport();
		t.deliver();
	}
}
