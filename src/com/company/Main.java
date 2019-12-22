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
        Character[] charArray = new Character[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            charArray[i] = userInput.charAt(i);
        }
        Arrays.sort(charArray, Comparator.comparingInt(Character::toLowerCase));
        StringBuilder stringBuilder = new StringBuilder(charArray.length);
        for (Character character : charArray)
            stringBuilder.append(character.charValue());
        System.out.println("String sorted in ascending alphabetical order: ");
        System.out.println(stringBuilder.toString());
        System.out.println("String sorted in descending alphabetical order: ");
        System.out.println(stringBuilder.reverse().toString());
    }
}

