package song;

import java.util.List;

import static java.util.Arrays.asList;

public class Song {

    private List<Animal> animals;

    public Song(List<Animal> animals) {
        this.animals = animals;
    }

    public static Song song(Animal... animals) {
        return new Song(asList(animals));
    }

    @Override
    public String toString() {
        return verses() + finalVerse();
    }

    private String verses() {
        String result = "";

        for (int i = 1; i <= animals.size(); i++) {
            List<Animal> verseAnimals = animals.subList(animals.size() - i, animals.size());
            Verse verse = new Verse(verseAnimals);
            result += verse.toString() + "\n";
        }

        return result;
    }

    private String finalVerse() {
        return "There was an old lady who swallowed a horse...\n" +
                "...She's dead, of course!";
    }

}