package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextFactory {
    private Map<String, Text> words = new HashMap<>();

    public Text getWord(String word) {
        Text text = words.get(word);

        if (text == null) {
            text = new Word(word);
            words.put(word, text);
        }
        return text;
    }
}
