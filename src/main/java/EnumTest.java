public class EnumTest {
    public static void main(String[] args) {
        FreshJuice freshJuice = new FreshJuice();
        freshJuice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(freshJuice.size);
    }
}

class FreshJuice {
//    定义枚举数据
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}

    FreshJuiceSize size;
}
