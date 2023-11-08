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
    @Test
    public void testNewLine(){                             //<--- Testa att lägga till en ny värde.
        TextProcessor tx = new TextProcessor();
        tx.textProcessor("Hej Världen");
        assertEquals("Hej Världen",tx.setNewLine());
    }
    @Test
    public void testLineCount(){                            //<--- Testa att det går att räkna antal rader i en ny värde.
        TextProcessor tx = new TextProcessor();
        tx.textProcessor("Hej Världen");
        assertEquals(1,tx.getLineCount());
    }
    @Test
    public void testCharCount(){                             //<--- Testa att det går att räkna antal tecken i en ny värde.
        TextProcessor tx = new TextProcessor();
        tx.textProcessor("Hej Världen");
        assertEquals(11,tx.getCharCount());
    }


}