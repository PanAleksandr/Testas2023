package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// sukurtas scanner kuris skaito kas parasyta

        System.out.print("Iveskite zodi ");    //
        String word = scanner.nextLine();   //String nes zodis, zodi->word

        String reversedWord = reverseWord(word); //create reversed
        System.out.println("Zodis pateiktas atbuline tvarka " + reversedWord);
    }
//sukurtas metodas
    private static String reverseWord(String word) {
        String reversed = "";  //bus patalpinti simboliai


        for (int i = word.length() - 1; i >= 0; i--) { //atvirkstine tvarka
            char c = word.charAt(i); //gaunam simboli

            reversed += c; //pridedam simboli i prieki revesed
        }

        return reversed;
}
}


