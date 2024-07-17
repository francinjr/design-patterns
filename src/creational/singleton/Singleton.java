package creational.singleton;

public class Singleton {
	private static Singleton instance;

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	private Singleton() {
	}

	public String getMessage() {
		return "Testando o singleton";
	}
}
