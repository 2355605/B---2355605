public class Main {
    public static void main(String[] args) {
        final int RADIUS = 6378137;
        final double PI = 3.141592;
        final int KOREA = 99720;
        double temp;
        double result;

        long surface;

        temp = 4 * PI * RADIUS * RADIUS;
        surface = (long) (temp / 1000000);
        result = ((double) KOREA / surface) * 100;

        System.out.printf("지구의 반지름: %,d m\n", RADIUS);
        System.out.printf("지구의 표면적 : %,d \u33A2\n", surface);
        System.out.printf("대한민국의 넓이는 : %,d \u33A2\n", KOREA);
        System.out.printf("대한민국은 지구의 %.0f %%입니다.\n", result);
    }
}
