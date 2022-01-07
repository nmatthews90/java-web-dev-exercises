package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class PhraseToCount {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCount = new HashMap<>();

        String phraseToUse = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = phraseToUse.toCharArray();

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
