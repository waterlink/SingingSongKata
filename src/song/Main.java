package song;

import static song.Animal.animal;
import static song.Song.song;

public class Main {

    public static void main(String[] args) {
        Song song = song(
                animal("cow", "I don't know how she swallowed a cow!"),
                animal("dog", "What a hog, to swallow a dog!"),
                animal("cat", "Fancy that to swallow a cat!"),
                animal("bird", "How absurd to swallow a bird."),
                animal("spider", "That wriggled and wiggled and tickled inside her."),
                animal("fly", "perhaps she'll die!")
        );

        System.out.println(song);
    }

}
