package oop.inheritance;

public class Kids extends ManKind{
    private int yearsOld;

    public Kids(String sex, int salary) {
        super(sex, salary);
    }

    public void printAge(){
        System.out.println(yearsOld);
    }


    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getInfo(){
        return super.getInfo()+"yearsOld "+yearsOld;
    }

    public void employeed(){
        System.out.println("kid should study and no job");
    }
}
