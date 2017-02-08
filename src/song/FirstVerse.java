package song;

public class FirstVerse implements Verse {
    private Animal animal;

    public FirstVerse(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "There was an old lady who swallowed a " + animal.getName() + ".\n" +
                "I don't know why she swallowed a " + animal.getName() + " - " + animal.getTagLine() + "\n";
    }
}
