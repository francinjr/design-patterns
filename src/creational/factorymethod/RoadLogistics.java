package creational.factorymethod;

public class RoadLogistics extends Logistics {

	@Override
	Transport createTransport() {
		return new Truck();
	}

}
