package me.ahmedbargady.student;

public class Person implements Trackable {
    private String firstName, lastName;
    private static String school = "DataTruc";
    private static int authorizedAbsence = 10;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    public void display(){}
    public int trackSituation(){
        return 0;
    }

    
}
