import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int r;
        double volume;
        double surface;
        final double PI = 3.141592;

        System.out.print("구의 반지름 입력 (정수) : ");
        r = keyboard.nextInt();

        if (r > 0) {
            volume = (4.0 / 3.0) * PI * r * r * r;
            surface = 4.0 * PI * r * r;

            System.out.printf("반지름이 %d인 구의 부피 : %.2f\n", r, volume);
            System.out.printf("반지름이 %d인 구의 표면적 : %.2f\n", r, surface);
        } else {
            System.err.println("ERROR : 반지름은 양수여야 합니다.");
        }

        keyboard.close();
    }
}
