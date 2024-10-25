import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Employee implements Comparable<Employee> {
    private String id;
    private String name;
    private Date birthDate;
    private double performanceScore;
    private double responsibilityScore;

    public Employee(String id, String name, String birthDate, double performanceScore, double responsibilityScore) throws ParseException {
        this.id = id;
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.birthDate = sdf.parse(birthDate);
        this.performanceScore = performanceScore;
        this.responsibilityScore = responsibilityScore;
    }

    public double getPerformanceScore() {
        return performanceScore;
    }

    public double getResponsibilityScore() {
        return responsibilityScore;
    }

    @Override
    public int compareTo(Employee other) {
        int performanceComparison = Double.compare(this.performanceScore, other.performanceScore);
        if (performanceComparison == 0) {
            return Double.compare(this.responsibilityScore, other.responsibilityScore);
        }
        return performanceComparison;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %s %s %.1f %.1f", id, name, sdf.format(birthDate), performanceScore, responsibilityScore);
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String id = String.format("NS%03d", i + 1);
            String name = scanner.nextLine();
            String birthDate = scanner.nextLine();
            double performanceScore = Double.parseDouble(scanner.nextLine());
            double responsibilityScore = Double.parseDouble(scanner.nextLine());

            try {
                Employee employee = new Employee(id, name, birthDate, performanceScore, responsibilityScore);
                if (employee.getPerformanceScore() < 6 && employee.getResponsibilityScore() < 60) {
                    employees.add(employee);
                }
            } catch (ParseException e) {
                System.out.println("Error parsing date: " + e.getMessage());
            }
        }

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scanner.close();
    }
}