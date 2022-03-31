package me.ahmedbargady.student;

import java.time.LocalDate;

public class TestSchool {
    public static void main(String[] args) {
        // Partie 1:
        Student s1 = new Student("Youssef", "A", 'A');
        Student s2 = new Student("Mohammed", "A", 'B');
        Student s3 = new Student("Mouna", "A", 'A');

        Professor p1 = new Professor("Ahmed", "B", 12, 60, "Computer Science");
        Professor p2 = new Professor("Imane", "A", 32, 80, "Communication");

        Absence a3 = new Absence(LocalDate.of(2018, 11, 26), false);
        s1.addAbsence(new Absence(LocalDate.of(2018, 12, 03), false));
        s1.addAbsence(new Absence(LocalDate.of(2018, 11, 28), false));
        s3.addAbsence(a3);

        // Parite 2:
        // check Student, Professor and AbsenceException classes

        // Partie 3:
        try {
            s3.justify(a3, "");
            // s3.justify(a3, "Participation à une journée sprotive");
        } catch (AbsenceException e) {
            System.out.println(e.toString());
        }

        String studentAvecLePlusAbsence = "";
        int maxAbsenceNbr = 0;
        Student[] studentsList = { s1, s2, s3 };

        for (Student student : studentsList) {
            if (student.getAllAbsences().size() > maxAbsenceNbr) {
                maxAbsenceNbr = student.getAllAbsences().size();
                studentAvecLePlusAbsence = student.getFirstName() + " " + student.getLastName();
            }
        }
        System.out.println("Student with the most absences: " + studentAvecLePlusAbsence);

    }
}
