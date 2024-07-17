package behavioral.iterator.main;

import behavioral.iterator.CollectionOfNames;
import behavioral.iterator.Iterator;

public class Main {
	public static void main(String[] args) {
		CollectionOfNames collectionNames = new CollectionOfNames();
		
		Iterator iterator = collectionNames.getIterator();
		
		while(iterator.hasNext()) {
			System.out.println("Name: " + iterator.next());
		}
		
	}
}
