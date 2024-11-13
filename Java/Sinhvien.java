import java.util.Scanner;

public class Sinhvien {
    private String name;
    private String classID;
    private String dateOfBirth;
    private Double gpa;

    public Sinhvien(String name, String classID, String dateOfBirth, Double gpa) {
        this.name = name;
        this.classID = classID;
        this.dateOfBirth = dateOfBirth;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SV001 " + name + " " + classID + " " + dateOfBirth + " " + String.format("%.2f", gpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter student details:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class ID: ");
            String classID = sc.nextLine();
            System.out.print("Date of Birth: ");
            String dob = sc.nextLine();
            System.out.print("GPA: ");
            Double gpa = sc.nextDouble();
            
            Sinhvien s = new Sinhvien(name, classID, dob, gpa);
            System.out.println(s);
        } finally {
            sc.close();
        }
    }
}