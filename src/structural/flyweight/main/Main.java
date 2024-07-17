package structural.flyweight.main;

import structural.flyweight.Document;
import structural.flyweight.TextFactory;

public class Main {
    public static void main(String[] args) {
        String[] words = { "hello", "world", "hello", "java", "flyweight" };

        TextFactory factory = new TextFactory();
        Document document = new Document(factory, words);

        document.print();
    }
}
