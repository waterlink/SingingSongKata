package song;

public class MiddleVerseSentence implements VerseSentence {
    private final Animal previous;
    private final Animal current;

    public MiddleVerseSentence(Animal previous, Animal current) {
        this.previous = previous;
        this.current = current;
    }

    @Override
    public String toString() {
        return "She swallowed the " + previous.getName() + " to catch the " + current.getName() + ",\n";
    }
}