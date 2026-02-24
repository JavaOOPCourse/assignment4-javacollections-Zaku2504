package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 1.9));
        students.add(new Student(3, "Charlie", 3.5));
        students.add(new Student(4, "David", 1.5));
        students.add(new Student(5, "Eve", 4.0));
    }

    public void removeLowGPA() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getGpa() < 2.0) {
                iterator.remove();
            }
        }
    }

    public void findHighestGPA() {
        if (students.isEmpty()) return;
        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }
        System.out.println("Highest GPA: " + topStudent);
    }

    public void insertAtIndex() {
        if (students.size() >= 2) {
            students.add(2, new Student(99, "Frank", 3.2));
        }
    }

    public void printStudents() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
