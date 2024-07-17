package behavioral.iterator;

public class CollectionOfNamesIterator implements Iterator {

	String[] name;
	int i;
	
	public CollectionOfNamesIterator(String[] name) {
		this.name = name;
	}
	
	@Override
	public boolean hasNext() {
		if(i < name.length) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			return name[i++];
		}
		return null;
	}
	
}
