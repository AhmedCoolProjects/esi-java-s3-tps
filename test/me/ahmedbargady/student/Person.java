package me.ahmedbargady.student;

public class Person implements Trackable {
    // Attributes
    private String firstName;
    private String lastName;
    private static String school = "DataTruc";
    private static int authorizedAbsence = 10;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchool() {
        return school;
    }

    public int getAuthorizedAbsence() {
        return authorizedAbsence;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Methods
    public int trackSituation() {
        return 0;
    }

    public void display() {
    }
}
