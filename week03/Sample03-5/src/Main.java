import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        float litter = 0.0f;
        float Km = 0.0f;
        float result = 0.0f;

        System.out.print("소비된 연료량 입력: ");
        litter = keyboard.nextFloat();

        System.out.print("운행한 거리 입력: ");
        Km = keyboard.nextFloat();

        // 계산: Km ÷ L
        result = Km / litter;

        System.out.printf("자동차 소비된 연료 : %.1f Litter\n", litter);
        System.out.printf("자동차 운행 거리 : %.1f Km\n", Km);
        System.out.printf("연비 : %.2f %c\n", result, '\u3392'); // km/L 기호
    }
}
