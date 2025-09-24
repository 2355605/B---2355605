import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int op1;
        int op2;
        float result1;
        float result2;
        float result3;

        System.out.print("첫 번째 수를 입력(분자): ");
        op1 = keyboard.nextInt();
        System.out.print("두 번째 수를 입력(분자): ");
        op2 = keyboard.nextInt();


        result1 = op1 / op2;
        result2 = op1 % op2;
        result3 = (float) op1 / op2;



        System.out.printf("%d를 %d로 나누면 몫 = %d, 나머지 = %d 이다.",op1, op2, result1, result2);
        System.out.printf("%d를 %d로 나누면 = %.1 이다",op1, op2, result3);

    }
}