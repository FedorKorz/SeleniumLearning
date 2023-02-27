package oop;

public class Pyramid {

    public static void main(String[] args) {
        int border = 0;
        int val = 0;
        for (int row = 4; row > 0; row--) {
            for (int i = 0; i <= 5; i++) {
                i = i + border;
                val++;
                System.out.print(val);
            }
            System.out.println("");
            border++;
        }
    }
}
