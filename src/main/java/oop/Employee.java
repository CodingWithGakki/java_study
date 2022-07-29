package oop;

import java.util.ArrayDeque;

public class Employee {
    private String name;
    private String adress;
    private int number;

    public Employee(String name, String adress, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.adress = adress;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("邮寄支票给：" + this.name + " " + this.adress);
    }

    public String toString() {
        return name + " " + adress + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String newAdress) {
        adress = newAdress;
    }

    public int getNumber() {
        return number;
    }


}
