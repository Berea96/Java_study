package com.java.study;

public class Main {

    public static void main(String[] args) {
        String [] s = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String [] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int x = (int)(Math.random() * 4);
        System.out.println(s[x]);

        for(int i = 0; i < 5; ++i) {
            int y = (int) (Math.random() * 13);

            System.out.println(number[y]);
        }

        int i = 0;

        while(true) {

            if (i >= 5) break;

            int y = (int) (Math.random() * 13);

            System.out.println(number[y]);

            i++;
        }
    }
}
