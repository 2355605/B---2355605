import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        boolean result;

        System.out.println("**** 논리(Logic) 수식 연습 1-4 ****\n");
        System.out.print("점수 입력 : ");
        score = keyboard.nextInt();

        result = (score >= 80 && score < 90) || (score == 100);

        System.out.printf("결과 : %b\n", result);
    }
}