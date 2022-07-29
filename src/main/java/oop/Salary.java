package oop;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String adress, int number, double salary) {
        super(name, adress, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Salary 类的mailCheck方法");
        System.out.println("邮寄支票给 " + getName() + "， 工资为：" + salary);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePar() {
        System.out.println("计算高工资，付给" + getName());
        return salary / 52;
    }
}
