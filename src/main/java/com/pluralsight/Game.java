package com.pluralsight;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = myObj.nextLine();

        String[] splitByPipe = input.split("\\|");
        String[] teams = splitByPipe[0].split(":");
        String[] scores = splitByPipe[1].split(":");

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        if (score1 > score2) {
            System.out.println("Winner " + teams[0]);
        }
        else {
            System.out.println("Winner " + teams[1]);
        }
        myObj.close();
    }
}
