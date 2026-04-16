package com.example;

public class App {

    // Method to calculate grade
    public String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {

        App app = new App();

        // Hardcoded values (best for Jenkins)
        String name = "Sanjai";
        int marks = 85;

        String grade = app.calculateGrade(marks);

        System.out.println("----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
