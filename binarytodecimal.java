import java.util.*;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  Binary the Number =");
        int a = s.nextInt();
        int b = a;
        int c = 0, d = 0;
        while (b > 0) {
            int r = b % 10;
            b = b / 10;
            d = d + r * (int) Math.pow(2, c++);
        }
        System.out.println("the decimal no is =" + d);
        s.close();
    }
}
