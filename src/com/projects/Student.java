package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private ArrayList<String> courses = new ArrayList<>();
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;

    // prompt user to enter the name and the year of each students

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("(1 - Freshman. 2 - Sophomore. 3- Junior. 4- Senior)");
        System.out.print("Enter student grade year: ");
        this.gradeYear = scanner.nextInt();
        setStudentID();
        //System.out.println("Student name: " + firstName + " " + lastName + " - Grade: " + gradeYear + " - ID: " + studentID);
    }

    // generate student ID : 5 digit unique ID (grade level + 4 number id)
    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // make students enroll in course
    public void enroll() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter course to enroll (Q to Quit): ");
            String course = scanner.nextLine();
            if (course.equals("Q")) {
                break;
            }
            courses.add(course);
            tuitionBalance = tuitionBalance + costOfCourse;
        }
        System.out.print("Here are the courses you are enrolled in: ");
        for (String s: courses) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("Tution Balance: " + tuitionBalance);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is " + tuitionBalance);
    }

    // pay tuitions
    public void payTuition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your payment: ");
        int payment = scanner.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // show students status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStudent ID:" + studentID +
                "\nGrade Level: " + gradeYear +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
