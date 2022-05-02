import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int a = s.nextInt();
        int b = a % 2;
        if (b == 0) {
            System.out.println("EVEN Number");
        } else if (b != 0) {
            System.out.println("ODD Number");
        }
        s.close();
    }

}
