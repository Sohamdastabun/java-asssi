public class patternfive {
    public static void main(String[] args) {
        int i, j;
        int p = 'K';
        for (i = 1; i <= 5; i++) {
            System.out.print((char) p + " ");
            for (j = 2; j <= i; j++) {
                System.out.print((char) (p + 3) + " ");
                // j = 3;
                // System.out.println((char) (p + 4) + " ");
                // System.out.println();
                // if (j % 2 == 0) {
                // System.out.print("N");
                // } else {
                // System.out.print("O");
                // }
            }
            System.out.println();
        }
    }
}
