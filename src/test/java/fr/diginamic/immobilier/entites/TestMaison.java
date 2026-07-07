package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMaison {

    @Test
    void testAjoutDePiece() {

        Maison maison = new Maison();
        SalleDeBain sdb = new SalleDeBain(1, 50.5);


        assertEquals(0, maison.nbPieces());

        maison.ajouterPiece(sdb);

        int resultat = maison.nbPieces();

        assertEquals(1, resultat);

    }

    @Test
    void testNombreDePiecesMaisonVide() {

        Maison maison = new Maison();

        assertEquals(0, maison.nbPieces());
    }

    @Test
    void testSuperficieEtage() {
        Maison maison = new Maison();

        double resultat = maison.superficieEtage(1);

        assertEquals(0, resultat);
        SalleDeBain sdb = new SalleDeBain(1, 50.5);
        maison.ajouterPiece(sdb);

        double resultat2 = maison.superficieEtage(1);

        assertEquals(50.5, resultat2);

    }

    @Test
    void testSuperficieTypePiece() {

    }




}
