package song;

import java.util.List;

public class Verse {

    private List<Animal> animals;

    public Verse(List<Animal> animals) {
        this.animals = animals;
    }

    public String toString() {
        Animal first = animals.get(0);

        if (animals.size() == 1)
            return "There was an old lady who swallowed a " + first.getName() + ".\n" +
                    "I don't know why she swallowed a " + first.getName() + " - " + first.getTagLine() + "\n";

        String result = "There was an old lady who swallowed a " + first.getName() + ";\n" +
                first.getTagLine() + "\n";


        for (int i = 1; i < animals.size() - 1; i++) {
            Animal previous = animals.get(i - 1);
            Animal current = animals.get(i);
            result += "She swallowed the " + previous.getName() + " to catch the " + current.getName() + ",\n";
        }

        Animal previous = animals.get(animals.size() - 2);
        Animal last = animals.get(animals.size() - 1);

        result += "She swallowed the " + previous.getName() + " to catch the " + last.getName() + ";\n" +
                "I don't know why she swallowed a " + last.getName() + " - " + last.getTagLine() + "\n";

        return result;
    }
}
