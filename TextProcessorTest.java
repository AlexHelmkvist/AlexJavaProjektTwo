package TentaProgramering;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    public void testConstructor() {

        TextProcessor tx = new TextProcessor();         //<--- Testa att konstruktorn initierar instansvariablerna till noll.
        assertEquals(0, tx.getLineCount());
        assertEquals(0, tx.getCharCount());
    }

    @Test
    public void textProcessor() {                      //<--- Testa att textProcessor-metoden ökar antalet rader och tecken korrekt.
        TextProcessor tx = new TextProcessor();
        tx.textProcessor("Hej");
        assertEquals(1,tx.getLineCount());
        assertEquals(3,tx.getCharCount());
        tx.textProcessor("Världen");
        assertEquals(2,tx.getLineCount());
        assertEquals(10,tx.getCharCount());

    }

    @Test
    public void testAddEmptyline() {                           //<--- Testa att textProcessor-metoden hanterar tomma rader.
        TextProcessor tx = new TextProcessor();
        tx.textProcessor("");
        assertEquals(1,tx.getLineCount());
        assertEquals(0,tx.getCharCount());

    }

}