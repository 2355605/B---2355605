import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int HEART =65;
        int life;
        int result;

        System.out.print("당신은 몇년 사셨나요? ");
        life = keyboard.nextInt();

        result = life * (365 *24 * 60) * HEART;

        System.out.printf("우리 심장은 분당 %d회 박동  합니다.\n", HEART);
        System.out.printf("%d년동안 우리의 심장은 %,d 회 박동  합니다.\n", life, result);
    }
}