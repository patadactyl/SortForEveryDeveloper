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
            alphabeticalSort(userInputString);
        }
    }

    public static void alphabeticalSort(String userInput) {
        int length = userInput.length();
        Character[] characterArray = new Character[length];
        for (int i = 0; i < length; i++) {
            characterArray[i] = userInput.charAt(i);
        }
        Arrays.sort(characterArray, Comparator.comparingInt(Character::toLowerCase));
        StringBuilder stringBuilder = new StringBuilder(length);
        for (Character character : characterArray)
            stringBuilder.append(character.charValue());

        System.out.println("String sorted in ascending alphabetical order: ");
        System.out.println(stringBuilder.toString());
        System.out.println("String sorted in descending alphabetical order: ");
        System.out.println(stringBuilder.reverse().toString());
    }
}

