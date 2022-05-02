import java.util.*;

public class linklist { // insert & delete element
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(25);
        link.add(89);
        link.add(1, 68);
        link.add(2, 90);
        System.out.println("Linklist :" + link);
        link.add(1, 132);
        System.out.println("update linklist : " + link);
        link.remove(2);
        System.out.println("update after delete :" + link);

    }
}
