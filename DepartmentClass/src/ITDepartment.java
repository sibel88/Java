public class ITDepartment extends EmployeeInformation {
    public String skillSet;

    public ITDepartment(String skillSet) {
        super();
        this.skillSet = skillSet;
    }

    public ITDepartment(String employeeName, int employeeId, String employeePosition, double employeeSalary, String skillSet) {
        super(employeeName, employeeId, employeePosition, employeeSalary);
        this.skillSet = skillSet;
    }

    public void employeeSkill(String skill) {
        this.skillSet = skillSet + ", " + skill;

    }

    @Override
    public String toString() {
        return "ITDepartment{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", employeePosition='" + employeePosition + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
