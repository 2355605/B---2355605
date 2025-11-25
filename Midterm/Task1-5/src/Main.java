import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, score;
        String result;

        System.out.println("**** 논리(Logic) 수식 연습 1-5 ****\n");
        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("점수 입력 : ");
        score = keyboard.nextInt();

        result = (age >= 18 && score >= 80) ? "합격" :
                (age < 18 || score < 50) ? "불합격" : "재시험";

        System.out.printf("결과 : %s\n", result);
    }
}
