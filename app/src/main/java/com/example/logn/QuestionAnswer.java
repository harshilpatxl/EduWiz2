package com.example.logn;

public class QuestionAnswer {

    public static String question[] ={
            "How often do you feel stressed or overwhelmed?",
            "How comfortable do you feel talking about your feelings and emotions?",
            "How often do you experience symptoms of anxiety (e.g., racing heart, difficulty breathing)?",
            "Do you feel supported by friends and/or family when dealing with challenges?",
            "How often do you feel sad or hopeless?"
    };

    public static String choices[][] = {
            {"Rarely","Sometimes","Often","Always"},
            {"Very Comfortable","Comfortable","Less Comfortable","Not comfortable"},
            {"Constantly","Frequently","Occasionally","Never"},
            {"Always","Most of time","Rarely","Never"},
            {"Rarely","Sometimes","Often","Always"}
    };

    public static int correctAnswers[] = {4,3,2,1};

}