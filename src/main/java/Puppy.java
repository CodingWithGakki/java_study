public class Puppy {
int puppyAge;
public Puppy (String name){
    System.out.println("这只小狗的名字叫："+name);
}
    public int getPuppyAge() {
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        System.out.println(puppyAge);
        this.puppyAge = puppyAge;
    }

    public static void main(String[] args) {
        Puppy tom = new Puppy("Tom");
        tom.setPuppyAge(3);
        tom.getPuppyAge();
        System.out.println(tom.puppyAge);

    }
}
