import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Vector;

public class ArrayStudy {
    public static void main(String[] args) {
        int arrs[] = {4, 6, 7, 9, 6, 4, 7, 8, 9, 12};
        Arrays.sort(arrs);
        for (int i = 0; i < arrs.length; i++) {
//            System.out.println(arrs[i]);
        }
        Vector<Object> v = new Vector<>();
        v.addElement(new Integer(85));
        v.addElement(new Integer(98));
        v.addElement(new Integer(66));
        v.addElement(new Integer(99));
        System.out.println(v.elementAt(1));
        v.sort(null);
        System.out.println(v.elementAt(1));


    }

    /**
     * 判断成绩等级
     *
     * @param grade
     * @param max_score
     */
    public static void grade_match(int grade, int max_score) {
        if (grade >= max_score - 10) {
            System.out.println("A");
        } else if (grade >= max_score - 20) {
            System.out.println("B");
        } else if (grade >= max_score - 30) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }


}
