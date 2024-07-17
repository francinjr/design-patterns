package structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCar;

	public MovableAdapterImpl(Movable ferrari) {
		this.luxuryCar = ferrari;
	}

	@Override
	public double getSpeed() {
		return convertMPHToKMH(luxuryCar.getSpeed());
	}

	private double convertMPHToKMH(double mph) {
		return mph * 1.60934;
	}

}
