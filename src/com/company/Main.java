package com.company;

import java.util.Scanner;

public class Main {


        public static String igra() {
                int sum1 = 0, sum2 = 0, myint1 = 0, myint2 = 0;
                Scanner keyboard1 = new Scanner(System.in);
                Scanner keyboard2 = new Scanner(System.in);
                do {
                        System.out.println("Введите количество очков для 1 команды");
                        myint1 = keyboard1.nextInt();
                        System.out.println("Введите количество очков для 2 команды");
                        myint2 = keyboard2.nextInt();
                        if (myint1 > 0 & myint1 < 4 & myint2 > 0 & myint2 < 4) {
                                sum1 += myint1;
                                sum2 += myint2;
                        } else {
                                System.out.println("Допустимые значения превышены. Выход из игры.");
                                myint1 = 0;
                                System.out.println("Счет игры: " + sum1 + " : " + sum2);
                        }

                } while (myint1 > 0 & myint2 > 0);
                return "Счет игры: " + Integer.toString(sum1) + " : " + Integer.toString(sum2);
        }

        public static void main(String args[]) {
                igra();
        }

}

