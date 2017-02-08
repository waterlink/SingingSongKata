package song;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerseTest {
    @Test
    void toString_forFly() {
        Verse verse = new Verse(Collections.singletonList(
                new Animal("fly", "perhaps she'll die!"))
        );

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n",
                representation);
    }

    @Test
    void toString_forBee() {
        Verse verse = new Verse(Collections.singletonList(
                new Animal("bee", "perhaps she'll flee!")
        ));

        String representation = verse.toString();

        assertEquals("There was an old lady who swallowed a bee.\n" +
                        "I don't know why she swallowed a bee - perhaps she'll flee!\n",
                representation);
    }

    @Test
    void toString_forFly_andSpider() {
        Verse verse = new Verse(Arrays.asList(
                new Animal("spider", "That wriggled and wiggled and tickled inside her."),
                new Animal("fly", "perhaps she'll die!")
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
        Verse verse = new Verse(Arrays.asList(
                new Animal("bird", "How absurd to swallow a bird."),
                new Animal("spider", "not important"),
                new Animal("fly", "perhaps she'll die!")
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
        Verse verse = new Verse(Arrays.asList(
                new Animal("bee", "How absurd to swallow a bee."),
                new Animal("camel", "not important"),
                new Animal("fly", "perhaps she'll die!")
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
        Verse verse = new Verse(Arrays.asList(
                new Animal("cow", "I don't know how she swallowed a cow!"),
                new Animal("dog", "not important"),
                new Animal("cat", "not important"),
                new Animal("bird", "not important"),
                new Animal("spider", "not important"),
                new Animal("fly", "perhaps she'll die!")
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
