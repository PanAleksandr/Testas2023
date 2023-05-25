package com.company;

import java.util.Random;

public class Main2 {

        public static void main(String[] args) {
            //  Random funkcija
            Random random = new Random();

            // Masyvo ilgis 100
            int[] numbers = new int[100];

            // random sk
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(1000); // random nuo0 iki 999
            }

            int min = numbers[0]; // pirmas elemntas maziausias
            int max = numbers[0]; // pirmas elemtas didziausias

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i]; // atnaujinams reiksme jeigu maziausias
                }

                if (numbers[i] > max) {
                    max = numbers[i]; // atnajunimas reiksme jeigu didziausias
                }
            }


            System.out.println("Maziausias skaicius" + min);
            System.out.println("Didziausias skaicius: " + max);
        }
    }


