public class EmployeeTest {
    public static void main(String[] args) {
        Employee test01 = new Employee("test01");
        Employee test02 = new Employee("test02");

        test01.setAge(18);
        test01.setSalary(10000);
        test01.setDesignation("高级程序员");
        test01.printEmployee();

        test02.setAge(19);
        test02.setSalary(8000);
        test02.setDesignation("初级程序员");
        test02.printEmployee();
    }
}
