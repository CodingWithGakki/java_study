package oop.inheritance;

public class KidsTest {

    public static void main(String[] args) {
        Kids someKid = new Kids("man",10);
        someKid.setSex("man");
        someKid.setSalary(10);
        someKid.setYearsOld(18);
//        someKid.manOrWoman();
//        someKid.printAge();
//        someKid.employeed();
        System.out.println(someKid.getInfo());;
        ManKind mk = new Kids("man",10);
    }
}
