package creational.factorymethod.main;

import creational.factorymethod.Logistics;
import creational.factorymethod.RoadLogistics;
import creational.factorymethod.SeaLogistics;

public class Main {
	public static void main(String[] args) {
		Logistics l1 = new RoadLogistics();
		Logistics l2 = new SeaLogistics();

		l1.planDelivery();
		l2.planDelivery();
	}
}
