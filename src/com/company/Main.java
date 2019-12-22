package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static int MAX_CHAR = 26;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("String sorted in alphabetical order: ");
        alphabeticalSort(string);


        System.out.println("String sorted in reverse alphabetical order: ");
        reverseAlphabeticalSort(string);
    }

    public static void alphabeticalSort(String userInput) {

        Character[] charArray = new Character[userInput.length()];

        for (int i = 0; i < userInput.length(); i++) {
            charArray[i] = userInput.charAt(i);
        }

        Arrays.sort(charArray, Comparator.comparingInt(Character::toLowerCase));

        StringBuilder stringBuilder = new StringBuilder(charArray.length);
        for (Character character : charArray)
            stringBuilder.append(character.charValue());

        System.out.println(stringBuilder.toString());
    }

    public static void reverseAlphabeticalSort(String userInput) {
        int countingHashArray[] = new int[MAX_CHAR];

        for (int i = 0; i < userInput.length(); i++) {
            countingHashArray[userInput.charAt(i) - 'a']++;
        }

        for (int i = MAX_CHAR - 1; i >= 0; i--) {
            for (int j = 0; j < countingHashArray[i]; j++) {
                System.out.print((char) ('a' + i));
            }
        }
    }
}

