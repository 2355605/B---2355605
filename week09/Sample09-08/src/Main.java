public class Main {
    public static void main(String[] args) {
        final int TURTLE = (35 * 1000) / (60 * 60); // 35km/h → m/s
        final int RABBIT = (60 * 1000) / (60 * 60); // 60km/h → m/s
        int turtle = 450;
        int rabbit = 0;
        int i = 1;

        for (; true; i++) {
            turtle += TURTLE;
            rabbit += RABBIT;

            if (rabbit > turtle) {   // fixed condition syntax
                System.out.printf("i = %d\n", i);
                break;               // stop when rabbit passes turtle
            }

            System.out.printf("%d초후 토끼: %,d m, 거북: %d m\n", i, rabbit, turtle);
        }

        System.out.printf("%d초후 토끼: %,d m, 거북: %d m\n", i, rabbit, turtle);
    }
}
