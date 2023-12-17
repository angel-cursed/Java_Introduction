package net.angel_cursed;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and welcome to this trivia game");

        System.out.println("first question what is the capital of france ?");

        String response = scan.next();

        if (response.equals("paris") || response.equals("Paris")){
            System.out.println("Well done this is the good answer!");
            score ++;
        }
        else {
            System.out.println("Sorry you do not have the good answer.");
            System.out.println("The good answer was: Paris");
        }

        System.out.println("Next: 6 X 5");

        response = scan.next();

        if (response.equals("30")){
            System.out.println("Well done this is the good answer!");
            score ++;
        }
        else {
            System.out.println("Sorry you do not have the good answer.");
            System.out.println("The good answer was: 30");
        }

        System.out.println("Last question: how many days have we in a week ?");

        response = scan.next();

        if (response.equals("7")){
            System.out.println("Well done this is the good answer!");
            score ++;
        }
        else {
            System.out.println("Sorry you do not have the good answer.");
            System.out.println("The good answer was: 7");
        }

        System.out.printf("Good job! You have %d/3 points", score);

    }
}
