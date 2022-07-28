package oop;

public class JavaBean {
    private String name;
    private int age;
    public JavaBean(){

    }
    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age =a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
