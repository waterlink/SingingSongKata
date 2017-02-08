package song;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static song.Animal.animal;
import static song.Verse.verse;

public class NormalVerseTest {
    @Test
    void toString_forFly() {
        Verse verse = verse(Collections.singletonList(
                animal("fly", "perhaps she'll die!"))
        );

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }

    @Test
    void toString_forBee() {
        Verse verse = verse(Collections.singletonList(
                animal("bee", "perhaps she'll flee!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a bee.\n" +
                        "I don't know why she swallowed a bee - perhaps she'll flee!\n",
                representation);
    }

    @Test
    void toString_forFly_andSpider() {
        Verse verse = verse(Arrays.asList(
                animal("spider", "That wriggled and wiggled and tickled inside her."),
                animal("fly", "perhaps she'll die!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }

    @Test
    void toString_forFly_andSpider_andBird() {
        Verse verse = verse(Arrays.asList(
                animal("bird", "How absurd to swallow a bird."),
                animal("spider", "not important"),
                animal("fly", "perhaps she'll die!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a bird;\n" +
                        "How absurd to swallow a bird.\n" +
                        "She swallowed the bird to catch the spider,\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }

    @Test
    void toString_forFly_andCamel_andBee() {
        Verse verse = verse(Arrays.asList(
                animal("bee", "How absurd to swallow a bee."),
                animal("camel", "not important"),
                animal("fly", "perhaps she'll die!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a bee;\n" +
                        "How absurd to swallow a bee.\n" +
                        "She swallowed the bee to catch the camel,\n" +
                        "She swallowed the camel to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }

    @Test
    void toString_forMoreStuff() {
        Verse verse = verse(Arrays.asList(
                animal("cow", "I don't know how she swallowed a cow!"),
                animal("dog", "not important"),
                animal("cat", "not important"),
                animal("bird", "not important"),
                animal("spider", "not important"),
                animal("fly", "perhaps she'll die!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a cow;\n" +
                        "I don't know how she swallowed a cow!\n" +
                        "She swallowed the cow to catch the dog,\n" +
                        "She swallowed the dog to catch the cat,\n" +
                        "She swallowed the cat to catch the bird,\n" +
                        "She swallowed the bird to catch the spider,\n" +
                        "She swallowed the spider to catch the fly;\n" +
                        "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }
}
