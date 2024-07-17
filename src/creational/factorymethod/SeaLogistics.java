package creational.factorymethod;

public class SeaLogistics extends Logistics {

	@Override
	Transport createTransport() {
		return new Ship();
	}
}
