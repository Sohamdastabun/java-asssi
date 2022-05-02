import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            q.add(i);
        System.out.println("ELEMENTS OF QUEUE =" + q);
        int remove = q.remove();
        System.out.println("Removes  OF QUEUE =" + remove);
        System.out.println(q);
        int head = q.peek();
        System.out.println("HEAD OF QUEUE =" + head);
        int size = q.size();
        System.out.println("SIZE  OF QUEUE =" + size);

    }
}
