package song;

import java.util.List;

public interface Verse {
    static Verse verse(List<Animal> animals) {
        if (animals.size() == 1)
            return new FirstVerse(animals.get(0));

        return new NormalVerse(animals);
    }

    String toString();
}
