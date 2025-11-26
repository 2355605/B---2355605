import java.util.Scanner;

public class Input {
    public static int readData() {
        Scanner keyboard = new Scanner(System.in);
        int radius;

        while (true) {
            System.out.print("원의 반지름 입력 (1 ~ 1000): ");
            radius = keyboard.nextInt();

            if (radius >= 1 && radius <= 1000) {
                return radius;   // 정상 입력 → 반환
            } else {
                System.err.println("ERROR : 1 ~ 1000 사이 값 입력!");
            }
        }
    }
}
