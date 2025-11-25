import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int degree;
        float result;
        System.out.print("섭씨온도 입력 : ");
        degree = keyboard.nextInt();
        result = degree * (9.0f / 5) + 32;

        System.out.printf( "섭씨 온도 : %d\u2103, 화씨 온도 : %.1f\u2109. \n", degree, result);

    }
}