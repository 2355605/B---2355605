import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age, salary;
        boolean debt, result;

        System.out.println("**** 논리(Logic) 수식 연습 1-2 ****\n");
        System.out.print("나이 입력 : ");
        age = keyboard.nextInt();
        System.out.print("년봉 입력 : ");
        salary = keyboard.nextInt();
        System.out.print("빚이 있으면 true, 없으면 false 입력 : ");
        debt = keyboard.nextBoolean();

        result = (age >= 25 && age < 40) && (salary >= 5000) && (debt == true);

        System.out.printf("결과 : %b\n", result);
    }
}
