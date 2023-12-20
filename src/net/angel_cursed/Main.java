package net.angel_cursed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> questions = new ArrayList<>();
        List<String> response = new ArrayList<>();

        questions.add("How many continents have we ?");
        questions.add("How many days in a year have we ?");
        questions.add("What a book is made of ?");
        questions.add("What is the month of Christmas ?");
        questions.add("What is the capital of Scotland ?");

        response.add("5");
        response.add("365");
        response.add("paper");
        response.add("december");
        response.add("Edinburgh");


        while (true){
            int score = askQuestions(questions, response);
            System.out.println("You have " + score + "/5 good answers");
            boolean replay = askToReplay();
            if (!replay){
                break;
            }
        }

    }

    public static int askQuestions(List<String> questions, List<String> responses){

        Scanner scan = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++){
            System.out.println(questions.get(i));
            String result = scan.next();
            if (result.equals(responses.get(i))){
                System.out.println("Great this is the correct answer");
                score ++;
            }
            else {
                System.out.println("ho sorry the good answer was: " + responses.get(i));
            }
        }
        return score;
    }
    public static boolean askToReplay(){
        System.out.println("Do you want to replay ?");
        Scanner scan = new Scanner(System.in);
        return scan.next().equals("yes");
    }
}
