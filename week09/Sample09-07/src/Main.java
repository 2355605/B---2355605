public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 1) {
                sum += i;
            } else {
                // nothing
            }
        }

        System.out.printf("2 + 4 + ... + 100 = %,d\n", sum);
    }
}
