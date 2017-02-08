package song;

public class FirstVerseSentence implements VerseSentence {
    private Animal animal;

    public FirstVerseSentence(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "There was an old lady who swallowed a " + animal.getName() + ";\n" +
                animal.getTagLine() + "\n";
    }
}