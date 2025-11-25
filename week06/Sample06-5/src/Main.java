import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int MPS = 340;
        float fighter;
        int temp;
        int result;

        System.out.print("전투기 스피는 입력 : ");
        fighter = keyboard.nextInt();

        temp = 365 * 24 * 60 * 60 * MPS;
        result = (int) (temp / 1000);

        System.out.printf("미하 %.1f인 전투기의 1년  간 거리는  %,d Km 입니다.\n", fighter, result);
    }
}
