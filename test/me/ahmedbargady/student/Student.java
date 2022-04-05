package me.ahmedbargady.student;

import java.util.ArrayList;

public class Student extends Person {
    private char groupe;
    private ArrayList<Absence> allAbsences = new ArrayList<Absence>();

    // Constructor
    public Student(String firstName, String lastName,
            char groupe) {
        super(firstName, lastName);
        this.groupe = groupe;
    }

    // Getters
    public char getGroupe() {
        return groupe;
    }

    public ArrayList<Absence> getAllAbsences() {
        return allAbsences;
    }

    // Setters
    public void setGroupe(char groupe) {
        this.groupe = groupe;
    }

    public void setAllAbsences(ArrayList<Absence> allAbsences) {
        this.allAbsences = allAbsences;
    }

    // Methods
    public boolean justify(Absence a, String reason) throws AbsenceException {
        if (reason == "") {
            throw new AbsenceException();
        } else {
            a.setJustification(true);
            return true;
        }
    }

    public void addAbsence(Absence a) {
        allAbsences.add(a);
    }

    // Override
    public int trackSituation() {
        int nbr_absences_autorise_restant = this.getAuthorizedAbsence();
        for (Absence a : allAbsences) {
            if (!a.getJustification()) {
                nbr_absences_autorise_restant -= 1;
            }
        }
        return nbr_absences_autorise_restant;
    }
}
