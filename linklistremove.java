import java.util.*;

public class linklistremove { // remove from last position
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(24);
        link.add(26);
        link.add(27);
        link.add(1, 28);
        System.out.println("Linklist =" + link);
        link.remove(1);
        System.out.println("Update linkedlist= " + link);

    }
}
