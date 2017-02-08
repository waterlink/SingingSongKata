package song;

import java.util.List;

public interface VerseSentence {
    String toString();

    static VerseSentence verseSentence(List<Animal> animals, int index) {
        if (index == 0)
            return new FirstVerseSentence(animals.get(0));

        if (index == animals.size() - 1)
            return new LastVerseSentence(animals.get(index - 1), animals.get(index));

        return new MiddleVerseSentence(animals.get(index - 1), animals.get(index));
    }
}
