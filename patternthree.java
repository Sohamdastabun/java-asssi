public class patternthree {
    public static void main(String[] args) {
        int i;
        int j;
        int p;
        for (i = 1, p = 'K'; i <= 4; i++) {
            System.out.print((char) p + " ");
            for (j = 2; j <= i; j++) {

                System.out.print((char) (p + 3) + " ");
                for (j = 3; j <= i; j++) {
                    System.out.print((char) (p + 4) + " ");
                    for (j = 4; j <= i; j++) {
                        System.out.print((char) (p + 12) + " ");

                    }

                }

            }

            System.out.println();

        }
        for (i = 1, p = 'K'; i >= 0; i--) {
            System.out.print((char) p + " ");
            for (j = 0; j <= i; j++) {
                System.out.print((char) (p + 3) + " ");
                for (j = 1; j <= i; j++) {
                    System.out.print((char) (p + 4) + " ");

                }

            }
            System.out.println();
        }
        System.out.print((char) p + " ");
    }
}
