package structural.adapter.main;

import structural.adapter.Car;
import structural.adapter.Movable;
import structural.adapter.MovableAdapter;
import structural.adapter.MovableAdapterImpl;

public class Main {
	public static void main(String[] args) {
		Movable ferrari = new Car();

		System.out.println("Velocidade " + ferrari.getSpeed() + " MPH!\n");

		MovableAdapter ferrariAdaptada = new MovableAdapterImpl(ferrari);

		System.out.println("Velocidade " + ferrariAdaptada.getSpeed() + " KMH!");
	}
}
