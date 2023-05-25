package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main3 {

        public static void main(String[] args) {
            int[] numbers = new int[100]; // create array
            Random random = new Random(); // create random

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            // numeriu saugykla
            Set<Integer> duplicates = new HashSet();


            Set<Integer> uniqueNumbers = new HashSet();

            // kiekvinas sk
            for (int number : numbers) {

                if (!uniqueNumbers.add(number)) {//jeigu dubliojancius->duplicate
                    duplicates.add(number);
                }
            }


            System.out.println("Besidubliuojanciai skaiciai masyve:");
            for (int duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }
