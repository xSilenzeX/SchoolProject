

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse KommentarTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KommentarTest
{
    private Produkt produkt1;
    private Produkt produkt2;

    /**
     * Konstruktor fuer die Test-Klasse KommentarTest
     */
    public KommentarTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        produkt1 = new Produkt("Auto", 200000);
        produkt2 = new Produkt("Roller", 60000);
        produkt1.kommentarHinzufuegen("David", "Schnelles Auto, für wenig Geld", 4);
        produkt2.kommentarHinzufuegen("Oliver", "Super Roller", 4);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testZweiKommentare()
    {
        Produkt produkt1 = new Produkt("Netzteil", 5000);
        assertEquals(true, produkt1.kommentarHinzufuegen("David", "Tolles Netzteil, gute Effizienz", 5));
        assertEquals(true, produkt1.kommentarHinzufuegen("Oliver", "Schreckliches Netzteil, ist mir in die Luft geflogen. Hab eine Föhnfrisur bekommen", 1));
        assertEquals(2, produkt1.gibAnzahlKommentare());
    }

    @Test
    public void testNullPunkte()
    {
        assertEquals(false, produkt2.kommentarHinzufuegen("David", "Voll Schrott", 0));
    }
}


