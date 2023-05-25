package com.company;

public class Main4 {

        public static void main(String[] args) {
            String text = "Programuotojo ar tiesiog bet kokio IT specialisto profesija taps vis labiau įprasta.";


            text = text.toLowerCase(); //text-> mazasias raides

            int balsiuSkaicius = 0;
            int priebalsiuSkaicius = 0;

            for (int i = 0; i < text.length(); i++) {
                char simbolis = text.charAt(i);


                if (Character.isLetter(simbolis)) {  //patikrina ar raide

                    if (yraBalse(simbolis)) {       //patikrina ar balse
                        balsiuSkaicius++;          //+
                    } else {
                        priebalsiuSkaicius++;
                    }
                }
            }

            System.out.println("Balsių skaičius: " + balsiuSkaicius);
            System.out.println("Priebalsių skaičius: " + priebalsiuSkaicius);
        }


        private static boolean yraBalse(char simbolis) {   //patikrina ar simbolis yra balse
            simbolis = Character.toLowerCase(simbolis);

            return simbolis == 'a' || simbolis == 'e' || simbolis == 'i' || simbolis == 'o' || simbolis == 'u';
        }
    }



