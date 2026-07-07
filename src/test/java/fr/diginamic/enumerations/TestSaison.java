package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestSaison {

    @Test
    void testValueOfLibellePrintemps() {

        Saison resultat = Saison.valueOfLibelle("Printemps");
        assertEquals(Saison.PRINTEMPS, resultat);

    }

    @Test
    void testValueOfLibelleEte() {

        Saison resultat = Saison.valueOfLibelle("Eté");
        assertEquals(Saison.ETE, resultat);

    }

    @Test
    void testValueOfLibelleAutomne() {

        Saison resultat = Saison.valueOfLibelle("Automne");
        assertEquals(Saison.AUTOMNE, resultat);

    }

    @Test
    void testValueOfLibelleHiver() {

        Saison resultat = Saison.valueOfLibelle("Hiver");
        assertEquals(Saison.HIVER, resultat);

    }

    @Test
    void testValueOfLibelleInconnu() {

        Saison resultat = Saison.valueOfLibelle("Truc");

        assertNull(resultat);
    }

    @Test
    void testValueOfLibelleSansParam() {

        Saison resultat = Saison.valueOfLibelle("");

        assertNull(resultat);
    }



}
