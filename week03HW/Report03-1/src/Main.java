import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ");
        int a = keyboard.nextInt();

        System.out.print("두번째 숫자를 입력하세요 ");
        int b = keyboard.nextInt();

        int sum = a + b;
        System.out.printf("%d + %d = %d\n", a, b, sum);

        keyboard.close();
    }
}
