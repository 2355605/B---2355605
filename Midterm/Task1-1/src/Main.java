import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y, z;
        boolean result;


        System.out.println("**** 논리(Logic) 수식 연습 1-1 ****\n");

        System.out.print("x 입력 : ");
        x = keyboard.nextInt();
        System.out.print("y 입력 : ");
        y = keyboard.nextInt();
        System.out.print("z 입력 : ");
        z = keyboard.nextInt();

        result = (x >= 10 && x <= 20) || (y >= 10 && y <= 20) || (z >= 10 && z <= 20);

        System.out.printf("결과 : %b\n", result);
    }
}