package oop;

public class Students {
    // Fields
    private String idStudent;
    private String nameStudent;
    private String dateOfBirth;
    private double grade;

    // Constructor
    public Students(String idStudent, String nameStudent, String dateOfBirth, double grade) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    // Getters
    public String getIdStudent() {
        return idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 10) { // Validate grade
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Must be between 0 and 10.");
        }
    }

    // Display student information
    public void displayStudentInfo() {
        System.out.println(this.toString());
    }

    // toString method
    @Override
    public String toString() {
        return "Student Information:\n" +
                "ID: " + idStudent + "\n" +
                "Name: " + nameStudent + "\n" +
                "Date of Birth: " + dateOfBirth + "\n" +
                "Grade: " + grade + "\n";
    }
}
