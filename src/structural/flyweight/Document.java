package structural.flyweight;

public class Document {
    private TextFactory factory;
    private String[] words;

    public Document(TextFactory factory, String[] words) {
        this.factory = factory;
        this.words = words;
    }

    public void print() {
        for (String word : words) {
            Text text = factory.getWord(word);
            text.print(getColor(word));
        }
    }

    private String getColor(String word) {
        if (word.length() % 2 == 0) {
            return "[RED]";
        } else {
            return "[BLUE]";
        }
    }
}
