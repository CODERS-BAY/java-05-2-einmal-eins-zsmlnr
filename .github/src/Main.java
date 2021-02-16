public class Main {
    public static void main(String[] args) {

        int a = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + a + "=" + i * a);
        }
        for (int i = 1; i <= 10; i++) {
            for (int d = 1; d <= 10; d++) {
                System.out.println(i + "x" + d + "=" + i * d);
            }
        }

    }
}
