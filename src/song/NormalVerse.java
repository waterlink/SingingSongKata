package song;

import java.util.List;

import static song.VerseSentence.verseSentence;

public class NormalVerse implements Verse {

    private List<Animal> animals;

    public NormalVerse(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < animals.size(); i++)
            result += verseSentence(animals, i).toString();

        return result;
    }

}
