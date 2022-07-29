

public class StringStudy {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(120);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8,"java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);

        StringBuffer buffer = new StringBuffer("hello world");
        buffer.append("!");
        System.out.println(buffer);

    }
}
