package edu.neu.mgen;


import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentID;
    private String firstName;
    private String lastName;

    // Constructor
    public Student(int studentID, String firstName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    // toString method to display student details
    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + firstName + " " + lastName;
    }
}

class EngClass {
    private List<Student> students;

    // Constructor
    public EngClass() {
        students = new ArrayList<>();
    }

    // Method to add student to the class
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to delete student from the class
    public void deleteStudent(int studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                break;
            }
        }
    }

    // Method to display list of students in the class
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the class.");
        } else {
            System.out.println("List of students in the class:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student(1, "Adhya", "Sathish");
        Student student2 = new Student(2, "Harshika", "Sathish");
        Student student3 = new Student(3, "Noodhan", "Gowrishankar");
        Student student4 = new Student(4, "Pooja", "Saisivaraman");
        Student student5 = new Student(5, "Lokanya", "Gowrishankar");
        Student student6 = new Student(6, "Vamshika", "Sathish");

        // Creating engineering class
        EngClass engineeringClass = new EngClass();

        // Adding students to the class
        engineeringClass.addStudent(student1);
        engineeringClass.addStudent(student2);
        engineeringClass.addStudent(student3);
        engineeringClass.addStudent(student4);
        engineeringClass.addStudent(student5);
        engineeringClass.addStudent(student6);

        // Displaying list of students
        engineeringClass.displayStudents();

        // Deleting a student from the class
        engineeringClass.deleteStudent(2);

        // Displaying updated list of students
        engineeringClass.displayStudents();

        Student student7 = new Student(7, "Varshetha", "Manikandan");
        engineeringClass.addStudent(student7);

        engineeringClass.displayStudents();


    }
}
