package main;

import models.Student;
import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleInterface {

    private GradeManager gradeManager;
    private Scanner scanner;

    public ConsoleInterface() {
        gradeManager = new GradeManager();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=".repeat(60));
        System.out.println("STUDENT GRADE TRACKER - CONSOLE VERSION");
        System.out.println("=".repeat(60));

        loadSampleData();

        while (true) {
            showMainMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
    case 1:
        addStudentMenu();
        break;
    case 2:
        viewAllStudents();
        break;
    case 3:
        searchStudentMenu();
        break;
    case 4:
        manageGradesMenu();
        break;
    case 5:
        classReportsMenu();
        break;
    case 6:
        System.out.println(gradeManager.generateSummaryReport());
        break;
    case 7:
        sortStudentsMenu();
        break;
    case 8:
        System.out.println("Thank you for using Student Grade Tracker!");
        return;
    default:
        System.out.println("Invalid choice.");
}



            System.out.println();
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        }
    }

    private void showMainMenu() {
        System.out.println("=".repeat(40));
        System.out.println("MAIN MENU");
        System.out.println("=".repeat(40));
        System.out.println("1. Add New Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Manage Grades");
        System.out.println("5. Class Reports");
        System.out.println("6. Summary Report");
        System.out.println("7. Sort Students");
        System.out.println("8. Exit");
        System.out.println("=".repeat(40));
    }

    private void addStudentMenu() {
        System.out.println("--- ADD NEW STUDENT ---");

        String fn = getStringInput("First name: ");
        String ln = getStringInput("Last name: ");
        String cls = getStringInput("Class name: ");

        Student s = gradeManager.addStudent(fn, ln, cls);
        System.out.println("Student added! ID: " + s.getStudentId());
    }

    private void viewAllStudents() {
        System.out.println("--- ALL STUDENTS ---");

        ArrayList<Student> students = gradeManager.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void searchStudentMenu() {
        System.out.println("--- SEARCH STUDENT ---");
        System.out.println("1. By ID");
        System.out.println("2. By Name");

        int c = getIntInput("Choice: ");

        if (c == 1) {
            int id = getIntInput("Student ID: ");
            Student s = gradeManager.findStudent(id);
            if (s != null) displayStudentDetails(s);
            else System.out.println("Student not found.");
        } else if (c == 2) {
            String fn = getStringInput("First name: ");
            String ln = getStringInput("Last name: ");
            Student s = gradeManager.findStudentByName(fn, ln);
            if (s != null) displayStudentDetails(s);
            else System.out.println("Student not found.");
        }
    }

    private void manageGradesMenu() {
        int id = getIntInput("Student ID: ");
        Student s = gradeManager.findStudent(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        while (true) {
            System.out.println("1. Add grade");
            System.out.println("2. Remove grade");
            System.out.println("3. Back");

            int c = getIntInput("Choice: ");

            if (c == 1) {
                double g = getDoubleInput("Grade: ");
                s.addGrade(g);
            } else if (c == 2) {
                int idx = getIntInput("Index (1-based): ") - 1;
                s.removeGrade(idx);
            } else break;
        }
    }

    private void classReportsMenu() {
        ArrayList<String> classes = gradeManager.getAllClassNames();
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i));
        }

        int c = getIntInput("Select class: ") - 1;
        if (c >= 0 && c < classes.size()) {
            System.out.println(gradeManager.generateClassReport(classes.get(c)));
        }
    }

    private void sortStudentsMenu() {
        System.out.println("1. By Name");
        System.out.println("2. By Average");
        System.out.println("3. By Class");

        int c = getIntInput("Choice: ");
        if (c == 1) gradeManager.sortStudentsByName();
        else if (c == 2) gradeManager.sortStudentsByAverage();
        else if (c == 3) gradeManager.sortStudentsByClass();

        viewAllStudents();
    }

    private void displayStudentDetails(Student s) {
        System.out.println("=".repeat(40));
        System.out.println(s);
        System.out.println("Grades: " + s.getGrades());
        System.out.println("=".repeat(40));
    }

    private int getIntInput(String p) {
        System.out.print(p);
        return Integer.parseInt(scanner.nextLine());
    }

    private double getDoubleInput(String p) {
        System.out.print(p);
        return Double.parseDouble(scanner.nextLine());
    }

    private String getStringInput(String p) {
        System.out.print(p);
        return scanner.nextLine();
    }

    private void loadSampleData() {
        Student s1 = gradeManager.addStudent("John", "Smith", "Math");
        s1.addGrade(90); s1.addGrade(80);

        Student s2 = gradeManager.addStudent("Emily", "Brown", "Science");
        s2.addGrade(85); s2.addGrade(92);
    }

    public static void main(String[] args) {
        new ConsoleInterface().start();
    }
}
