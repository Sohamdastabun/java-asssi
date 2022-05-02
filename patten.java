
import java.util.*;

public class patten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the No -");

        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();

    }
}