package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static double scannerDouble(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

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

    private static boolean logged(){
        Scanner scanner = new Scanner(System.in);
        String userAccept = "w";
        String passwordAccept = "a";

        String user;
        String password;

        do {
            System.out.print("Podaj nazwę użytkownia: ");
            user = scanner.next();

            System.out.print("Podaj hasło: ");
            password = scanner.next();

        } while (!user.equalsIgnoreCase(userAccept) || !password.equals(passwordAccept));
        System.out.println("");
//        System.out.print("Zalogowałeś się.");
        return true;
    }

    private static int menu(){
        System.out.println("1. Dodawanie wybranej ilości elementów do siebie");
        System.out.println("2. Mnożenie / dzielenie / odejmowanie zadeklarowanych elementów");
        System.out.println("3. Pierwiastkowanie podanej liczby");
        System.out.println("4. Potęga  dowolnego stopnia podanej liczby");
        System.out.println("5. Zmiana podanych liczb na system 2 / 8 / 16");
        System.out.println("6. Obliczenie mediany i średniej artymetycznej podanych liczb\n");
        System.out.print("Podaj numer operacji jaki chcesz wykonać: ");

        Scanner scanner = new Scanner(System.in);
        int choiceNumber = scanner.nextInt();
        return choiceNumber;
    }

    private static int sumArrayList(){
        int[] sumNumbers = loadNumbers();
        // sumowanie elementów tablicy
        int sum = 0;
        for (int i = 0; i < sumNumbers.length; i++){
            sum += sumNumbers[i];
        }
        return sum;
    }  // case 1

    private static double sqrtLvlN(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę z której ma być wyciągany pierwiastek: ");
        int numberSqrt = scanner.nextInt();

        System.out.print("Podaj stopień pierwiastka: ");
        double lvlSqrt = scanner.nextDouble();
        double result = Math.pow(numberSqrt, 1/lvlSqrt);

        System.out.format("%.4f%n", result);
        return result;
    } // case 3

    private static double powerCalculate(){
        System.out.print("Podaj wykładniek potęgi: ");
        double indexInvolution = scannerDouble();

        System.out.print("Podaj potęgowaną liczbę: ");
        double exponent = scannerDouble();
        double result;

        result = Math.pow(exponent, indexInvolution);
        System.out.format("Wynik potęgowania to: " + result, "%.4f%n");

        return result;
    } // case 4

    private static int convertToBinHex16(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę w systemie dziesiętnym: ");
        int decimalNumber = scanner.nextInt();

        System.out.print("Liczba " + decimalNumber + " w systemie dwójkowym to: " + Integer.toString(decimalNumber, 2));
        System.out.print("Liczba " + decimalNumber + " w ósemkowym to: " + Integer.toString(decimalNumber, 8));
        System.out.print("Liczba " + decimalNumber + " w szesnastkowym binarnym to: " + Integer.toString(decimalNumber, 16));
        return decimalNumber;
    } //case 5

    private static double medianaAndAvg(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ile elementów ma zawierać tablica: ");
        int arraySize = scanner.nextInt();

        double[] arrayList = new double[arraySize];

        System.out.print("Podaj elementy tablicy, rozdzielając je spacją: ");
        for (int i = 0; i < arrayList.length; i++){
            arrayList[i] = scanner.nextInt();
        }

        // sumowanie elementów tablicy
        int sum = 0;
        for (int i = 0; i < arraySize; i++){
            sum += arrayList[i];
        }

//        średnia arytmetyczna
        double avg = sum / arrayList.length;

//        oblicznie medeiany

        double mediana = 0;
        Arrays.sort(arrayList);
        if (arrayList.length % 2 == 0){
            mediana = arrayList[arrayList.length / 2] + arrayList[(arrayList.length / 2) - 1] / 2;
        }else{
            mediana = arrayList[arrayList.length / 2];
        }
        System.out.format("Srednia arytmetyczna zbioru wynosi: " + avg+"\n", "%.2f%n");
        System.out.format("Mediana zbioru wynosi: " + mediana, "%.2f%n");

        return mediana;
    } // case 6


    public static void main(String[] args) {

        if(logged()){
            int choice = menu();
            switch (choice){
                case 1:
                    System.out.print("Suma podanych elementów w tablicy wynosi: " + sumArrayList());
                    break;
                case 2:
                    System.out.print("test 2");
                    break;
                case 3:
                    sqrtLvlN();
                    break;
                case 4:
                    powerCalculate();
                    break;
                case 5:
                    convertToBinHex16();
                    break;
                case 6:
                    medianaAndAvg();
                    break;
            }
        }
    }
}
