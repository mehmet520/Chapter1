package ReviewQuestion;

public class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Object two = new Employee();
        ((Employee) two).employeeId = 101;
        if (one.equals(two)) System.out.println("Success");
        else System.out.println("Failure");
    }

    @Override
    public int hashCode() {
        return employeeId;
    }

    public boolean equals(Object e) {
        Employee ex = (Employee) e;
        return this.employeeId == ex.employeeId;
    }
}