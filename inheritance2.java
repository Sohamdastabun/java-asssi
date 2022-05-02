public class inheritance2 extends inheritance {
    int bounce = 10000;

    public static void main(String[] args) {
        inheritance2 p = new inheritance2();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bounce);
    }
}
// child class acquires propaties of parent class