package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStringUtils {

    @Test
    void testDistanceChatChats() {

        int resultat = StringUtils.levenshteinDistance("chat", "chats");

        assertEquals(1, resultat);
    }

    @Test
    void testDistanceDistanceInstance() {
        int resultat = StringUtils.levenshteinDistance("distance", "instance");

        assertEquals(2, resultat);
    }

    @Test
    void testDistanceChienChine() {
        int resultat = StringUtils.levenshteinDistance("Chien", "Chine");

        assertEquals(2, resultat);
    }

    @Test
    void testDeuxiemeParametreNull() {

        assertThrows(
                IllegalArgumentException.class,
                () -> StringUtils.levenshteinDistance("Java", null)
        );
    }

    @Test
    void testPremierParametreNull() {

        assertThrows(
                IllegalArgumentException.class,
                () -> StringUtils.levenshteinDistance(null, "Java")
        );
    }

    @Test
    void testDeuxParametresNull() {

        assertThrows(
                IllegalArgumentException.class,
                () -> StringUtils.levenshteinDistance(null, null)
        );
    }

    @Test
    void testMotsIdentiques() {
        assertEquals(0, StringUtils.levenshteinDistance("Java", "Java"));
    }

    @Test
    void testMotVide() {
        assertEquals(4, StringUtils.levenshteinDistance("", "Java"));
    }




}
