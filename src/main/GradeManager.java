package main;

import models.Student;
import java.util.*;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 1001;

    public Student addStudent(String fn, String ln, String cls) {
        Student s = new Student(nextId++, fn, ln, cls);
        students.add(s);
        return s;
    }

    public Student findStudent(int id) {
        for (Student s : students)
            if (s.getStudentId() == id) return s;
        return null;
    }

    public Student findStudentByName(String fn, String ln) {
        for (Student s : students)
            if (s.getFirstName().equalsIgnoreCase(fn) &&
                s.getLastName().equalsIgnoreCase(ln))
                return s;
        return null;
    }

    public ArrayList<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public ArrayList<Student> getStudentsByClass(String cls) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student s : students)
            if (s.getClassName().equalsIgnoreCase(cls))
                list.add(s);
        return list;
    }

    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getFullName));
    }

    public void sortStudentsByAverage() {
        students.sort(Comparator.comparingDouble(Student::getAverage).reversed());
    }

    public void sortStudentsByClass() {
        students.sort(Comparator.comparing(Student::getClassName));
    }

    public ArrayList<String> getAllClassNames() {
        HashSet<String> set = new HashSet<>();
        for (Student s : students) set.add(s.getClassName());
        return new ArrayList<>(set);
    }

    public String generateClassReport(String cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("CLASS REPORT: ").append(cls).append("\n");
        for (Student s : getStudentsByClass(cls))
            sb.append(s).append("\n");
        return sb.toString();
    }

    public String generateSummaryReport() {
        return "Total students: " + students.size();
    }
}
