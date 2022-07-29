import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String id = "123,456,345,167";
        for (String each:
             id.split(",")) {
            System.out.println(each);

        }
        //String str = "";
        //String[] split = id.split(",");
        //for (int i = 0; i < split.length; i++) {
        //    System.out.println(str);
        //    str = str + split[i] + "\",\"";
        //    System.out.println(str);
        //}
        //str=str.substring(0,str.lastIndexOf(","));
        //String res = "[\"" + str + "]";
        //System.out.println(res);


    }
}