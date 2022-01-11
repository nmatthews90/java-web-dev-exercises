package org.launchcode.java.studios.countingcharacters;


import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileChooser {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        JFileChooser chooser = new JFileChooser();

//        FileNameExtensionFilter filter = new FileNameExtensionFilter(
//                "Text Files", "txt");
//
//        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {

            System.out.println(chooser.getSelectedFile().getAbsolutePath());

            String fileToUse = chooser.getSelectedFile().getAbsolutePath();
            File myObj = new File(fileToUse);
            Scanner phraseInput;
            phraseInput = new Scanner(myObj);

            String phraseToUse = phraseInput.nextLine();

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

}
