package structural.flyweight;

public class Word implements Text {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void print(String color) {
        System.out.print(color + word + " ");
    }
}
