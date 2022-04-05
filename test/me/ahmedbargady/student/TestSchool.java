package me.ahmedbargady.student;

import java.time.LocalDate;

public class TestSchool {
    public static void main(String[] args) {
        // students
        Student s1 = new Student("Youssef", "A", 'A');
        Student s2 = new Student("Mohammed", "A", 'B');
        Student s3 = new Student("Mouna", "A", 'A');
        // Professors
        Professor p1 = new Professor("Ahmed", "B", 60, 12, "Computer Science");
        Professor p2 = new Professor("Imane", "A", 80, 32, "Communication");
        // Absences
        Absence a1 = new Absence(LocalDate.of(2018, 12, 03), false);
        Absence a2 = new Absence(LocalDate.of(2018, 11, 28), false);
        Absence a3 = new Absence(LocalDate.of(2018, 11, 26), false);
        // Add Absences
        s1.addAbsence(a1);
        s1.addAbsence(a2);
        s3.addAbsence(a3);
        // Justify Mouna Absence
        try {
            s3.justify(a3, "Participation à une journée sprotive");
        } catch (AbsenceException e) {
            System.out.println(e.toString());
        }
        // Max Absences
        String student_max_absences_name = "";
        int nbr_max_absences = 0;
        Student[] l = { s1, s2, s3 };
        for (Student s : l) {
            if (s.getAllAbsences().size() > nbr_max_absences) {
                nbr_max_absences = s.getAllAbsences().size();
                student_max_absences_name = s.getFirstName();
            }
        }
        System.out.println(student_max_absences_name);
    }
}
