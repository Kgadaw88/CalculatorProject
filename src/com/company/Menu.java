package com.company;

import java.util.Scanner;

public class Menu {
    private static int[] loadNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ile elementów ma zawierać tablica: ");
        int arraySize = scanner.nextInt();

        int[] numberList = new int[arraySize];
        System.out.print("Podaj elementy tablicy, rozdzielając je spacją: ");

        for (int i = 0; i < numberList.length; i++){
            numberList[i] = scanner.nextInt();
        }
        return numberList;
    }

    public static void main(String[] args) {
        int[] multiDivSub = loadNumbers();
        
    }
}
