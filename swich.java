
import java.util.*;

public class swich {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no :");
        a = s.nextInt();
        System.out.println("Enter the 2nd  no :");
        b = s.nextInt();
        System.out.println(" Chose from ADD,SUB,MUL,DIV :");
        String d = s.next();
       // System.out.println("ARE YOU WANT TO EXIT:");
        // String e = s.next();
        switch (d) {
            case "ADD":
                c = a + b;
                System.out.println("ADDITION IS:" + c);
                break;
            case "SUB":
                c = a - b;
                System.out.println("SUBTRACTION IS:" + c);
                break;
            case "MUL":
                c = a * b;
                System.out.println("MULTIFICATION IS:" + c);
                break;
            case "DIV":
                c = a / b;
                System.out.println("DIVISION IS:" + c);
                break;

            default:
                break;
        }
    }
}
