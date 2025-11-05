package com.example.hibernateapp;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        // 1️⃣ CREATE
        Student s1 = new Student("Nandini Agarwal", "Computer Science", 88.5);
        dao.addStudent(s1);

        // 2️⃣ READ - All
        List<Student> students = dao.getAllStudents();
        System.out.println("\n📚 All Students:");
        students.forEach(System.out::println);

        // 3️⃣ READ - Single
        Student found = dao.getStudentById(1);
        System.out.println("\n🔍 Found Student: " + found);

        // 4️⃣ UPDATE
        if (found != null) {
            found.setMarks(92.3);
            dao.updateStudent(found);
        }

        // 5️⃣ DELETE
        dao.deleteStudent(2); // assuming a student with ID 2 exists

        // Close SessionFactory
        HibernateUtil.getSessionFactory().close();
    }
}
