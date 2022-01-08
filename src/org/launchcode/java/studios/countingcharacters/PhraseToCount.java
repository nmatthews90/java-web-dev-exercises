package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhraseToCount {
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<Character, Integer> characterCount = new HashMap<>();

        String fileToUse = "C:\\Users\\Natasha\\Documents\\lc101\\java-practice\\java-web-dev-exercises\\src\\org\\launchcode\\java\\studios\\countingcharacters\\texttouse.txt";
        File myObj = new File(fileToUse);
        Scanner phraseInput = new Scanner(myObj);


        System.out.print("Enter phrase to parse: ");
        String phraseToUse = phraseInput.nextLine();

        /*String phraseToUse = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        */
        String phraseCaseInsensitive = phraseToUse.toLowerCase();
        String newReplacedString = phraseCaseInsensitive.replaceAll("[^a-z]", "");


        char[] charactersInString = newReplacedString.toCharArray();

        for (char letters : charactersInString) {
            if (characterCount.containsKey(letters)) {
                characterCount.put(letters, characterCount.get(letters) + 1);
            } else {
                characterCount.put(letters, 1);
            }

        }
        for(Map.Entry<Character, Integer> oneChar : characterCount.entrySet()) {
            System.out.println(oneChar.getKey() + ":" + oneChar.getValue());
        }

    }
}
