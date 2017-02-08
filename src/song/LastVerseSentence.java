package song;

public class LastVerseSentence implements VerseSentence {
    private final Animal previous;
    private final Animal last;

    public LastVerseSentence(Animal previous, Animal last) {
        this.previous = previous;
        this.last = last;
    }

    @Override
    public String toString() {
        return "She swallowed the " + previous.getName() + " to catch the " + last.getName() + ";\n" +
                "I don't know why she swallowed a " + last.getName() + " - " + last.getTagLine() + "\n";
    }
}