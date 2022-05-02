import java.util.*;

public class primeno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No =");
        int a = s.nextInt();
        int b = 0;
        for (int i = 3; i <= a - 1; i++) {

            if (a % i == 0) {
                b = b + 1;
            }
        }

        if (b == 0) {

            System.out.println(a + "is  prime ");
        } else {
            System.out.println(a + "is not prime");
        }

        s.close();

    }
}
