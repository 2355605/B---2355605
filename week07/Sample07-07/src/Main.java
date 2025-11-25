import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        String result;
        int salary;
        int extra = 0;

        System.out.print("주당 근무 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours > 40) {
            // 기본급 (40시간까지)
            salary = 11500 * 40;
            // 초과 근무 수당 (1.5배)
            extra = (int)(11500 * 1.5 * (hours - 40));
            result = String.format("기본급 %,d원과 초과 수당 %,d원을 합한 총 급여는 %,d원 입니다.",
                    salary, extra, salary + extra);
        } else {
            // 40시간 이하
            salary = 11500 * hours;
            result = String.format("급여는 %,d원 입니다.", salary);
        }

        System.out.printf("%d시간의 아르바이트 급여는 %s\n", hours, result);
        keyboard.close();
    }
}
