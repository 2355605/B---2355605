public class Main {
    public static void main(String[] args) {
        final int YEAR = 365;
        final long SPEED = 300000;  // long, чтобы избежать переполнения
        long second;
        long result;

        second = YEAR * 24L * 60 * 60; // добавлено L, чтобы расчёт был в long
        result = second * SPEED;

        System.out.printf("빛의 속도 : %,d Km/Sec\n", SPEED);
        System.out.printf("빛의 %d년동안 간 거리 : %,d Km\n", YEAR, result);
        System.out.printf("%d년은 %,d 초 입니다.\n", YEAR, second);
    }
}
