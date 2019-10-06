public class ITDepartmentTest {
    public static void main(String[] args) {
        ITDepartment myEmployee = new ITDepartment("Asude", 123, "Compueter Network", 250.000, "QA TESTER");
        System.out.println(myEmployee.toString());
        myEmployee.employeeSkill("Ruby on Rail");
        System.out.println(myEmployee.toString());
        myEmployee.riseSalary(2000);
        System.out.println(myEmployee.toString());


    }
}
