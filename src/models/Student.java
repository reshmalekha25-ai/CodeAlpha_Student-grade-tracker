package models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Double> grades;
    private String className;

    public Student(int studentId, String firstName, String lastName, String className) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.grades = new ArrayList<>();
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    // Grade management methods
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
    }

    public void removeGrade(int index) {
        if (index >= 0 && index < grades.size()) {
            grades.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid grade index");
        }
    }

    public void updateGrade(int index, double newGrade) {
        if (index >= 0 && index < grades.size()) {
            if (newGrade >= 0 && newGrade <= 100) {
                grades.set(index, newGrade);
            } else {
                throw new IllegalArgumentException("Grade must be between 0 and 100");
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid grade index");
        }
    }

    // Grade calculations
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public double getHighestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public double getLowestGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public int getGradeCount() {
        return grades.size();
    }

    // Grade distribution
    public int getGradeCountInRange(double min, double max) {
        int count = 0;
        for (double grade : grades) {
            if (grade >= min && grade <= max) {
                count++;
            }
        }
        return count;
    }

    public String getLetterGrade() {
        double average = getAverage();
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Class: %s | Grades: %d | Average: %.2f | Letter Grade: %s",
                studentId, getFullName(), className, getGradeCount(), getAverage(), getLetterGrade());
    }
}
