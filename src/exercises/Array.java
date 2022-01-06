package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbersArray = { 1, 1, 2, 3, 5, 8};

        for (int i : numbersArray) {
            if (i % 2 != 0) {
                //System.out.println(i);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        //System.out.println(Arrays.toString(words));


        String[] sentences = phrase.split("\\.");
        //System.out.println(Arrays.toString(sentences));

        ArrayList<Integer> numbersList = new ArrayList<>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        numbersList.add(6);
        numbersList.add(7);
        numbersList.add(8);
        numbersList.add(9);
        numbersList.add(10);
        int sumOfAllEvens = sumEven(numbersList);
        System.out.println(sumOfAllEvens);

        ArrayList<String> stringList = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        System.out.println("enter the word length for the search:");
        Double lengthToUseForSearch = input.nextDouble();

        stringList.add("The");
        stringList.add("quick");
        stringList.add("brown");
        stringList.add("fox");
        //System.out.println(stringList);
        System.out.println(printWords(stringList, lengthToUseForSearch));

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(words));

        // Now print the ArrayList
        //for (String s : strList) {
        //System.out.println(s);
        // }

        System.out.println(printWords(strList, lengthToUseForSearch));




    }


    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> printWords(ArrayList<String> arr, Double lengthToUseForSearch) {

        ArrayList<String> modList = new ArrayList<>();

        for (String string : arr) {
            //if (string.length() == 5) {
            if (string.length() == lengthToUseForSearch) {
                modList.add(string);
            }
        }
        return modList;
    }



}
