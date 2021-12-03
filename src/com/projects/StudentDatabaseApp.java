package com.projects;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user how many students will be added to the database
        System.out.println("How many students do you want to add ?");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        // create a number of students
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }



    }
}
