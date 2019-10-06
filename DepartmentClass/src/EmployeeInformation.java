public class EmployeeInformation {
    public String employeeName;
    public int employeeId;
    public String employeePosition;
    public double employeeSalary;

    public EmployeeInformation() {
        this.employeeName = "Asude";
        this.employeeId = 23;
        this.employeePosition = "Doctor";
        this.employeeSalary = 500;
    }

    public EmployeeInformation(String employeeName, int employeeId, String employeePosition, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return "EmployeeInformation{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public void changePosition(String newPosition) {
        this.employeePosition = newPosition;
    }

    public void riseSalary(double increase) {
        this.employeeSalary = employeeSalary + increase;
    }
}
