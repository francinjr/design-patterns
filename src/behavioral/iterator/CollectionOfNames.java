package behavioral.iterator;

public class CollectionOfNames implements Container {

	public String name[] = { "Knopfler", "Mercury", "Noel" };
	
	@Override
	public Iterator getIterator() {
		return new CollectionOfNamesIterator(name);
	}
	
}
