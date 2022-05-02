import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        boolean result = stk.empty();
        System.out.println("is the stack empty ? " + result);
        stk.push(10);
        stk.push(19);
        stk.push(90);
        stk.push(100);
        System.out.println("Element in stack =" + stk);
        result = stk.empty();
        System.out.println("is the stack empty ?" + result);
        stk.pop();
        System.out.println("pop element = " + stk);
    }
}
