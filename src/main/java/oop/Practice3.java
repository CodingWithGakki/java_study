package oop;

public class Practice3 {

    public static int method(int m,int n){
        int area=0;
        for (int i = 0; i < m; i++) {
            for (int j=0;j<n;j++){
                area++;
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        return area;

    }

    public static void main(String[] args) {
        int x = method(6,6);
        System.out.println(x);
    }



}
