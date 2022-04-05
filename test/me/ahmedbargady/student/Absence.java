package me.ahmedbargady.student;

import java.time.LocalDate;

public class Absence {
    private LocalDate dateAbsence;
    private boolean justification;

    // Constructor
    public Absence(LocalDate dateAbsence, boolean justification) {
        this.dateAbsence = dateAbsence;
        this.justification = justification;
    }

    // Getters
    public LocalDate getDateAbsence() {
        return dateAbsence;
    }

    public boolean getJustification() {
        return justification;
    }

    // Setters
    public void setDateAbsence(LocalDate dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public void setJustification(boolean justification) {
        this.justification = justification;
    }
}
