package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + name +
                ", Marks=" + marks;
    }
}

public class StudentHashMapDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> map = new HashMap<>();

        int choice;

        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, marks);
                    map.put(id, s);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (map.isEmpty()) {
                        System.out.println("No Records Found!");
                    } else {
                        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Search: ");
                    int searchId = sc.nextInt();

                    if (map.containsKey(searchId)) {
                        System.out.println(map.get(searchId));
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(updateId)) {
                        Student st = map.get(updateId);

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Marks: ");
                        double newMarks = sc.nextDouble();

                        st.setName(newName);
                        st.setMarks(newMarks);

                        System.out.println("Student Updated!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to Delete: ");
                    int deleteId = sc.nextInt();

                    if (map.remove(deleteId) != null) {
                        System.out.println("Student Deleted!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}