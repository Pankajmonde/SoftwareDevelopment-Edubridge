package Scanner;

import java.util.Scanner;

class Student {

    int id;
    String name;
    int sub1, sub2, sub3;
    int total;
    double average, percentage;

    Scanner sc = new Scanner(System.in);

    void input() {

        System.out.println("Enter Student ID:");
        id = sc.nextInt();

        System.out.println("Enter Student Name:");
        name = sc.next();

        System.out.println("Enter Marks for Subject 1:");
        sub1 = sc.nextInt();

        System.out.println("Enter Marks for Subject 2:");
        sub2 = sc.nextInt();

        System.out.println("Enter Marks for Subject 3:");
        sub3 = sc.nextInt();
    }

    void calculate() {

        total = sub1 + sub2 + sub3;
        average = total / 3.0;
        percentage = (total / 300.0) * 100;

    }

    void display() {

        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class StudentMarks {

    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.calculate();
        s.display();
    }
}