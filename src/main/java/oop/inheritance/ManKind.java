package oop.inheritance;

public class ManKind {
    private String sex;
    private int salary;

    public ManKind(String sex ,int salary){
        this.sex=sex;
        this.salary=salary;
    }

    public String getInfo(){
        return "Sex "+sex+",Salary "+salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex.equals("man")){
            System.out.println(1);
        }
        if (sex.equals("woman")){
            System.out.println(0);
        }
    }

    public void employeed(){
        if (salary==0){
            System.out.println("no job");
        }else {
            System.out.println("job");
        }
    }
}
