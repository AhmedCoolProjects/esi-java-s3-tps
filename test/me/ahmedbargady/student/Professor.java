package me.ahmedbargady.student;

public class Professor extends Person {
    private int teachingHours;
    private int objectif;
    private String speciality;

    // Constructor
    public Professor(String firstName, String lastName,
            int objectif, int teachingHours, String speciality) {
        super(firstName, lastName);
        this.objectif = objectif;
        this.teachingHours = teachingHours;
        this.speciality = speciality;
    }

    // Getters
    public int getTeachingHours() {
        return teachingHours;
    }

    public int getObjectif() {
        return objectif;
    }

    public String getSpeciality() {
        return speciality;
    }

    // Setters
    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Methods
    public int trackSituation() {
        return objectif - teachingHours;
    }
}
