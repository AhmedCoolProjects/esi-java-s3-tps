package me.ahmedbargady.student;

import java.time.LocalDate;

public class Absence {
    private LocalDate dateAbsence;
    private boolean justification;

    public Absence(LocalDate dateAbsence, boolean justification) {
        this.dateAbsence = dateAbsence;
        this.justification = justification;
    }

    public LocalDate getDateAbsence() {
        return dateAbsence;
    }
    public boolean isJustification() {
        return justification;
    }
    public void setDateAbsence(LocalDate dateAbsence) {
        this.dateAbsence = dateAbsence;
    }
    public void setJustification(boolean justification) {
        this.justification = justification;
    }
}
