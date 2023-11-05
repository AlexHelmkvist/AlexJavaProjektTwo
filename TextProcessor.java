package TentaProgramering;


// Klass för att räkna raderna och ha koll på antalet tecken.
class TextProcessor {

    private int lineCount = 0;
    private int charCount = 0;

    public void textProcessor(String line) {
        this.lineCount++;
        this.charCount += line.length();

    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public String setNewLine (){
        return "Hej Världen";

    }



}

