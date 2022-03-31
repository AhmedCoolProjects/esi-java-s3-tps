package me.ahmedbargady.student;

import java.util.ArrayList;

public class Student extends Person {
    private char groupe;
    private ArrayList<Absence> AllAbsences = new ArrayList<Absence>();

    public Student(String firstName, String lastName, char groupe) {
        super(firstName, lastName);
        this.groupe = groupe;
    }

    public char getGroupe() {
        return groupe;
    }

    public void setGroupe(char groupe) {
        this.groupe = groupe;
    }

    public void setAllAbsences(ArrayList<Absence> AllAbsences) {
        this.AllAbsences = AllAbsences;
    }

    public ArrayList<Absence> getAllAbsences() {
        return AllAbsences;
    }

    public boolean justify(Absence a, String reason)
            throws AbsenceException {
        if (reason == "") {
            throw new AbsenceException();
        } else {
            // get a from allAbsences
            int indexOfAbsence = AllAbsences.indexOf(a);
            AllAbsences.get(indexOfAbsence).setJustification(true);
            return true;
        }
    }

    public void addAbsence(Absence a) {
        this.AllAbsences.add(a);
    }

    public int trackSituation() {
        return 0;
    }
}
