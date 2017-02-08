package song;

public class Animal {
    private final String name;
    private final String tagLine;

    public Animal(String name, String tagLine) {
        this.name = name;
        this.tagLine = tagLine;
    }

    public static Animal animal(String name, String tagLine) {
        return new Animal(name, tagLine);
    }

    public String getName() {
        return name;
    }

    public String getTagLine() {
        return tagLine;
    }
}
