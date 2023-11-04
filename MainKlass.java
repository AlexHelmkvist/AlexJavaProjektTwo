package TentaProgramering;

import java.util.Scanner;
public class MainKlass {

    //Klassen som läser in text och skriver ut
    //resultatet till användaren.
    //Kontroll att användare skrev ordet 'stop'utföras i den här klassen.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv (skriv 'stop' för att avsluta):");
        TextReader processor = new TextReader();


        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            TextReader.TextReaderLine(line);
        }

        System.out.println("Hej");
        System.out.println("Antal rader: " + processor.getLineCount());
        System.out.println("Antal tecken: " + processor.getCharCount());

    }


}