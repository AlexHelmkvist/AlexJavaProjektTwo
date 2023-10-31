package TentaProgramering;


public class TextReader {

    //Klassen som räknar raderna och har
    //koll på antalet tecken.


    private static int lineCount = 0;
    private static int charCount = 0;



    public static void TextReaderLine(String line) {
        lineCount++;
        charCount += line.length();

    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

}

