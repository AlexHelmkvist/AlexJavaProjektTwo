package TentaProgramering;

import java.util.Scanner;

public class MainTentaTest {
    // Huvudklassen som läser in text och skriver ut resultatet

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextProcessor tx = new TextProcessor();
        System.out.println("Skriv in text (eller 'stop' för att avsluta):");
        String line = scanner.nextLine();


        while (!line.equalsIgnoreCase("stop")) {
            tx.textProcessor(line);
            line = scanner.nextLine();

        }

        System.out.println("Antal rader: " + tx.getLineCount());
        System.out.println("Antal tecken: " + tx.getCharCount());

    }