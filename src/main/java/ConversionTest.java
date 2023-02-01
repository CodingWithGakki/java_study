public class ConversionTest {
    public static void main(String[] args) {
        double d=13.4;
        long l = (long) d;
        System.out.println(l);
        int in=5;
        Object obj="Hello";
        String objString = (String) obj;
        System.out.println(objString);
        Object objPri = new Integer(5);
        String str = (String) objPri;
    }
}
