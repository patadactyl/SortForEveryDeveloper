package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a new string of alphabetical characters: ");
            String userInputString = scanner.nextLine();
            System.out.println("String sorted in alphabetical order: ");
            alphabeticalSort(userInputString);
            System.out.println("String sorted in reverse alphabetical order: ");
            reverseAlphabeticalSort(userInputString);
        }
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

    public static void reverseAlphabeticalSort(String userInputReverse) {
        char[] reverseCharacterArray = userInputReverse.toCharArray();
        int length = reverseCharacterArray.length;
        char tempChar;
        for (int i = 0; i < length / 2; i++)
        {
            tempChar = reverseCharacterArray[i];
            reverseCharacterArray[i] = reverseCharacterArray[length - i - 1];
            reverseCharacterArray[length - i - 1] = tempChar;
        }
        System.out.println(userInputReverse);
    }
}

