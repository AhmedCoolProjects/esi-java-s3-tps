package me.ahmedbargady.student;

public class Professor extends Person {
    private int teachingHours, objectif;
    private String speciality;

    public Professor(String firstName, String lastName, 
    int teachingHours, int objectif, String speciality) {
        super(firstName, lastName);
        this.teachingHours = teachingHours;
        this.objectif = objectif;
        this.speciality = speciality;
    }

    public int getTeachingHours() {
        return teachingHours;
    }
    public int getObjectif() {
        return objectif;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }
    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public int trackSituation(){
        return 0;
    }


}
