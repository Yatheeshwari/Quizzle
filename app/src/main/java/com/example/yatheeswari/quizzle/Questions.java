package com.example.yatheeswari.quizzle;

public class Questions {
    public String nQuestions[] = {
            "Which is the first planet in the solar system?",
            "Which is the second planet in the solar system?",
            "Which is the third planet in the solar system?",
            "Which is the fourth planet in the solar system?",
            "Which is the fifth planet in the solar system?",
            "Which is the sixth planet in the solar system?",
            "Which is the seventh planet in the solar system?",
            "Which is the eighth planet in the solar system?",
            "Which is the ninth planet in the solar system?"
    };
    private String nChoices [][] = {
            {"Mercury", "Venus", "Saturn","Neptune"},
            {"Mercury", "Venus", "Saturn","Neptune"},
            {"Mercury", "Venus", "Earth","Neptune"},
            {"Mercury", "Venus", "Mars","Neptune"},
            {"Jupiter", "Venus", "Saturn","Neptune"},
            {"Mercury", "Venus", "Saturn","Neptune"},
            {"Mercury", "Uranus", "Saturn","Neptune"},
            {"Mercury", "Venus", "Saturn","Neptune"},
            {"Mercury", "Pluto", "Saturn","Neptune"},
    };
    private String nCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
    public String getQuestion(int a){
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice= nChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = nChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = nChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = nChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer (int a){
        String answer = nCorrectAnswers[a];
        return answer;
    }

    }
